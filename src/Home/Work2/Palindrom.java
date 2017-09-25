package Home.Work2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Palindrom {


    public int getPalindrom() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers to check: ");

        String in = reader.readLine();
        String[] words = in.split(" ");

        ArrayList<Integer> numbers = new ArrayList<>();// create new collection numbers
        for (String word : words) { //filling the collection
            numbers.add(Integer.parseInt(word));// add word in collection
        }

       ArrayList<Integer> palindroms = new ArrayList<>();// create new collection palindrom

        for (Object number : numbers) { //filling the collection
            String s = number.toString();//convert number to string
            String rev = new StringBuilder(s).reverse().toString();//turn the string

            if (s.equals(rev)) { //check to see if the line is an inverted line
                palindroms.add((Integer) number );//add in collection palindrom line
                System.out.println(s + " = is palindrom!");//true
            }else {
                System.out.println(s + " =  is not palindrom!");//false
                  }
        }

        return 0;
    }
   }






