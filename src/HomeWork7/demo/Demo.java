package HomeWork7.demo;



import HomeWork7.Test.OtherClass;
import HomeWork7.Test.TestCollections;
import HomeWork7.Test.UnicArrayList;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        TestCollections testCollections = new TestCollections();
        testCollections.startTests();

        UnicArrayList unicArrayList = new UnicArrayList();
        unicArrayList.unicArrayList();

        OtherClass otherClass = new OtherClass();

        Integer[] arr = {0, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16};
        System.out.println(otherClass.removeInRange(Arrays.asList(arr), 0, 5, 13));


        Integer[] arr1 = {3, 7, 3, -1, 2, 3, 7, 2, 15, 15};
        Integer[] arr2 = {-5, 15, 2, -1, 7, 15, 36};
        System.out.println(otherClass.countCommon(Arrays.asList(arr1), Arrays.asList(arr2)));
    }
}
