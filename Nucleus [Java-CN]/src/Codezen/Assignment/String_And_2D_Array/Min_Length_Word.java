package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Min_Length_Word {
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

//    public static void rotate(int[] array,int times)
//    {
//        int i=0,j;
//        while(i<times)
//        {
//            j=array.length-1;
//            int temp_2=array[j];
//            while(j>=0)
//            {
//                array[j]=array[j-1];
//                j--;
//            }
//            array[0]=temp_2;
//            i++;
//        }
//    }
}
