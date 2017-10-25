package HomeWork7.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnicArrayList {

    public void unicArrayList() {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 1, 1, 1);
        List<Integer> uniqueElements = list.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueElements);
    }
}
