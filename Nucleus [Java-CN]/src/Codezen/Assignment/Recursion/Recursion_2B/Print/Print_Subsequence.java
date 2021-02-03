package Codezen.Assignment.Recursion.Recursion_2B.Print;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 24/06/2017.
 */
public class Print_Subsequence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.next();
        String result="";
        print_subsequence(input,result);
    }

    public static void print_subsequence(String input,String result)
    {
        if(input.length()==0)
        {
            System.out.println(result);
            return;
        }

        print_subsequence(input.substring(1),result);
        print_subsequence(input.substring(1),result+input.charAt(0));
    }



    /**
     * public static void print_subsequence(String input)
     {
     if(input.length()==0)
     {
     System.out.println("");
     return;
     }
     int i=0;
     String temp="";
     System.out.println(input.charAt(0));
     while(i<input.substring(1).length())
     {
     temp="";
     int j=i;
     while (j<input.substring(1).length())
     {
     temp=temp.concat(input.substring(1).charAt(j)+"");
     System.out.println(input.charAt(0)+temp);
     j++;
     }
     i++;
     }
     print_subsequence(input.substring(1));
     }
     */
}
