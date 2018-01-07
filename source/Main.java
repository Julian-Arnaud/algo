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
            worstFit.print();
            System.out.println("Avec exemple 500 :");
            Fit worstFit1 = new WorstFit(readFile1);
            worstFit1.print();
            System.out.println("Avec exemple 1000 :");
            Fit worstFit2 = new WorstFit(readFile2);
            worstFit2.print();
            System.out.println("Avec exemple 1000000 classé :");
            Fit worstFit3 = new WorstFit(readFile3);
            worstFit3.print();


            System.out.println("Algorithme AlmostWorstFit");
            System.out.println("Avec exemple 100 : ");
            Fit almostWorstFit = new AlmostWorstFit(readFile);
            almostWorstFit.print();
            System.out.println("Avec exemple 500 :");
            Fit almostWorstFit1 = new AlmostWorstFit(readFile1);
            almostWorstFit1.print();
            System.out.println("Avec exemple 1000 :");
            Fit almostWorstFit2 = new AlmostWorstFit(readFile2);
            almostWorstFit2.print();
            System.out.println("Avec exemple 1000000 classé :");
            Fit almostWorstFit3 = new AlmostWorstFit(readFile3);
            almostWorstFit3.print();


            System.out.println("Algorithme NextFit");
            System.out.println("Avec exemple 100 : ");
            Fit nextFit = new NextFit(readFile);
            nextFit.print();
            System.out.println("Avec exemple 500 :");
            Fit nextFit1 = new NextFit(readFile1);
            nextFit1.print();
            System.out.println("Avec exemple 1000 :");
            Fit nextFit2 = new NextFit(readFile2);
            nextFit2.print();
            System.out.println("Avec exemple 1000000 classé :");
            Fit nextFit3 = new NextFit(readFile3);
            nextFit3.print();

            System.out.println("Algorithme FirstFit");
            System.out.println("Avec exemple 100 : ");
            Fit firstFit = new FirstFit(readFile);
            firstFit.print();
            System.out.println("Avec exemple 500 :");
            Fit firstFit1 = new FirstFit(readFile1);
            firstFit1.print();
            System.out.println("Avec exemple 1000 :");
            Fit firstFit2 = new FirstFit(readFile2);
            firstFit2.print();
            System.out.println("Avec exemple 1000000 classé :");
            Fit firstFit3 = new FirstFit(readFile3);
            firstFit3.print();

            System.out.println("Algorithme BestFit");
            System.out.println("Avec exemple 100 : ");
            Fit bestFit = new BestFit(readFile);
            bestFit.print();
            System.out.println("Avec exemple 500 :");
            Fit bestFit1 = new BestFit(readFile1);
            bestFit1.print();
            System.out.println("Avec exemple 1000 :");
            Fit bestFit2 = new BestFit(readFile2);
            bestFit2.print();
            System.out.println("Avec exemple 1000000 classé :");
            Fit bestFit3 = new BestFit(readFile3);
            bestFit3.print();
        } else {
            double worstbins = 0, almostworstbins = 0, nextbins = 0, firstbins = 0, bestbins = 0;
            double worsttime = 0, almostworsttime = 0, nexttime = 0, firsttime = 0, besttime = 0;
            System.out.println("Entrer la taille des bins :");
            Scanner scan = new Scanner(System.in);
            int binSize = scan.nextInt();
            System.out.println("Entrer le nombre de valeurs voulus");
            int valueCount = scan.nextInt();
            System.out.println("Entrer le nombre de simulation souhaité");
            int simulationCount = scan.nextInt();
            for (int i = 0; i < simulationCount; i++) {
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
                Fit worstFit = new WorstFit(readFile);
                worstbins += worstFit.countNbBins();
                worsttime += worstFit.getTime();
                Fit almostWorstFit = new AlmostWorstFit(readFile);
                almostworstbins += almostWorstFit.countNbBins();
                almostworsttime += almostWorstFit.getTime();
                Fit nextFit = new NextFit(readFile);
                nextbins += nextFit.countNbBins();
                nexttime += nextFit.getTime();
                Fit firstFit = new FirstFit(readFile);
                firstbins += firstFit.countNbBins();
                firsttime += firstFit.getTime();
                Fit bestFit = new BestFit(readFile);
                bestbins += bestFit.countNbBins();
                besttime += bestFit.getTime();
            }
            System.out.println("WorstFit en moyenne : ");
            System.out.println("Temps en ns : " + worsttime / simulationCount);
            System.out.println("Nombre de bins : " + worstbins / simulationCount + "\n");

            System.out.println("AlmostWorstFit en moyenne : ");
            System.out.println("Temps en ns : " + almostworsttime / simulationCount);
            System.out.println("Nombre de bins : " + almostworstbins / simulationCount + "\n");

            System.out.println("NextFit en moyenne : ");
            System.out.println("Temps en ns : " + nexttime / simulationCount);
            System.out.println("Nombre de bins : " + nextbins / simulationCount + "\n");

            System.out.println("FirstFit en moyenne : ");
            System.out.println("Temps en ns : " + firsttime / simulationCount);
            System.out.println("Nombre de bins : " + firstbins / simulationCount + "\n");

            System.out.println("BestFit en moyenne : ");
            System.out.println("Temps en ns : " + besttime / simulationCount);
            System.out.println("Nombre de bins : " + bestbins / simulationCount);

        }
    }
}
