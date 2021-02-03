package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Sine_Wave {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        get_multi_D_array(arr);
        sine_wave(arr);
    }

    public static void get_multi_D_array(int[][] arr)
    {
        Scanner scan=new Scanner(System.in);
        int i=0,j=0;
        while(i<arr.length)
        {
            j=0;
            while (j<arr[0].length)
            {
                arr[i][j]=scan.nextInt();
                j++;
            }
            i++;
        }
    }

    public static void sine_wave(int[][] input)
    {
        int j=0,i;
        while(j<input[0].length)
        {
            if(j%2==0)
            {
                i=0;
                while (i<input.length)
                {
                    System.out.print(input[i][j]+" ");
                    i++;
                }
                j++;
            }
            else
            {
                i=input.length-1;
                while(i>=0)
                {
                    System.out.print(input[i][j]+" ");
                    i--;
                }
                j++;
            }
        }
    }
}
