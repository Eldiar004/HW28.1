package hw28_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class main2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,23,6,0,12,123,6,5,1,99,3,4,1,2);
        Integer summaAllNumbers = list.stream().reduce(0, Integer::sum);
        System.out.println("Summa of numbers: " + summaAllNumbers);

        System.out.print("Average of summa: ");
        list.stream().mapToInt(i -> i).average().ifPresent(System.out::println);

        Map<Integer,Integer> countByNumber = new HashMap<>();
        for(Integer n: list) countByNumber.merge(n, 1, Integer::sum);
        System.out.println(countByNumber);
    }
}
