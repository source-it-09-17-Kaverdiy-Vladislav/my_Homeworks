package HomeWork9.fourthTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FourthTask {


    public void divisionOfText(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input4.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output4.txt"));
            StreamTokenizer fileTokenizer =new StreamTokenizer(reader);
            String line;
            while ((line = reader.readLine()) != null) {

                ArrayList<String> string = new ArrayList<String>(Arrays.asList(line.split("[\\.|\\?|\\!]")));

                for (int i = 0; i < string.size(); i++) {
                    writer.newLine();
                            writer.write(String.valueOf(string.get(i).trim()));

                        }
                    }

            writer.newLine();
            writer.write(" ");
            reader.close();
            writer.close();

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
