

package pfe_16;

/**
 *
 * @author Joker
 */
public interface AlgorithmesGenetiquesOptimisation {

    public int getDistance(int i, int j);
    public void setDistance(int i, int j, int d);
    public int[] getBestTour();
    public void setIteration(int iter);
    public int getIteration();
    public int getPopulationSize();
    public void setPopulationSize(int genes);
    public int getNoNodes();
    public void setNoNodes(int nodes);
    public void initPopulation();
    
    public int[] getBestSoFarTour();
    public void updateBestSoFarTour();

    public double getMutationRatio();
    public void setMutationRatio(double p);

    
    
}
