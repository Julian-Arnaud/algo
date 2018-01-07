import algos.*;
import system.ReadFile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            ReadFile readFile = new ReadFile("exemples/exemple100.txt");
            ReadFile readFile1 = new ReadFile("exemples/exemple500.txt");
            ReadFile readFile2 = new ReadFile("exemples/exemple1000.txt");
            ReadFile readFile3 = new ReadFile("exemples/monexemple.txt");

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
            System.out.println("Avec exemple 1000000 classé :");
            Fit worstFit3 = new WorstFit(readFile3);
            System.out.println("Bins utilisés : " + worstFit3.countNbBins() + "\n");


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
            System.out.println("Avec exemple 1000000 classé :");
            Fit almostWorstFit3 = new AlmostWorstFit(readFile3);
            System.out.println("Bins utilisés : " + almostWorstFit3.countNbBins() + "\n");


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
            System.out.println("Avec exemple 1000000 classé :");
            Fit nextFit3 = new NextFit(readFile3);
            System.out.println("Bins utilisés : " + nextFit3.countNbBins() + "\n");

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
            System.out.println("Avec exemple 1000000 classé :");
            Fit firstFit3 = new FirstFit(readFile3);
            System.out.println("Bins utilisés : " + firstFit3.countNbBins() + "\n");

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
            System.out.println("Avec exemple 1000000 classé :");
            Fit bestFit3 = new BestFit(readFile3);
            System.out.println("Bins utilisés : " + bestFit3.countNbBins() + "\n");
        } else {
            System.out.println("Entrer la taille des bins :");
            Scanner scan = new Scanner(System.in);
            int binSize = scan.nextInt();
            System.out.println("Entrer le nombre de valeurs voulus");
            int valueCount = scan.nextInt();
            System.out.println("Entrer le nombre de simulation souhaité");
            int simulationCount = scan.nextInt();
            for (int i = 0; i < simulationCount; i++) {
                System.out.println("Simulation numéro : " + i);
                BufferedWriter bw = new BufferedWriter(new FileWriter(new File("exemples/random.txt")));
                bw.write("Taille bin\n");
                bw.write("" + binSize + "\nObjets\n");
                for (int j = 1; j < valueCount; j++) {
                    int rand = (int) (Math.random() * (binSize + 1));
                    bw.write(rand + ", ");
                }
                int rand = (int) (Math.random() * (binSize + 1));
                bw.write(rand + ".");
                bw.close();
                ReadFile readFile = new ReadFile("exemples/random.txt");
                System.out.println("Algorithme worstfit : ");
                Fit worstFit = new WorstFit(readFile);
                System.out.println("Bins utilisés : " + worstFit.countNbBins() + "\n");
                System.out.println("Algorithme almostworstfit : ");
                Fit almostWorstFit = new AlmostWorstFit(readFile);
                System.out.println("Bins utilisés : " + almostWorstFit.countNbBins() + "\n");
                System.out.println("Algorithme nextfit: ");
                Fit nextFit = new NextFit(readFile);
                System.out.println("Bins utilisés : " + nextFit.countNbBins() + "\n");
                System.out.println("Algorithme firstfit: ");
                Fit firstFit = new FirstFit(readFile);
                System.out.println("Bins utilisés : " + firstFit.countNbBins() + "\n");
                System.out.println("Algorithme bestfit: ");
                Fit bestFit = new BestFit(readFile);
                System.out.println("Bins utilisés : " + bestFit.countNbBins() + "\n");
            }
        }
    }
}
