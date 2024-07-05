//This program shows Exception Handling using throw and throws in Java

import java.util.Scanner;
public class ThrowandThrows {
    public static void main(String args[])
    {
        try
        {
            methodA();
            System.out.println("Exit try block of main method");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Arithmetic Exception caught");
            ex.printStackTrace();
        }
        System.out.println("Exit main method");
    }
    static void methodA() throws ArithmeticException
    {
        Scanner sc = new Scanner(System.in);
        int a = 5,c;
        System.out.print("Enter b value = ");
        int b = sc.nextInt();
        sc.close();
        if(b == 0)
        {
            throw new ArithmeticException();
        }
        else
        {
            c = a/b;
            System.out.println("c = "+c);
        }
        System.out.println("Exit methodA");
    }
}