package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 05/07/2017.
 */
public class Take_Number_to_1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("MIN WAYS: "+take_num_to_1(num));
    }

    public static int take_num_to_1(int n)
    {
        if(n==1)
        {
            return 0;
        }
        int ans=Integer.MIN_VALUE;

        if(n%2!=0 && n%3!=0)
        {
            System.out.println("***");
            ans=take_num_to_1(n-1);
        }
        else if(n%3==0)
        {
            System.out.println("&&&");
            ans=take_num_to_1(n/3);
        }
        else if(n%2==0)
        {
            System.out.println("^^^");
            ans=take_num_to_1(n/2);
        }
        return ans+1;
    }
}
