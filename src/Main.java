import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Integer [] arr = {44,43,23,453,24,65,15,654,65,88};
        Optional<Integer> optonal = Arrays.stream(arr).filter(x ->x%2==0).map(x -> x * x).collect(Collectors.toList()).stream().max(Comparator.naturalOrder());
        System.out.println(optonal);
    }
}