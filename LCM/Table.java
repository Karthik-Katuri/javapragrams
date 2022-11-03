import java.io.*;
import java.util.*;
class Table
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int a = sc.nextInt();
        int mul=1 ,i;
        int n = 10;
        for ( i = 1; i <= n;i++)
        {
             mul = a*i;
            System.out.println(a + " * "+ i +" = "+ mul);

        }

    }

}
