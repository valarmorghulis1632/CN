package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Remove_Character_X {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        char x=scan.next().charAt(0);
        System.out.println(""+remove_x(str,x));
    }

    public static String remove_x(String input,char c)
    {
        int i=0;
        String str="";
        while(i<input.length())
        {
            if(input.charAt(i)!=c)
            {
                str=str.concat(input.charAt(i)+"");
            }
            i++;
        }
        return str;
    }
}
