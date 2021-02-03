package Codezen.Assignment.Recursion.Recursion_1B;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class String_to_Integer {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("EQUIVALENT INTEGER: "+str_to_int(str));
        System.out.println(Character.getNumericValue(str.charAt(0)));
    }

    public static int str_to_int(String input)
    {
        if(input.length()==1)
        {
            return ((int)(input.charAt(0))-48);
        }
        int i=1;
        String small="";
        while (i<input.length())
        {
            small = small.concat(input.charAt(i) + "");
            i++;
        }
        i=1;
        int dig=((int)(input.charAt(0))-48);
        while(i<input.length())
        {
            dig=dig*10;
            i++;
        }
        return dig+str_to_int(small);
    }
}
