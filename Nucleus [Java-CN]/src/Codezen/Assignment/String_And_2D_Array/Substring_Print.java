package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Substring_Print {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        inefficient(str);
        efficient(str);
    }

    public static void inefficient(String str)
    {
        int i = 0, j;
        while (i < str.length()) {
            j = i + 1;
            while (j < str.length() - i + i + 1) {
                int k = i;
                while (k < j) {
                    System.out.print(str.charAt(k));
                    k++;
                }
                System.out.println("");
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void efficient(String str)
    {
        String temp="";
        int i=0,j=0;
        while(i<str.length())
        {
            j=i;
            while(j<str.length())
            {
                temp=temp.concat(str.charAt(j)+"");
                System.out.println(temp);
                j++;
            }
            temp="";
            i++;
        }
    }
}
