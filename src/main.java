import algos.FirstFit;
import algos.Fit;
import algos.NextFit;
import com.sun.org.apache.xpath.internal.SourceTree;
import system.ReadFile;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("D:/Polytech/SI4/Complexité/Projet 2/algo/src/txt/exemple100.txt");
        ReadFile readFile1 = new ReadFile("D:/Polytech/SI4/Complexité/Projet 2/algo/src/txt/exemple500.txt");
        ReadFile readFile2 = new ReadFile("D:/Polytech/SI4/Complexité/Projet 2/algo/src/txt/exemple1000.txt");


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
    }
}
