import java.io.*;
import java.util.*;
class Leapyear
{
public static void main (String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("enter a year");
int a = sc.nextInt();
if(a%4==0 && a%400==0 && a%100!=0)
{
System.out.println("leap year");
}
else
{
System.out.println("not a leap year");
}
}
}

