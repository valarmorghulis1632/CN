package Codezen.Practice_Section.Recursion;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 02/07/2017.
 */
public class Floor_Value {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int elem=scan.nextInt();
        int[] arr=new int[elem];
        fillarray(arr);
        int x=scan.nextInt();
        System.out.println("VAL IS: "+floor_value(arr,0,x));
    }

    public static void fillarray(int[] array)
    {   Scanner scan=new Scanner(System.in);
        int i=0;
        while(i<array.length) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int floor_value(int[] input,int index,int x)
    {
        if(index==input.length || x<input[0])
        {
            return -1;
        }

        if(input[index]>x)
        {
            return input[index-1];
        }
        else if(input[index]<x)
        {
            int back=floor_value(input,index+1,x);
            if(back==-1)
            {
                return -1;
            }
            else
            {
                return back;
            }
        }
        else
        {
            return input[index];
        }
    }
}
