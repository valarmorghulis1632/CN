package Codezen.Assignment.Recursion.Recursion_2B.Return;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 22/06/2017.
 */
public class Permutation_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        String[] arr=permutation_string(str);
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

    public static String[] permutation_string(String str)
    {
        if(str.length()==0)
        {
            String[] arr={""};
            return arr;
        }

        String[] back=permutation_string(str.substring(1));
        String[] ans=new String[fact(str.length())];
        int i=0,k=0;
        if(back[0].equals(""))
        {
            while(i<back.length)
            {
                ans[k] = str.charAt(0) + back[i];
                k++;
                i++;
            }
            return ans;
        }
        while(i<back.length) {
            ans[k] = str.charAt(0) + back[i];
            k++;
            ans[k] = back[i] + str.charAt(0);
            k++;
            i++;
        }

        i=0;
        while(i<back.length)
        {
            int j=1;
            while(j<back[i].length())
            {
                ans[k]=back[i].substring(0,j)+ str.charAt(0)+back[i].substring(j);
                k++;
                j++;
            }
            i++;
        }
        return ans;
    }

    public static int fact(int num)
    {
        int prod=1;
        if(num==0)
            return 1;
        while(num>0)
        {
            prod=prod*num;
            num--;
        }
        return prod;
    }
}
