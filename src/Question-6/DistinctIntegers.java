import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctIntegers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 2, 4, 5, 4, 6, 5, 3, 5, 4, 5, 5, 7, 7, 10);

        numbers.stream().distinct().toList().forEach(System.out::println);
    }
}
