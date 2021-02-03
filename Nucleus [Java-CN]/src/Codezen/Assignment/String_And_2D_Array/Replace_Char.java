package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Replace_Char {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        char c1=scan.next().charAt(0),c2=scan.next().charAt(0);
        int i=0;
        String str_1="";
        while(i<str.length())
        {
            if(str.charAt(i)!=c1)
            {
               str_1=str_1.concat(str.charAt(i)+"");
            }
            else
            {
                str_1=str_1.concat(c2+"");
            }
            i++;
        }
        System.out.println("\nCHANGED STRING IS: "+str_1);
    }

//    public static void cut()
//    {
//        int j=0;
//
//            while(j<l)
//            {
//                arr[j]=str.charAt(j+k);
//                j++;
//            }
//
//    }
}
