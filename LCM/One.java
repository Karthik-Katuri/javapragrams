import java.io.*;
import java.util.*;
class One
{
    public static void main (String args[])
    {
       Scanner sc= new Scanner(System.in);

       int a = 0,sum=0,s;
        System.out.println("enter a number");

        while(true) {
            s = sc.nextInt();
            if (s == -1) {
                System.out.println("Sum value is " + sum);
                break;
            }
            sum = sum + s;
        }

    }

}
