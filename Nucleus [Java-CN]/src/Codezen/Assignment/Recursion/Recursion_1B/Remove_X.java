package Codezen.Assignment.Recursion.Recursion_1B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Remove_X {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("NEW STRING: "+remove_x(str));
    }

    public static String remove_x(String input)
    {
        String temp="";
        if(input.length()==0)
        {
            return temp;
        }
        if(input.charAt(0)!='x')
        {
            temp=temp.concat(input.charAt(0)+"");
        }
        String small="";
        int i=1;
        while (i<input.length())
        {
            small=small.concat(input.charAt(i)+"");
            i++;
        }
        return temp.concat(remove_x(small));
    }
}
