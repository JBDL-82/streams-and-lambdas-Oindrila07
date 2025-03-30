import java.util.*;
import java.util.stream.Collectors;

public class Words {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t=sc.nextInt();

        List<String> words=new ArrayList<>();

        while(t>0){
            words.add(sc.next());
            t--;
        }

        countFreq(words);
    }

    static void countFreq(List<String> words){
        Map<String,Integer> map=new HashMap<>();

        for(String word:words)
            map.put(word, map.getOrDefault(word,0)+1);

        map=sortByKey(map);

        System.out.println(map);
    }

    static Map<String,Integer> sortByKey(Map<String,Integer> map){
        return map.entrySet()
                .stream()
                .sorted((a,b)->a.getKey().compareTo(b.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2)->e1,LinkedHashMap::new));

    }
}
