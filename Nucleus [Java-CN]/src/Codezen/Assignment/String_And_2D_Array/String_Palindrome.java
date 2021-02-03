package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class String_Palindrome {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        int i=0,count=0;
        while(i<(str.length()/2))
        {
            if(str.charAt(i)==str.charAt(str.length()-i-1))
            {
                count++;
            }
            i++;
        }
        if(count==str.length()/2)
            System.out.println("\nITS A PALINDROME");
        else System.out.println("\nIT ISN'T A PALINDROME");
    }
}
