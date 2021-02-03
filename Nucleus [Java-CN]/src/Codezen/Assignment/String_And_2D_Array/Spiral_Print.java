package Codezen.Assignment.String_And_2D_Array;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 19/06/2017.
 */
public class Spiral_Print {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int col=scan.nextInt();
        int[][] arr=new int[row][col];
        get_multi_D_array(arr);
        printSpiral(arr);
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

    public  static void printSpiral(int[][] matrix)
    {
        int m=matrix.length;
        int n=matrix[0].length;
        int i,k=0,l=0;
        while(k<m && l<n)
        {
            i=l;
            while(i<n)
            {
                System.out.print(matrix[k][i]+" ");
                i++;
            }
            k++;
            i=k;
            while(i<m)
            {
                System.out.print(matrix[i][n-1]+" ");
                i++;
            }
            n--;
            if(k<m)
            {
                i=n-1;
                while (i>=l)
                {
                    System.out.print(matrix[m-1][i]+" ");
                    i--;
                }
                m--;
            }
            if(l<n)
            {
                i=m-1;
                while(i>=k)
                {
                    System.out.print(matrix[i][l]+" ");
                    i--;
                }
                l++;
            }
        }
    }
}
