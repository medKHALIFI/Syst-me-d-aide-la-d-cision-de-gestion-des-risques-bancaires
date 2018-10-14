
/**
 *
 * @author Joker
 */
package pfe_16;

public class AlgorithmesGenetiques implements AlgorithmesGenetiquesOptimisation{
    private int populationSize;
    private int noNodes;
    
    
    
    private double mutationRatio;
    private Chromosome[] population;
    private int dist[][];
    private double fitness[];
    
    private int[] bestSoFarTour;
    private int iteration;


    public AlgorithmesGenetiques(int populationSize, int noNodes, double mutationRatio){
        this.populationSize = populationSize;
        this.noNodes = noNodes;
        this.mutationRatio = mutationRatio;
        population = new Chromosome[populationSize];
        dist = new int[noNodes][noNodes];
        for(int i = 0; i < populationSize; i++){
            population[i] = new Chromosome(noNodes, dist);
        }

        fitness = new double[populationSize];
        bestSoFarTour = new int[noNodes+1];
        for(int i = 0; i < noNodes; i++)
            bestSoFarTour[i] = i;
        bestSoFarTour[noNodes] = 0;
        iteration = 0;

    
    }
    
    public Chromosome getChromosome(int idx){
        return population[idx];
    }
    public void setIteration(int iter){
        iteration = iter;
    }
    public int getIteration(){
        return iteration;
    }
    public void initPopulation(){
        for(int i = 0; i < populationSize; i++){
            population[i].shuffle();
        }
    }
    public int getDistance(int i, int j){
        return dist[i][j];
    }
    public void setDistance(int i, int j, int d){
        dist[i][j] = d;
    }
    public double getMutationRatio(){
        return mutationRatio;
    }
    public int getNoNodes(){
        return noNodes;
    }
    public int getPopulationSize(){
        return populationSize;
    }
    public void setMutationRatio(double mr){
        mutationRatio = mr;
    }
    public void setNoNodes(int n){
        noNodes = n;
    }
    public void setPopulationSize(int ps){
        populationSize = ps;
    }
    public void updateBestSoFarTour(){
    
        
        for(int i = 0; i < populationSize; i++){
            if(computeTourLength(bestSoFarTour) > population[i].getCost()){
                for(int j = 0; j < noNodes+1; j++)
                    bestSoFarTour[j] = population[i].getGene(j);
            }

        }
    }
    public int[] getBestTour(){
        sortPopulationAscending(population);
        return population[0].getTour();
    }
    public int getBestTourLength(){
        return computeTourLength(getBestTour());
    }
    public int computeTourLength(int tour[]){
          int len = 0;
        
        
        for(int i = 0; i < noNodes; i++){
            len+=dist[tour[i]][tour[i+1]];
        }
        return len;
    }
    @Override
    public String toString(){
        String str = "";
        for(int i = 0; i < populationSize; i++)
            str+=population[i].toString()+"{"+population[i].getCost()+"}"+"\n";
        return str;
    }
    public void stepGeneration(){
        Chromosome[] newPopulation = new Chromosome[2*populationSize];//
        int newPopulationSize = 0;
        sortPopulationDescending(population);
        computeFitness();

    
//  Copier population initiale dans la NV population
        for(int i = 0; i < populationSize; i++){
            newPopulation[i] = new Chromosome(noNodes, dist);
            for(int j = 0; j < noNodes+1; j++){
                newPopulation[i].setGene(j, population[i].getGene(j));
            }
            newPopulationSize++;
        }
        double sumFitness = 0.0;
        for(int i = 0; i < populationSize; i++)
            sumFitness += fitness[i];
        while(newPopulationSize < 2*populationSize){
            // Sélectionnez 2 chromosomes combinaison
   Chromosome offspring1, offspring2;
  offspring1 = new Chromosome(noNodes,dist);
  offspring2 = new Chromosome(noNodes,dist);

            double prob = new java.util.Random().nextDouble()*sumFitness;

            int idx1 = 0;
            double sum = fitness[0];
            while(sum < prob){
                idx1++;
                sum+=fitness[idx1];
            }
            prob = new java.util.Random().nextDouble()*sumFitness;
            // select 2eme parent 
            int idx2 = 0;
            sum = fitness[0];
            while(sum < prob){
                idx2++;
                sum+=fitness[idx2];
            }
            population[idx1].crossover(population[idx2], offspring1, offspring2);
            newPopulation[newPopulationSize] = offspring1;
            newPopulationSize++;
            if(newPopulationSize >= newPopulation.length)
                break;
            newPopulation[newPopulationSize] = offspring2;
            newPopulationSize++;

        }


        mutatePopulation(newPopulation);
        sortPopulationAscending(newPopulation);
        for(int i = 0; i < populationSize; i++)
            population[i] = newPopulation[i];
        sortPopulationAscending(population);
        updateBestSoFarTour();
    }
    public void computeFitness(){
        double selectionPressure = 2.0;
        for(int i = 0; i < populationSize; i++){
            double fit = 2-selectionPressure+2*(selectionPressure-1)*(i)/(populationSize-1);
            fitness[i] = fit;
        }
    }
    public void mutatePopulation(Chromosome[] pop){
        for(int i = 0; i < pop.length; i++){
            if(Math.random() < mutationRatio)
                pop[i].mutate();
        }
    }

    

// trie decroissantde la population 
    
public void sortPopulationAscending(Chromosome[] pop){
        boolean gata = false;

        while(!gata){
            gata = true;
            for(int i = 0; i < pop.length-1; i++){
                if(pop[i].getCost() > pop[i+1].getCost()){
                    Chromosome swap = pop[i];
                    pop[i] = pop[i+1];
                    pop[i+1] = swap;
                    gata = false;
                }
            }
        }
    }
public void sortPopulationDescending(Chromosome[] pop){
        boolean gata = false;
        while(!gata){
            gata = true;
            for(int i = 0; i < pop.length-1; i++){
                if(pop[i].getCost() < pop[i+1].getCost()){
                    Chromosome swap = pop[i];
                    pop[i] = pop[i+1];
                    pop[i+1] = swap;
                    gata = false;
                }
            }
        }
    }
public int[] getBestSoFarTour(){
        return bestSoFarTour;
    }
public int getBestSoFarTourLength(){
        return computeTourLength(bestSoFarTour);
    }


}
