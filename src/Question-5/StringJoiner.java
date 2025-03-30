import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringJoiner {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();

        List<String> list=new ArrayList<>();

        while(num-->0){
            list.add(sc.next());
        }

        String str=list.stream()
                .collect(Collectors.joining(", "));

        System.out.println(str);
    }
}
