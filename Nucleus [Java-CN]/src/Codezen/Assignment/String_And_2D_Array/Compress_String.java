package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 20/06/2017.
 */
public class Compress_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println(""+compress(str));
    }

    public static String compress(String inputString)
    {
        int i=0,count=1;
        String str="";
        while(i<inputString.length()-1)
        {
            int j=i+1;
            count=1;
            while(j<inputString.length() && inputString.charAt(j)==inputString.charAt(i))
            {
                count++;
                if(count==2)
                {
                    str=str.concat(inputString.charAt(j)+"");
                }
                j++;
            }
            if(count!=1)
            {
                str=str.concat(count+"");
            }
            else
            {
                str=str.concat(inputString.charAt(i)+"");
            }
            i=i+count;
        }
        if(i==inputString.length()-1)
        {
            str=str.concat(inputString.charAt(i)+"");
        }
        return str;
    }
}
