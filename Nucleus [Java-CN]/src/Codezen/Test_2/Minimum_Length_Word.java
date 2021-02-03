package Codezen.Test_2;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 10/07/2017.
 */
public class Minimum_Length_Word {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        input=input.concat(" ");
        int i=0,init=0,small=Integer.MAX_VALUE;
        String temp="",temp_1="";
        while(i<input.length())
        {
            if(input.charAt(i)==' ')
            {
                temp=input.substring(init,i);
                if(small>temp.length())
                {
                    small=temp.length();
                    temp_1=temp;
                }
                init=i+1;
            }
            i++;
        }
        System.out.println(temp_1);
    }
}
