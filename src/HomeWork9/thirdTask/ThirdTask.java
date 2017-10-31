package HomeWork9.thirdTask;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ThirdTask {
    public void InputTypeDate() throws IOException {
        {
            Scanner sc = new Scanner(System.in);

            FileWriter fw = new FileWriter("input3.txt");
            fw.write(sc.next());
            fw.close();
            FileReader fr = new FileReader("input3.txt");
            Scanner scan = new Scanner(fr);
            while (scan.hasNext()) {
                if (scan.hasNextInt()) {
                    System.out.println(scan.nextInt() + " :Int");

                } else if (scan.hasNextDouble()) {
                    System.out.println(scan.nextDouble() + " :Double");

                } else {
                    System.out.println(scan.next() + " :String");
                }
            }
            fr.close();
            sc.close();
            scan.close();
        }
    }

}