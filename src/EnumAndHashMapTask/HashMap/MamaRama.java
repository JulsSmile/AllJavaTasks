package EnumAndHashMapTask.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MamaRama{
    public static void main(String[] args) {

        Map<Character, Integer> mamaRama = new HashMap<>();
        String str = "Мама мыла раму";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            Integer val = mamaRama.get(c);

            mamaRama.containsKey(c);
//            mamaRama.putIfAbsent()
//            mamaRama.computeIfAbsent()
            if (val != null) {
                mamaRama.put(c, val + 1);
            } else {
                mamaRama.put(c, 1);
            }
        }
        mamaRama.forEach((k, v) -> System.out.println(k + " " + v));
    }
}