package Codezen.Practice_Section.Strings;

import java.util.Scanner;

public class Two_Non_Overlapping_Substrings {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(two_non_overlapping_substrings(str));
    }

    public static boolean two_non_overlapping_substrings(String str)
    {
        if(str.length()<2)
        {
            return false;
        }
        int i=0,j;
        try
        {
            while (i!=str.length()-1)
            {
                if(str.substring(i,i+2).equals("AB"))
                {
                    j=i+2;
                    while (j!=str.length()-1)
                    {
                        if(str.substring(j,j+2).equals("BA"))
                        {
                            return true;
                        }
                        j++;
                    }
                }
                else if(str.substring(i,i+2).equals("BA"))
                {
                    j=i+2;
                    while (j!=str.length()-1)
                    {
                        if(str.substring(j,j+2).equals("AB"))
                        {
                            return true;
                        }
                        j++;
                    }
                }
                i++;
            }
        }
        catch(Exception e)
        {

        }
        return false;
    }
}
