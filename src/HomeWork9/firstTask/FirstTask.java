package HomeWork9.firstTask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FirstTask {

    public void upperCase(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            String line ;
            while ((line = reader.readLine()) != null) {
                char[] chars = line.toCharArray();
                for (char c : chars) {
                    if (Character.isUpperCase(c)) {
                        writer.write(Character.toString(c).toLowerCase());
                    } else {
                        writer.write(Character.toString(c).toUpperCase());
                    }
                }
                writer.newLine();
                writer.flush();
            }
            reader.close();
            writer.flush();
            writer.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

}
