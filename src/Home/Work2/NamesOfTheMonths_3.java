package Home.Work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NamesOfTheMonths_3 {
    public void getNamesOfTheMonths_3 () throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] list = new int[1];
        System.out.println("Enter numbers: ");
        for (int i = 0; i < list.length ; i++) {
            list[i] = Integer.parseInt(reader.readLine());
            if (list[0] == 1) {
                System.out.println("January");
            }else if (list[0] == 2) {
                System.out.println("February");
            } else if (list[0] == 3) {
                System.out.println("March");
            } else if (list[0] == 4) {
                System.out.println("April");
            } else if (list[0] == 5) {
                System.out.println("May");
            } else if (list[0] == 6) {
                System.out.println("June");
            } else if (list[0] == 7) {
                System.out.println("July");
            } else if (list[0] == 8) {
                System.out.println("August");
            } else if (list[0] == 9) {
                System.out.println("September");
            } else if (list[0] == 10) {
                System.out.println("October");
            } else if (list[0] == 11) {
                System.out.println("November");
            } else if (list[0] == 12) {
                System.out.println("December");
            }
        }

    }
}
