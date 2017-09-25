package Home.Work2;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrom2 {


    public int getPalindrom2() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers or symbols to check: ");
        String in = reader.readLine();


        String [] numbers = in.split("");
        String rev = new StringBuffer(in).reverse().toString();

        for (int i = 0; i < numbers.length ; i++) {

            if(in.equals(rev)){
                System.out.println(in + " = is palindrom!");
            }else{
                System.out.println(in + " =  is not palindrom!");
            }
        }

        return 0;
    }


}