
package pfe_16;

/**
 *
 * @author Joker
 */

import java.util.*;

public class ColoniesdeFourmis implements ColoniesdeFourmisOptimisation{

    private int dist[][];
    private double pheromone[][];
    private double choiceInfo[][];
    private SingleAnt ants[];

    private int nombre_fourmis;
    private int nombre_noeuds;

    private double alfa;
    private double beta;
   // evaporation golobale
    private double ro;
    /* evaporation  local*/
    private double xi;
    /* la quantité initiale du phéromones*/
    private double tau0;
    /* la probabilité de choisir le bord le plus court  */
    private double q0;
    /* itération actuelle */ 
    private int iterations;


    /* meilleur tour encore trouvé */
    private int[] meilleur_tour;


    public ColoniesdeFourmis(int noNodes, int noAnts){
        this.nombre_noeuds = noNodes;
        this.nombre_fourmis = noAnts;
        this.alfa = 1.0;
        this.beta = 3.0;
        this.ro = 0.1;
        this.xi = 0.1;
        this.iterations = 0;
        this.tau0 = 0;
        this.q0 = 0.9;

        dist = new int[noNodes][noNodes];
        pheromone = new double[noNodes][noNodes];
        choiceInfo = new double[noNodes][noNodes];

        ants = new SingleAnt[noAnts];
        for(int i = 0; i < noAnts; i++){
            ants[i] = new SingleAnt(noNodes);
        }
        meilleur_tour = new int[noNodes+1];

    }
    public ColoniesdeFourmis(int noNodes, int noAnts, double alfa,
                    double beta, double ro, double xi, double q0){
        this.nombre_noeuds = noNodes;
        this.nombre_fourmis = noAnts;
        this.alfa = alfa;
        this.beta = beta;
        this.ro = ro;
        this.xi = xi;
        this.iterations = 0;
        this.tau0 = 0;
        this.q0 = q0;

        dist = new int[noNodes][noNodes];
        pheromone = new double[noNodes][noNodes];
        choiceInfo = new double[noNodes][noNodes];

        ants = new SingleAnt[noAnts];
        for(int i = 0; i < noAnts; i++){
            ants[i] = new SingleAnt(noNodes);
        }

        meilleur_tour = new int[noNodes+1];
    }

    public SingleAnt getAnt(int k){
        return ants[k];
    }

