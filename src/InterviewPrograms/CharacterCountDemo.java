package InterviewPrograms;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountDemo {

    /**
     * Not optimized.
     * @param data String in which we need to count the character occurrences.
     * @return Map of character and its count
     */
    private HashMap<Character, Integer> getCharCountMap(String data) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] characters = data.toCharArray();
        int count;
        for (char val : characters) {
            count = 0;
            for (char character : characters) {
                if (val == character) {
                    count++;
                }
            }
            map.put(val, count);
        }
        return map;
    }

    /**
     * Not optimized.
     * @param data String in which we need to count the character occurrences.
     * @return Map of character and its count
     */
    private HashMap<Character, Integer> getCharCountMapOptimized(String data) {
        HashMap<Character, Integer> map = new HashMap<>();
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

    private static void printMap(HashMap<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }

    public static void main(String[] args) {

        CharacterCountDemo demo = new CharacterCountDemo();
        System.out.println("Solution with Not optimized algorithm:");
        HashMap<Character, Integer> map1 = demo.getCharCountMap("AABBBCCCCDDDDD");
        printMap(map1);

        System.out.println("\nSolution with optimized algorithm:");
        HashMap<Character, Integer> map2 = demo.getCharCountMapOptimized("AABBBCCCCDDDDD");
        printMap(map2);
    }
}
