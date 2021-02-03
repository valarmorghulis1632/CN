package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Check_Permutation {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.nextLine();
        String str2=scan.nextLine();
        boolean check=check(str1,str2);
        System.out.println("\n"+check);
    }

    public static boolean check(String input1,String input2)
    {
        if(input1.length()!=input2.length())
        {
            return false;
        }

        int[] count_1=new int[59];
        int[] count_2=new int[59];
        int i=0;
        while(i<input1.length())
        {
            int index=(int)input1.charAt(i);
            if(input1.charAt(i)==' ')
            {
                count_1[index-6]++;
            }
            else
            {
                count_1[index-65]++;
            }
            i++;
        }
        i=0;
        while (i<input2.length())
        {
            int index=(int)input2.charAt(i);
            if(input2.charAt(i)==' ')
            {
                count_2[index-6]++;
            }
            else
            {
                count_2[index-65]++;
            }
            i++;
        }
        i=0;
        while(i<count_1.length)
        {
            if(count_1[i]!=count_2[i])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
