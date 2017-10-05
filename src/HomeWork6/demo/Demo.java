package HomeWork6.demo;

import HomeWork6.MyExceptions.Scrap;
import HomeWork6.MyExceptions.TestException;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String[]mas = {"hello", "tytytyt", "ursdfx"};

        Scrap scrap = new Scrap();
        System.out.println(scrap.getMass(arr, 4));

        scrap.valueOf(10);
        scrap.toString(mas, 2.5);

        System.out.println(mas);



        TestException testException = new TestException();
        testException.getName();
        testException.getSurname();
    }


}
