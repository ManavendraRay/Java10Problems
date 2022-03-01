/*Write a Java Program to reverse the letters present in the given String.*/
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        char ch;
        System.out.print("Original Word : ");
        String s = sc.nextLine();
        for(int i = 0; i<s.length(); i++) {
            ch = s.charAt(i);
            str = ch + str;
        }
        System.out.println("Reversed word: " + str);
    }    
}