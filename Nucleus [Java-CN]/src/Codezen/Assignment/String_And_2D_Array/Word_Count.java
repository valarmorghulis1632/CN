package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Word_Count {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        int i=0,count=0;
        String temp="";
        while(i<str.length())
        {
            temp="";
            temp=temp.concat(str.charAt(i)+"");
            if(temp.equals(" "))
            {
                count++;
            }
            if(i==str.length()-1)
            {
                count++;
            }
            i++;
        }
        System.out.println("\n"+count);
    }
}
