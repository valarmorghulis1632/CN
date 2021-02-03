package Codezen.Assignment.Recursion.Recursion_1A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Check_Palindrome {
    public static void main(String[] args)
        {
            Scanner scan=new Scanner(System.in);
            String str=scan.nextLine();
            boolean check=check_palindrome(str);
            System.out.println(check);
        }

        public static boolean check_palindrome(String str)
        {
            if(str.length()==0 || str.length()==1)
            {
                return true;
            }
            if(str.charAt(0)!=str.charAt(str.length()-1))
            {
                return false;
            }

            String small_str="";
            int i=0;
            while(i<str.length()-2)
            {
                small_str=small_str.concat(str.charAt(i+1)+"");
                i++;
            }
            System.out.println(small_str);
            return check_palindrome(small_str);
        }
}
