package Home.Work2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class NamesOfTheMonths_2 {

   private static int number = 0;
    public void getNamesOfTheMonths_2() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        number = Integer.parseInt(reader.readLine());

        Integer[] sourceNumbers = new Integer[number];

        System.out.print("Enter a number from 1 to 12: ");

        for (int i = 0; i < number; i++) {

            sourceNumbers[i] = Integer.parseInt(reader.readLine());


            if (sourceNumbers[0] == 1) {
                System.out.println("January");

            }else if (sourceNumbers[0] == 2) {
                System.out.println("February");
            } else if (sourceNumbers[0] == 3) {
                System.out.println("March");
            } else if (sourceNumbers[0] == 4) {
                System.out.println("April");
            } else if (sourceNumbers[0] == 5) {
                System.out.println("May");
            } else if (sourceNumbers[0] == 6) {
                System.out.println("June");
            } else if (sourceNumbers[0] == 7) {
                System.out.println("July");
            } else if (sourceNumbers[0] == 8) {
                System.out.println("August");
            } else if (sourceNumbers[0] == 9) {
                System.out.println("September");
            } else if (sourceNumbers[0] == 10) {
                System.out.println("October");
            } else if (sourceNumbers[0] == 11) {
                System.out.println("November");
            } else if (sourceNumbers[0] == 12) {
                System.out.println("December");
            }


        }
    }
}














