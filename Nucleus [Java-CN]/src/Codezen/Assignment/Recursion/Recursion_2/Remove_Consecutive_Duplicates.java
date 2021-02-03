package Codezen.Assignment.Recursion.Recursion_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Remove_Consecutive_Duplicates {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("CHANGED: "+remove_consec_duplicates(str));
    }

    public static String remove_consec_duplicates(String s)
    {
        String temp="";
        if(s.length()==1)
        {
            return temp.concat(s.charAt(0)+"");
        }
        String small="";
        if(s.charAt(0)!=s.charAt(1))
        {
            temp = temp.concat(s.charAt(0) + "");
        }
        int i=1;
        while (i<s.length())
        {
            small=small.concat(s.charAt(i)+"");
            i++;
        }
        return temp.concat(remove_consec_duplicates(small));
    }
}
