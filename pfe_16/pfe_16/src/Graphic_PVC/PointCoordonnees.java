

package Graphic_PVC;

/**
 *
 * @author Joker
 */

public class PointCoordonnees {
    private int x;
    private int y;

    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getIntegerDistance(PointCoordonnees p){
        return (int)Math.round(Math.sqrt(Math.pow(this.x-p.x, 2) + Math.pow(this.y-p.y,2)));
    }
    PointCoordonnees(){
        x = y = 0;
    }
    PointCoordonnees(int x,int y){
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString(){
        return "[ "+x+", "+y+" ]";
    }


}
