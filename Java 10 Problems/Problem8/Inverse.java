/*Write a Java Program to check whether the given array is Mirror Inverse or not.*/
import java.util.Scanner;
public class Inverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements of array : ");
        for(int i = 0; i<size; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean flag = true;
        for(int i = 0; i<arr.length; i++) {
            if(arr[arr[i]] != i) flag = false;
        }
        if(flag)
            System.out.println("Yes, The Given Array is Mirror Inverse.");
        else
            System.out.println("No, The Given Array is not Mirror Inverse.");
    }
}