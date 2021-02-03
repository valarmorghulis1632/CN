package Codezen.Assignment.Time_Complexity_Optimized_Codes.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 04/07/2017.
 */
public class Power_of_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int n=scan.nextInt();
        System.out.println("ANSWER IS : "+power_of_num_optimized(x,n));
    }

    public static long power_of_num_optimized(int x,int n)
    {
        if(n==1)
        {
            return x;
        }
        if(n==0)
        {
            return 1;
        }

        if(n%2==0)
        {
            long ans=power_of_num_optimized(x,n/2);
            return ans*ans;
        }
        else
        {
            long ans=power_of_num_optimized(x,n/2);
            return ans*ans*x;
        }
    }
}
