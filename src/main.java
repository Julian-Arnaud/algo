import algos.NextFit;
import system.ReadFile;

import java.io.IOException;

public class main {

    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile("/home/user/Bureau/exemple100.txt");
        ReadFile readFile1 = new ReadFile("/home/user/Bureau/exemple500.txt");
        ReadFile readFile2 = new ReadFile("/home/user/Bureau/exemple1000.txt");


        NextFit nextFit = new NextFit(readFile);
        NextFit nextFit1 = new NextFit(readFile1);
        NextFit nextFit2 = new NextFit(readFile2);
        System.out.println(nextFit.countNbBins());
        System.out.println(nextFit1.countNbBins());
        System.out.println(nextFit2.countNbBins());
    }
}
