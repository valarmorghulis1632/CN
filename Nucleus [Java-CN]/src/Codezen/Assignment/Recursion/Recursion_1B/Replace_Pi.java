package Codezen.Assignment.Recursion.Recursion_1B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Replace_Pi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("CHANGED: "+replace_pi(str));
    }

    public static String replace_pi(String str)
    {

        if(str.length()==1)
        {
            String temp="";
            return temp.concat(str.charAt(0)+"");
        }
        String temp="";
        String str_1 = "";
        if(str.charAt(0)=='p' && str.charAt(1)=='i')
        {
            temp=temp.concat(3.14+"");
            int i=2;
            while(i<str.length())
            {
                str_1=str_1.concat(str.charAt(i)+"");
                i++;
            }
        }
        else
        {
            temp = temp.concat(str.charAt(0) + "");
            int i = 1;
            while (i < str.length()) {
                str_1 = str_1.concat(str.charAt(i) + "");
                i++;
            }
        }
        System.out.println(temp+" * "+str_1);
        return temp.concat(replace_pi(str_1));
    }
}
