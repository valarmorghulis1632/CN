package Codezen.Assignment.Recursion.Recursion_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Geometric_Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int k=scan.nextInt();
        System.out.println("SUM IS: "+geometric_sum(k));
    }

    public static double geometric_sum(int k)
    {
        if(k==0)
        {
            return 1;
        }
        double small_ans=1.0/(Math.pow(2,k));
        return small_ans+geometric_sum(k-1);
    }
}
