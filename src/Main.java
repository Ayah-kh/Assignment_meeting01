import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        List<Integer> lessThan5 = new ArrayList<>();
        List<Integer> between = new ArrayList<>();
        List<Integer> greaterThan5 = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 5)
                lessThan5.add(array[i]);
            else if (array[i] < 10)
                between.add(array[i]);
            else
                greaterThan5.add(array[i]);

        }
        System.out.println("lessThan5 = " + lessThan5);
        System.out.println("between = " + between);
        System.out.println("greaterThan5 = " + greaterThan5);

        Map<String, List<Integer>> collect = Arrays.stream(array)
                .collect(Collectors.groupingBy(i -> i < 5 ? "LT5" : i < 10 ? "B5_10" : "GT10"));

        System.out.println("collect = " + collect);


    }

}