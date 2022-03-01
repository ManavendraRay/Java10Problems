/*Write a Java program to calculate Permutation and Combination of 2 numbers.*/
import java.util.Scanner;

public class PC {
    static int factorial(int n) {
        int fact = 1;
        for(int i = 2; i<=n; i++) {
            fact *= i;
        }
        return fact;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number to calculate Permutation and Combination: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int permu = factorial(a) / factorial(b);
        System.out.println("Permutation: " + permu);
        int combo = factorial(a) / (factorial(b) * factorial(a-b));
        System.out.println("Combination: " + combo);
    }
}