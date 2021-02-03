package Codezen.Practice_Section.Strings;

import java.util.Scanner;

public class Amazing_Strings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str1=scan.next();
        String str2=scan.next();
        String str3=scan.next();
        amazing_strings(str1,str2,str3);
    }

    public static void amazing_strings(String str1,String str2,String str3)
    {
        String[] ans=subsequence(str3);
        int flag=0;
        int i=0;
        while (i<ans.length)
        {
            if(ans[i].equals(str1))
            { flag++; }
            else if(ans[i].equals(str2))
            { flag++; }
            i++;
        }
        if(flag>=2)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
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


