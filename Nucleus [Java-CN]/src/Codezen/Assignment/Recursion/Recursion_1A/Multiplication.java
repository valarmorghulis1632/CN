package Codezen.Assignment.Recursion.Recursion_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Multiplication {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        System.out.println("PRODUCT IS: "+multiply(m,n));
    }

    public static int multiply(int m,int n)
    {
        if(n==1)
        {
            return m;
        }
        else if(n==0 || m==0)
        {
            return 0;
        }

        return m+multiply(m,n-1);
    }
}
