import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * Created by joycewamwea on 2/3/2016.
 */
public class CubeSystem {
    private int rounds;
    private int totalOccurrence;

    private CubeFace cubeFace1;
    private CubeFace cubeFace2;
    private CubeFace cubeFace3;
    private CubeFace cubeFace4;
    private CubeFace cubeFace5;
    private CubeFace cubeFace6;

    public ArrayList<CubeFace> list;

    public CubeSystem(){
        cubeFace1 = new CubeFace(1);
        cubeFace2 = new CubeFace(2);
        cubeFace3 = new CubeFace(3);
        cubeFace4 = new CubeFace(4);
        cubeFace5 = new CubeFace(5);
        cubeFace6 = new CubeFace(6);
         list=new ArrayList();

        list.add(cubeFace1);
        list.add(cubeFace2);
        list.add(cubeFace3);
        list.add(cubeFace4);
        list.add(cubeFace5);
        list.add(cubeFace6);

        //obtain input


    }





    public void startSimulation(int rounds){
        this.rounds = rounds;
        int curRound = 0;
        do{
            int face = generateCubeFace()- 1;
            CubeFace cubeFace = list.get(face);
            cubeFace.incrementTotalOccurrence();
            incrementTotalOccurrence();
            String percent = String.valueOf(Math.round((float)cubeFace.getTotalOccurrence() / rounds * 100)) + "%";
            cubeFace.setPercent(percent);
            ++curRound;
        }
        while (curRound != rounds);
    }


    private int generateCubeFace(){
        return  (int )(Math.random() * 6 + 1);
    }

    private void incrementTotalOccurrence(){
        ++totalOccurrence;

    }

    public int input(){
        System.out.println("Enter the number of rounds to simulate");
        System.out.println("------------------------------------------------------------------------------------------");

        Scanner scan=new Scanner(System.in);
        int numrounds=scan.nextInt();
        return numrounds;

    }

    public void output(){
        System.out.println();
        System.out.println();
        System.out.println("         Outcome         ");
        System.out.println("------------------------------------------------------------------------------------------");

        System.out.println("Faces     TotalOccurence        Percentage");
        System.out.println("face1------------"+cubeFace1.getTotalOccurrence()+"------------"+cubeFace1.getPercentage());
        System.out.println("face2------------"+cubeFace2.getTotalOccurrence()+"------------"+cubeFace2.getPercentage());
        System.out.println("face3------------"+cubeFace3.getTotalOccurrence()+"------------"+cubeFace3.getPercentage());
        System.out.println("face4------------"+cubeFace4.getTotalOccurrence()+"------------"+cubeFace4.getPercentage());
        System.out.println("face5------------"+cubeFace5.getTotalOccurrence()+"------------"+cubeFace5.getPercentage());
        System.out.println("face6------------"+cubeFace6.getTotalOccurrence()+"------------"+cubeFace6.getPercentage());


    }



}
