public class Primenumber {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 2;

        System.out.println("First 50 prime numbers:"); 

        while (count < 50) {
            if (isPrime(number)) {
                System.out.print(number + "\n");
            }
            count++;
            number++;
        }
    }
}