package HomeWork9.demo;


import HomeWork9.fourthTask.FourthTask;
import HomeWork9.firstTask.FirstTask;
import HomeWork9.secondTask.SecondTask;
import HomeWork9.thirdTask.ThirdTask;

import java.io.IOException;

public class Demo {


    public static void main(String[] args) throws IOException {


        FirstTask firstTask = new FirstTask();
        firstTask.upperCase();

        SecondTask secondTask = new SecondTask();
        secondTask.sortMass();

        ThirdTask thirdTask = new ThirdTask();
        try {
            thirdTask.InputTypeDate();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FourthTask fourthTask = new FourthTask();
        fourthTask.divisionOfText();
    }
}
