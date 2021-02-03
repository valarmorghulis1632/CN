package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 02/07/2017.
 */
public class Return_Paranthesis {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n=scan.nextInt(),count=1;
        String[] ans=return_paranthesis(n,count);
    }

    public static String[] return_paranthesis(int num,int count)
    {
        if(num==1)
        {
            String[] arr={"()"};
            return arr;
        }

        if(count==num)
        {
            String[] arr={""};
            return arr;
        }
        String[] arr={""};
        return arr;
    }
}
