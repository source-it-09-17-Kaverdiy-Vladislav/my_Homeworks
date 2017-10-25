package HomeWork7.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OtherClass {
    public List<Integer> removeInRange(List<Integer> list, int element, int start, int end){

        IntStream stream = IntStream.concat(
                IntStream.range(0, start),
                IntStream.concat(
                        IntStream.range(start, end).filter(i -> list.get(i) != element),
                        IntStream.range(end, list.size())
                )
        );

        return stream.mapToObj(list::get)
                .collect(Collectors.toList());
    }

    public static int countCommon(List<Integer> list1, List<Integer> list2) {

        int result = 0;
        List<Integer> checkedValues = new ArrayList<>();
        for (Integer elem : list1) {
            if (elem != null && !checkedValues.contains(elem) && list2.contains(elem)) {
                checkedValues.add(elem);
                result++;
            }
        }
        return result;
    }


}
