package Codezen.Test_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Armstrong_Num {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        int dig=0,sum=0,n=num,no_of_digits=0;
        while(n!=0)
        {
            n=n/10;
            no_of_digits++;
        }
        n=num;
        while (n!=0)
        {
            dig=n%10;
            sum=sum+power(dig,no_of_digits);
            n=n/10;
        }
        if(sum==num)
            System.out.println(true);
        else System.out.println(false);
    }

    public static int power(int x,int n)
    {
        int i=1,equiv=1;
        while(i<=n)
        {
            equiv=equiv*x;
            i++;
        }
        return equiv;
    }
}
