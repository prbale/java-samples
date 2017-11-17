package Multithreading.Callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Prashant on 27-11-2016.
 */
public class CallableExample {

    public static void main(String[] args) {

/*
        FactorialCalculator instance = new FactorialCalculator(5);

        int result = 0;
        try {
            result = instance.call();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Result : " + result);
*/

        List<Future<Integer>> futureResultList = new ArrayList<>();

        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);

        Random random = new Random();

        for(int i=0; i < 4; i++ ) {

            Integer number = random.nextInt(10);

            FactorialCalculator instance = new FactorialCalculator(number);

            Future<Integer> result = executor.submit(instance);

            futureResultList.add(result);

        }


        for(Future<Integer> future : futureResultList) {

            try {
                System.out.println("Future result is : " + future.get() + " ; and Task is done : " + future.isDone());

            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor service.
        executor.shutdown();

    }

}
