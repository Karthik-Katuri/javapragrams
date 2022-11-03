import java.io.*;
import java.util.*;
class LCM
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n1,n2,temp,temp1,temp2,hcf,lcm;
        System.out.println("enter a number");
        n1=sc.nextInt();
        System.out.println("enter second num");
        n2 = sc.nextInt();
        temp1=n1;
        temp2=n2;
        while(temp2!=0){
            temp = temp2; //temp=12 //temp1 -26 temp2-12
            temp2=temp1%temp2;
            temp1=temp;
            System.out.println(temp2+"  "+temp1);
        }
        hcf = temp1;
        lcm=(n1*n2)/hcf;
        System.out.println("Hcf of th number is "+hcf);
        System.out.println("lcm of the numbers is "+ lcm);

    }

}
