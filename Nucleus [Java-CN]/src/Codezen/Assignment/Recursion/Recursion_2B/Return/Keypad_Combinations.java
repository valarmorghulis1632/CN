package Codezen.Assignment.Recursion.Recursion_2B.Return;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 22/06/2017.
 */
public class Keypad_Combinations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String[] arr=keypad_combo(num);
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

    public static String[] keypad_combo(int num)
    {

        if(num==0)
        {
            String str[]={""};
            return str;
        }
        String corresp=get_string(num%10);
        String[] back=keypad_combo(num/10);
        if(num==1)
        {
            return back;
        }
        String[] temp=new String[corresp.length()*back.length];
        int i=0,j,k=0;
        while (i<corresp.length())
        {
            j=0;
            while(j<back.length)
            {
                temp[k]=back[j].concat(corresp.charAt(i)+"");
                k++;
                j++;
            }
            i++;
        }

        return temp;

    }

    public static String get_string(int num)
    {
        String[] arr={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[num];
    }

}
