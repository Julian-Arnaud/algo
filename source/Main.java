import algos.*;
import system.ReadFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("exemples/exemple100.txt");
        ReadFile readFile1 = new ReadFile("exemples/exemple500.txt");
        ReadFile readFile2 = new ReadFile("exemples/exemple1000.txt");

        System.out.println("Algorithme Worstfit");
        System.out.println("Avec exemple 100 : ");
        Fit worstFit = new WorstFit(readFile);
        System.out.println("Bins utilisés : " + worstFit.countNbBins() + "\n");
        System.out.println("Avec exemple 500 :");
        Fit worstFit1 = new WorstFit(readFile1);
        System.out.println("Bins utilisés : " + worstFit1.countNbBins() + "\n");
        System.out.println("Avec exemple 1000 :");
        Fit worstFit2 = new WorstFit(readFile2);
        System.out.println("Bins utilisés : " + worstFit2.countNbBins() + "\n");


        System.out.println("Algorithme AlmostWorstFit");
        System.out.println("Avec exemple 100 : ");
        Fit almostWorstFit = new AlmostWorstFit(readFile);
        System.out.println("Bins utilisés : " + almostWorstFit.countNbBins() + "\n");
        System.out.println("Avec exemple 500 :");
        Fit almostWorstFit1 = new AlmostWorstFit(readFile1);
        System.out.println("Bins utilisés : " + almostWorstFit1.countNbBins() + "\n");
        System.out.println("Avec exemple 1000 :");
        Fit almostWorstFit2 = new AlmostWorstFit(readFile2);
        System.out.println("Bins utilisés : " + almostWorstFit2.countNbBins() + "\n");


        System.out.println("Algorithme NextFit");
        System.out.println("Avec exemple 100 : ");
        Fit nextFit = new NextFit(readFile);
        System.out.println("Bins utilisés : " + nextFit.countNbBins() + "\n");
        System.out.println("Avec exemple 500 :");
        Fit nextFit1 = new NextFit(readFile1);
        System.out.println("Bins utilisés : " + nextFit1.countNbBins() + "\n");
        System.out.println("Avec exemple 1000 :");
        Fit nextFit2 = new NextFit(readFile2);
        System.out.println("Bins utilisés : " + nextFit2.countNbBins() + "\n");

        System.out.println("Algorithme FirstFit");
        System.out.println("Avec exemple 100 : ");
        Fit firstFit = new FirstFit(readFile);
        System.out.println("Bins utilisés : " + firstFit.countNbBins() + "\n");
        System.out.println("Avec exemple 500 :");
        Fit firstFit1 = new FirstFit(readFile1);
        System.out.println("Bins utilisés : " + firstFit1.countNbBins() + "\n");
        System.out.println("Avec exemple 1000 :");
        Fit firstFit2 = new FirstFit(readFile2);
        System.out.println("Bins utilisés : " + firstFit2.countNbBins() + "\n");

        System.out.println("Algorithme BestFit");
        System.out.println("Avec exemple 100 : ");
        Fit bestFit = new BestFit(readFile);
        System.out.println("Bins utilisés : " + bestFit.countNbBins() + "\n");
        System.out.println("Avec exemple 500 :");
        Fit bestFit1 = new BestFit(readFile1);
        System.out.println("Bins utilisés : " + bestFit1.countNbBins() + "\n");
        System.out.println("Avec exemple 1000 :");
        Fit bestFit2 = new BestFit(readFile2);
        System.out.println("Bins utilisés : " + bestFit2.countNbBins() + "\n");
    }
}
