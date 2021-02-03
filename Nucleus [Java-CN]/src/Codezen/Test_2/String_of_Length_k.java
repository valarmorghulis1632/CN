package Codezen.Test_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 10/07/2017.
 */
public class String_of_Length_k {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.next();
        int k=scan.nextInt();
        String[] ans=string_length_k(input,k);
        int i=0;
        while(i<ans.length)
        {
            System.out.println(ans[i]);
            i++;
        }
    }

    public static String[] string_length_k(String input,int k)
    {
        if(k==0)
        {
            String[] arr={""};
            return arr;
        }

        String[] back=string_length_k(input,k-1);
        String[] ans=new String[input.length()*back.length];
        int i=0,j=0,l;
        while(i<input.length())
        {
            l=0;
            while(l<back.length)
            {
                ans[j]=input.charAt(i)+back[l];
                l++;
                j++;
            }
            i++;
        }
        return ans;
    }
}
