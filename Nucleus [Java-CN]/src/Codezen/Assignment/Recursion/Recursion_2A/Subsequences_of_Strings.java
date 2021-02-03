package Codezen.Assignment.Recursion.Recursion_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 22/06/2017.
 */
public class Subsequences_of_Strings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] arr=subsequence(str);
        int i=0;
        while(i<arr.length)
        {
            int j=0;
            while(j<arr[i].length())
            {
                System.out.print(arr[i].charAt(j)+" ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static String[] subsequence(String input)
    {
        if(input.length()==0)
        {
            String[] arr={""};
            return arr;
        }

        String[] back=subsequence(input.substring(1));
        String[] ans=new String[2*back.length];
        int i=0,k=0;
        while(i<back.length)
        {
            ans[k]=back[i];
            k++;
            i++;
        }
        i=0;
        while(i<back.length)
        {
            ans[k]=ans[k]=input.charAt(0)+back[i];
            k++;
            i++;
        }
        return ans;
    }
}