    public double getPheromone(int i, int j){
        return pheromone[i][j];
    }
    public double getHeuristic(int i, int j){
        return choiceInfo[i][j];
    }
    public int getDistance(int i, int j){
        return dist[i][j];
    }
    public void setPheromone(int i, int j, double ph){
        pheromone[i][j] = ph;
    }
    public void setHeuristic(int i, int j, double h){
        choiceInfo[i][j] = h;
    }
    public void setDistance(int i, int j, int d){
        dist[i][j] = d;
    }
    public void setAlfa(double a){
        alfa = a;
    }
    public void setBeta(double b){
        beta = b;
    }
    public void setTau0(double tau){
        tau0 = tau;
    }
    public void setRo(double r){
        ro = r;
    }
    public void setXi(double x){
        xi = x;
    }
    public void setQ0(double q){
        q0 = q;
    }
    public double getAlfa(){
        return alfa;
    }
    public double getBeta(){
        return beta;
    }
    public double getRo(){
        return ro;
    }
    public double getXi(){
        return xi;
    }
    public double getTau0(){
        return tau0;
    }
    public double getQ0(){
        return q0;
    }
    public int[] getBestTour(){
        int[] bestTour = new int[nombre_noeuds+1];
        int bestTourLength = Integer.MAX_VALUE;
        int bestIdx = -1;
        for(int i = 0; i < nombre_fourmis; i++){
            if(ants[i].getTourLength() < bestTourLength){
                bestTourLength = ants[i].getTourLength();
                bestIdx = i;
            }
        }
        for(int j = 0; j <=nombre_noeuds; j++)
            bestTour[j] = ants[bestIdx].getTour(j);
        return bestTour;
    }
    public int[] getBestSoFarTour(){
        return meilleur_tour;
    }
    public void updateBestSoFarTour(){
        if(getBestTourLength() < computeTourLength(meilleur_tour)){
            meilleur_tour = getBestTour();
        }
    }
    public int getBestTourLength(){
        return computeTourLength(getBestTour());
    }
    public void setIteration(int iter){
        iterations = iter;
    }
    public int getIteration(){
        return iterations;
    }
    public int getNoAnts(){
        return nombre_fourmis;
    }
    public void setNoAnts(int ants){
        nombre_fourmis = ants;
    }
    public int getNoNodes(){
        return nombre_noeuds;
    }
    public void setNoNodes(int nodes){
        nombre_noeuds = nodes;
    }
    public void initData(){
        int i,j;
        for(i = 0; i < nombre_noeuds; i++)
            for(j = 0; j < nombre_noeuds; j++){
                dist[i][j] = 0;
                pheromone[i][j] = 0.0;
                choiceInfo[i][j] = 0.0;
            }
    }
    public void initPheromones(){
        int i,j;
        tau0 = computePheromone0();

        for(i = 0; i < nombre_noeuds; i++)
            for(j = 0; j < nombre_noeuds; j++)
                pheromone[i][j] = tau0;

        for(i = 0; i < nombre_noeuds; i++)
            pheromone[i][i] = 0;

    }
    public void computeHeuristic(){
        double niu;
        int i,j;

        for(i = 0; i < nombre_noeuds; i++)
            for(j = 0; j < nombre_noeuds; j++){
                if(dist[i][j] > 0)
                    niu = 1.0/dist[i][j];
                else
                    niu = 1.0/0.0001;
            choiceInfo[i][j] = Math.pow(pheromone[i][j],alfa)*Math.pow(niu,beta);
        }
    }
    public void initAnts(){
        int i,j;
        for(i = 0; i < nombre_fourmis; i++){
            ants[i].setTourLength(0);

            for(j = 0; j < nombre_noeuds; j++)
                ants[i].setVisited(j, false);
            for(j = 0; j <= nombre_noeuds; j++)
                ants[i].setTour(j, 0);
        }
    }
    public void decisionRule(int k, int step){
        /* k =  fourmis identifiant  */
        /* step = rythme actuel de la solution de construction */

        int c = ants[k].getTour(step-1); // orasul anterior al furnicii curente
        double sumProb = 0.0;

        double selectionProbability[] = new double[nombre_noeuds];

        int j;
        for(j = 0; j < nombre_noeuds; j++){
            if((ants[k].getVisited(j)) || (j == c))
                selectionProbability[j] = 0.0;
            else{
                selectionProbability[j] = choiceInfo[c][j];
                sumProb+=selectionProbability[j];
            }

        }
        double prob = Math.random()*sumProb;
        j = 0;
        double p = selectionProbability[j];
        while(p < prob){
            j++;
            p += selectionProbability[j];
        }
        /* Décision à prendre si rand <q0 */
        int randomDecision = j;

        /* meilleure décision */
        double maxHeuristic = -1;
        int maxHeuristicIdx = -1;
        for(j = 0; j < nombre_noeuds; j++){
            if(maxHeuristic < choiceInfo[c][j] && !(ants[k].getVisited(j))){
                maxHeuristic = choiceInfo[c][j];
                maxHeuristicIdx = j;
            }
        }

        if(Math.random() < q0){
            ants[k].setTour(step, maxHeuristicIdx);
            ants[k].setVisited(maxHeuristicIdx, true);
        }
        else{
            ants[k].setTour(step, randomDecision);
            ants[k].setVisited(randomDecision, true);
        }

        

    }
    public void constructSolutions(){
        /* suppression memoire de fourmis */
        initAnts();

        int step = 0;
        int k;
        int r;

        Random rand = new Random();

        /* ville d'affectation initiale*/
        for(k = 0; k < nombre_fourmis; k++){
            r = Math.abs(rand.nextInt())%nombre_noeuds;

            ants[k].setTour(step,r);
            ants[k].setVisited(r,true);
        }
        /* construire efficace soluu */
        while(step < nombre_noeuds-1){
            step++;
            for(k = 0; k < nombre_fourmis; k++){
                decisionRule(k,step);
                localPheromoneUpdate(k,step);
            }
        }
        /* terminé la tour */
        for(k = 0; k < nombre_fourmis; k++){
            ants[k].setTour(nombre_noeuds,ants[k].getTour(0));
            localPheromoneUpdate(k,nombre_noeuds);
            ants[k].setTourLength(computeTourLength(ants[k].getTour()));
        }
        updateBestSoFarTour();
    }
    public void globalEvaporation(){
        /*  */
        for(int i = 0; i <nombre_noeuds; i++){
            int idx1 = meilleur_tour[i];
            int idx2 = meilleur_tour[i+1];
            pheromone[idx1][idx2]*=(1-ro);
            pheromone[idx2][idx1]*=(1-ro);
            
        }
        
    }
    public void globalPheromoneDeposit(){
        double delta = 1.0/((double) getBestTourLength());
        for(int i = 0; i <nombre_noeuds; i++){
            int idx1 = meilleur_tour[i];
            int idx2 = meilleur_tour[i+1];
            
            pheromone[idx1][idx2]+=ro*delta;
            pheromone[idx2][idx1]+=ro*delta;
        }
    }
    public void updatePheromones(){
        globalEvaporation();
        globalPheromoneDeposit();
        computeHeuristic();
    }
    public void localPheromoneUpdate(int ant, int step){
        int idx1 = ants[ant].getTour(step);
        int idx2 = ants[ant].getTour(step-1);

        double currentValue = pheromone[idx1][idx2];
        pheromone[idx1][idx2] = (1-xi)*currentValue+xi*tau0;
        pheromone[idx2][idx1] = pheromone[idx1][idx2];
        //Mise à jour de la valeur heuristique
        double niu = 0;
        if(dist[idx1][idx2] > 0)
            niu = 1.0/dist[idx1][idx2];
        else
            niu = 1.0/0.0001;
        
        choiceInfo[idx1][idx2] = Math.pow(pheromone[idx1][idx2],alfa)*Math.pow(niu,beta);
        choiceInfo[idx1][idx2] = choiceInfo[idx2][idx1];
    }   
    private int greedyTour(){
        boolean visited[] = new boolean[nombre_noeuds];
        int tour[] = new int[nombre_noeuds+1];
        int length;
        int min, node;
        int i,j;

        for(i = 0; i < nombre_noeuds; i++)
            visited[i] = false;

        tour[0] = 0;
        meilleur_tour[0] = 0;
        visited[0] = true;

        for(i = 1; i < nombre_noeuds; i++){
            min = Integer.MAX_VALUE;
            node = -1;
            for(j = 0; j < nombre_noeuds; j++){
                if((!visited[j])&&(j!=tour[i-1])){
                    if(min > dist[tour[i-1]][j]){
                        min = dist[tour[i-1]][j];
                        node = j;
                    }
                }
            }
            tour[i] = node;
            meilleur_tour[i] = node;
            visited[node] = true;
        }
        tour[nombre_noeuds] = tour[0];
        meilleur_tour[nombre_noeuds] = meilleur_tour[0];
        return computeTourLength(tour);

    }
    public int computeTourLength(int tour[]){
        int len = 0;
        for(int i = 0; i < nombre_noeuds; i++){
            len+=dist[tour[i]][tour[i+1]];
        }
        return len;
    }
    private double computePheromone0(){
        return 1.0/(((double)greedyTour())*((double)nombre_fourmis));
    }

    public double[][] getPheromoneMatrix(){
        return pheromone;
    }


}
