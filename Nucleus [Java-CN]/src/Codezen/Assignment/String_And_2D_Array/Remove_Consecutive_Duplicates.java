package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Remove_Consecutive_Duplicates {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=remove(str1);
        System.out.println("\n"+str2);
    }

    public static String remove(String input)
    {
        int i=1;
        String str="";
        str=str.concat(input.charAt(0)+"");
        while(i<input.length())
        {
            if(input.charAt(i)==input.charAt(i-1))
            {
                i++;
            }
            else
            {
                str=str.concat(input.charAt(i)+"");
                i++;
            }
        }
        return str;
    }
}
