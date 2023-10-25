import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>(); //creates List that gets from a new ArrayList
        int count = 0;
        int number =2;

        while (count < 100) {
            if (isPrime(number) == true) {
                primes.add(number);
                count++;
            }
            number++;
        }
        Iterator<Integer> s = primes.iterator();
        while (s.hasNext()){
            System.out.println(s.next());
        }
       /* for (Integer prime : primes) {//prints the list of prime numbers
            System.out.println(prime);
        }*/
        System.out.println("The size is " + primes.size());//prints out the size for the list
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
