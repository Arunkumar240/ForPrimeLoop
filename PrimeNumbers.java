package wbc;

public class PrimeNumbers {

    public static void main(String[] args) {

        int limit = 100;  
        

        System.out.println("The prime numbers between 1 and " + limit + " are:");

        for (int num = 2; num <= limit; num++) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; 
                    break; 
                }
            }
            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}
