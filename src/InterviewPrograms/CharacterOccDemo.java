package InterviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccDemo {

    private LinkedHashMap<Character, Integer> getCharCountMapOptimized(String data) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        char[] characters = data.toCharArray();
        for (char val : characters) {
            if(map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            }
            else {
                map.put(val,1);
            }
        }
        return map;
    }

    private static void printResult(LinkedHashMap<Character, Integer> map) {
        String result = null;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                result = entry.getKey() + "";
                break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        CharacterOccDemo demo = new CharacterOccDemo();
        LinkedHashMap<Character, Integer> map2 = demo.getCharCountMapOptimized("ABCCDDDDDA");
        printResult(map2);
    }
}
