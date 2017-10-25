package HomeWork7.Test;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestCollections {
    public static int numbers = 1_000_000;


    public void TestArrayList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numbers; i++) {
            list.add(i);

        }

        List<Integer> newlist = list.subList(5_00_000,501_000);
        list.removeAll(newlist);
        newlist = list;
        list.add(0,1000);


    }



    public void TestLinkedList() {
        List<Integer> list2 = new LinkedList<Integer>();
        for(int i=0; i<numbers; i++) {list2.add(i);
            System.out.println(list2);
        }

        List<Integer> newlist2 = list2.subList(5_00_000,501_000);
        list2.removeAll(newlist2);
        newlist2 = list2;
        list2.add(0,1000);

    }

    public void startTests() {
        long timeStart = System.currentTimeMillis();
        TestArrayList();
        System.out.println("\tTestArrayList: " + (System.currentTimeMillis() - timeStart));
        TestLinkedList();
        System.out.println("\tTestLinkedList: " + (System.currentTimeMillis() - timeStart));
    }
}
