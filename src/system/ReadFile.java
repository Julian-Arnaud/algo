package system;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private int binSize;
    private List<Integer> listOfValues;

    public ReadFile(String fileName) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line = br.readLine();

            line = br.readLine();
            binSize = Integer.parseInt(line);

            line = br.readLine();
            line = br.readLine();
            String tmp[] = line.split(", ");

            listOfValues = new ArrayList<>();
            for(int i = 0; i < tmp.length - 1; ++i){
                listOfValues.add(Integer.parseInt(tmp[i]));
            }

            String val = tmp[tmp.length -1] + " 0";
            String tmp2[] = val.split(". ");
            listOfValues.add(Integer.parseInt(tmp2[0]));

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void showAll(){
        System.out.println(binSize + "\n");

        for (Integer listOfValue : listOfValues) {
            System.out.println(listOfValue);
        }
    }

    public int getBinSize() {
        return binSize;
    }

    public List<Integer> getListOfValues() {
        return listOfValues;
    }
}
