package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Reverse_Each_Word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        str=str.concat(" ");
        int i=0,init=0;
        String final_Str= "";
        while(i<str.length())
        {
            if(str.charAt(i)==' ')
            {
                String temp=str.substring(init,i);
                temp=reverse(temp);
                final_Str=final_Str.concat(temp)+" ";
                init=i+1;
            }
            i++;
        }
        System.out.println("");
        disp(final_Str);
    }
    public static void disp(String final_Str)
    {
        int i=0;
        while(i<final_Str.length())
        {
            System.out.print(final_Str.charAt(i));
            i++;
        }
    }

    public static String reverse(String str)
    {
        int i=str.length()-1;
        String ret="";
        while(i>=0)
        {
            ret=ret.concat(str.charAt(i)+"");
            i--;
        }
        return ret;
    }
}
