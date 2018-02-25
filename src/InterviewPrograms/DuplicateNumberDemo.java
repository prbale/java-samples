package InterviewPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Program: Find out duplicate number between 1 to N numbers.
 */
public class DuplicateNumberDemo {

    private int findDuplicateNumber(List<Integer> numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (Integer val : numbers) {
            if(map.containsKey(val)) {
                map.put(val, map.get(val) + 1);
            }
            else {
                map.put(val,1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        numbers.add(12);
        numbers.add(14);
        numbers.add(16);
        numbers.add(19);
        numbers.add(2);

        DuplicateNumberDemo demo = new DuplicateNumberDemo();
        int result = demo.findDuplicateNumber(numbers);
        System.out.println("Duplicate Number : " + result);
    }

}
