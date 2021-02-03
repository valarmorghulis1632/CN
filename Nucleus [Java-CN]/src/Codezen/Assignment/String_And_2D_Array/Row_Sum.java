package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 18/06/2017.
 */
public class Row_Sum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
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

        i=0;
        int sum_row;
        while(i<arr.length)
        {
            sum_row=0;
            j=0;
            while (j<arr[0].length)
            {
                sum_row=sum_row+arr[i][j];
                j++;
            }
            System.out.print(sum_row+" ");
            i++;
        }
    }
}
