package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Highest_Occurence {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(""+highest_occur(str));
    }

    public static char highest_occur(String inputString)
    {
        int[] arr=new int[26];
        int[] pos=new int[26];
        int i=0,k=0;
        while(i<inputString.length())
        {
            if(inputString.charAt(i)!=' ')
            {
                int index=(int)inputString.charAt(i);
                arr[index-97]++;
            }
            if(arr[(int)inputString.charAt(i)-97]==1)
            {
                pos[(int)inputString.charAt(i)-97]=i;
            }
            i++;
        }

        i=0;
        int large=Integer.MIN_VALUE,loc=0;
        while(i<arr.length)
        {
            if(large<arr[i])
            {
                large=arr[i];
                loc=i;
            }
            if(large==arr[i] && pos[loc]>pos[i])
            {
                loc=i;
            }
            i++;
        }
        return (char)(loc+97);
    }
}
