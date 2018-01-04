import algos.*;
import system.ReadFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("exemples/exemple100.txt");
        ReadFile readFile1 = new ReadFile("exemples/exemple500.txt");
        ReadFile readFile2 = new ReadFile("exemples/exemple1000.txt");


        System.out.println();
        Fit worstFit = new WorstFit(readFile);
        Fit worstFit1 = new WorstFit(readFile1);
        Fit worstFit2 = new WorstFit(readFile2);
        System.out.println(worstFit.countNbBins());
        System.out.println(worstFit1.countNbBins());
        System.out.println(worstFit2.countNbBins());


        System.out.println();
        Fit almostWorstFit = new AlmostWorstFit(readFile);
        Fit almostWorstFit1 = new AlmostWorstFit(readFile1);
        Fit almostWorstFit2 = new AlmostWorstFit(readFile2);
        System.out.println(almostWorstFit.countNbBins());
        System.out.println(almostWorstFit1.countNbBins());
        System.out.println(almostWorstFit2.countNbBins());


        System.out.println();
        Fit nextFit = new NextFit(readFile);
        Fit nextFit1 = new NextFit(readFile1);
        Fit nextFit2 = new NextFit(readFile2);
        System.out.println(nextFit.countNbBins());
        System.out.println(nextFit1.countNbBins());
        System.out.println(nextFit2.countNbBins());

        System.out.println();
        Fit firstFit = new FirstFit(readFile);
        Fit firstFit1 = new FirstFit(readFile1);
        Fit firstFit2 = new FirstFit(readFile2);
        System.out.println(firstFit.countNbBins());
        System.out.println(firstFit1.countNbBins());
        System.out.println(firstFit2.countNbBins());

        System.out.println();
        Fit bestFit = new BestFit(readFile);
        Fit bestFit1 = new BestFit(readFile1);
        Fit bestFit2 = new BestFit(readFile2);
        System.out.println(bestFit.countNbBins());
        System.out.println(bestFit1.countNbBins());
        System.out.println(bestFit2.countNbBins());
    }
}