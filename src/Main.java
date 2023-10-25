import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        List<Integer> primes = new ArrayList<>(); //creates List that oulld from ArrayList
        int count = 0;
        int number =1;

        while (count < 100) {
            if (isPrime(number) == true) {
                primes.add(number);
                count++;
            }
            else
                exit(6);
            number++;
        }

        for (Integer prime : primes) {
            System.out.println(prime);
        }
        System.out.println("The size is " + primes.size());
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            System.out.println("You are supposed to start at the number 2");
            return false;
        }
//this checks to see if it has any other factors
        for ( int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i ==0) {
                return false;
            }
        }

        return true;
    }
}
