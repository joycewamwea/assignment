/**
 * Created by joycewamwea on 2/3/2016.
 */
public class CubeFace {

    private int facenumber;
    private String percentage;
    public CubeFace(int face){
        this.facenumber=face;
    }

    private int totalOccurrence;

    public int getTotalOccurrence() {
        return totalOccurrence;
    }

    public void incrementTotalOccurrence(){
        ++totalOccurrence;
    }

    public void setPercent(String percent){
        this.percentage=percent;
    }

    public String getPercentage(){
        return percentage;
    }


}
