package Codezen.Assignment.Recursion.Recursion_1;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Sum_1_to_N {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println("SUM IS: "+sum(n));
    }

    public static int sum(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }

        return n+sum(n-1);
    }
}
