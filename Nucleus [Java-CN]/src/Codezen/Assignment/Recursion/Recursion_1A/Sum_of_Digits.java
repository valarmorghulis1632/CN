package Codezen.Assignment.Recursion.Recursion_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Sum_of_Digits {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("SUM IS: "+sum(num));
    }

    public static int sum(int num)
    {
        if(num==0)
        {
            return 0;
        }
        int dig=num%10;
        num=num/10;
        return dig+sum(num);
    }
}
