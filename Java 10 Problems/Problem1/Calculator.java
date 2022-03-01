/*Write a Java Program to perform basic Calculator operations*/

import java.util.Scanner;
class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("1.Add \n2.Substract \n3.Multiply \n4.Divide \n5.Modulo");
        int opr = sc.nextInt();
        switch(opr) {
            case 1: System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case 2: System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            break;
            case 3: System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
            case 4: System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            break;
            case 5: System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
            break;
            default: System.out.println("Enter a valid arithmetic operation");
        }
    }
}