package HomeWork3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Stroka {
    private static List<String> strings;
  static   ArrayList<String> strings1 = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        String max = "";


        for (int i = 0; i < 5; i++) {
            strings.add(rd.readLine());
            if (max.length() < strings.get(i).length()) {
                max = strings.get(i);
            }
        }

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == max.length()) {
                System.out.println(strings.get(i));
            }
        }

        for (int i = 0; i < 5; i++) {
            strings1.add(rd.readLine());
        }
        String min = strings1.get(0);
        for (int i = 1; i < strings1.size(); i++) {
            String s = strings1.get(i);
            if (min.length() <= s.length()) {
                min = strings1.get(i);
            } else {
                min = strings1.get(i);
                System.out.println(min);
            }
        }
    }

}