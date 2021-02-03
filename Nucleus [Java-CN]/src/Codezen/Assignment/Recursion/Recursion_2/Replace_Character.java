package Codezen.Assignment.Recursion.Recursion_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Replace_Character {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char c1=scan.next().charAt(0);
        char c2=scan.next().charAt(0);
        System.out.println("CHANGED: "+replace_char(str,c1,c2));
    }

    public static String replace_char(String input,char c1,char c2)
    {
        String temp="";
        if (input.length() == 0)
        {
            return temp;
        }
        String small="";
        if(input.charAt(0)==c1)
        {
            temp=temp.concat(c2+"");
        }
        else
        {
            temp=temp.concat(input.charAt(0)+"");
        }
        int i=1;
        while(i<input.length())
        {
            small=small.concat(input.charAt(i)+"");
            i++;
        }
        return temp.concat(replace_char(small,c1,c2));
    }
}
