package Home.Work2;


import java.io.IOException;
import java.security.NoSuchAlgorithmException;


public class Demo {
    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {

        Sum sum = new Sum();
        sum.getSumAllNumbers();

        Palindrom palindrom = new Palindrom();
        palindrom.getPalindrom();

        Palindrom2 palindrom2 = new Palindrom2();
        palindrom2.getPalindrom2();

        NamesOfTheMonths months = new NamesOfTheMonths();
        months.getNamesOfTheMonths();

        NamesOfTheMonths_2 months_2 = new NamesOfTheMonths_2();
        months_2.getNamesOfTheMonths_2();

        NamesOfTheMonths_3 months_3 = new NamesOfTheMonths_3();
        months_3.getNamesOfTheMonths_3();


        HashingMD5 hashingMD5 = new HashingMD5();
        hashingMD5.getHashingMD5();

        HashingSHA256 hashingSHA256 = new HashingSHA256();
        hashingSHA256.getHashingSHA256();
    }
}


