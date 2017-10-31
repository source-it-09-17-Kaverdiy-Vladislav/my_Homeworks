package HomeWork9.secondTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class SecondTask {
    static int[]mass = {1,3,5,2,4,6,8,7};



    public void sortMass(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input2.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("input2.txt"));
            BufferedWriter writer2 = new BufferedWriter(new FileWriter("output2.txt"));
            for(int i =0; i < mass.length; i ++){
                writer.write(String.valueOf(mass[i]));
            }
            writer.newLine();
            writer.write(" ");
            writer.close();

            String line = " ";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);


            }
            Arrays.sort(mass);
            for(int i =0; i < mass.length; i ++){
                writer2.write(String.valueOf(mass[i]));
            }
            writer2.newLine();
            writer2.write(" ");
            reader.close();
            writer2.close();


        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
