package Multithreading.Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by Prashant on 27-11-2016.
 */
public class FactorialCalculator implements Callable<Integer> {

    private Integer number;

    public FactorialCalculator(Integer num) {
        this.number = num;
    }

    @Override
    public Integer call() throws Exception {

        int result = 1;

        if(number == 0 || number == 1) {
            result = 1;
        }
        else {
            for(int i=2 ; i <= number ; i++ ) {
                result *= i;
                TimeUnit.MILLISECONDS.sleep(20);
            }
        }

        System.out.println("Result : " + result);

        return result;
    }
}
