package ExtraMile;

import java.util.Scanner;

public class MainBug {
    public static void main(String[] args) {
        //Scanner s = new Scanner(System.out);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        //int end = start = s.nextInt();
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            //if (isPrime(i+1)) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
            //return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i += 2) {
            //if (n % i != 0) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
