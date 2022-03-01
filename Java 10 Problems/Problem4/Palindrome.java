/*Write a Java program to find out whether the given String is Palindrome or not.*/
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a, b = "";
        a = sc.nextLine();
        int n = a.length();
        for(int i = n - 1; i>=0; i--) {
            b += a.charAt(i);
        }
        if(a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        }
        else {
            System.out.println("The string is not palindrome.");
        }
    }
}