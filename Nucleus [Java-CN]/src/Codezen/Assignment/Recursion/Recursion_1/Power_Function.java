package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Power_Function {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        System.out.println("X^N: "+power(x,n));
    }

    public static int power(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        else if(n==0)
        {
            return 1;
        }
        int ans=power(x,n-1);
        if(ans==1)
        {
            return ans;
        }
        else
        {
            return x*ans;
        }
    }
}
