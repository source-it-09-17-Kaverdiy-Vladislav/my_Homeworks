package HomeWork6.TestClass;


import java.util.Arrays;
import java.util.stream.IntStream;

public class TestClases {
    public static int[] mass;


    public TestClases(int n){
        mass = new int[n];
        IntStream.range(0, n).forEach(idx -> mass[idx] = (int) (Math.random() * n));
        Arrays.sort(mass);
    }

    private int findNum(int num, int fromIndex, int toIndex) {
        int testIndex = (fromIndex + toIndex) / 2;
        if (mass[testIndex] == num) {
            return testIndex;
        } else if (fromIndex > toIndex) {
            return -1;
        } else {
            fromIndex = mass[testIndex] < num ? testIndex + 1: fromIndex;
            toIndex = mass[testIndex] < num ? toIndex: testIndex - 1;
            return findNum(num, fromIndex, toIndex);
        }
    }

    public boolean contains(int number) {
        return findNum(number, 0, mass.length - 1) != -1;
    }


        }



