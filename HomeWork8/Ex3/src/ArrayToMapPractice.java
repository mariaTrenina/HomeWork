import java.util.HashMap;
import java.util.Map;


public class ArrayToMapPractice {
    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map<K, Integer> result = new HashMap<>();
        for (K item : ks) {
            if (result.containsKey(item)) {
                result.put(item,result.get(item)+1);
            } else {
                result.put(item,1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 4, 4};
        System.out.println(arrayToMap(array));
    }
}
