package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Find_Largest_Sum_Row_or_Col {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        get_multi_D_array(arr);
        calc_max(arr);
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

    public static void calc_max(int[][] input)
    {
        int large=Integer.MIN_VALUE;
        int i=0,j;
        int col_sum[]=new int[input[0].length];
        int row_sum,pos_row=0;
        while(i<input.length)
        {
            row_sum=0;
            j=0;
            while (j<input[0].length)
            {
                col_sum[j]=col_sum[j]+input[i][j];
                row_sum=row_sum+input[i][j];
                j++;
            }
            if(large<row_sum)
            {
                large=row_sum;
                pos_row=i;
            }
            i++;
        }

        j=0;
        int pos_col=-1;
        while(j<input[0].length)
        {
            if(large<col_sum[j])
            {
                large=col_sum[j];
                pos_col=j;
            }
            j++;
        }
        if(pos_col!=-1)
        {
            System.out.println("column "+pos_col+" "+col_sum[pos_col]);
        }
        else
        {
            System.out.println("row "+pos_row+" "+large);
        }
    }
}
