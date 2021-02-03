package Codezen.Assignment.Recursion.Recursion_2B.Return;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 27/06/2017.
 */
public class Subsets_Sum_to_k {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int elem = scan.nextInt();
        int[] input = new int[elem];
        fillarray(input);
        int k = scan.nextInt();
        int[][] ans = subset_sum_to_k(input, 0, k);
        int i = 0, j;
        while (i < ans.length) {
            j = 0;
            while (j < ans[i].length) {
                System.out.print(ans[i][j] + " ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }

    public static void fillarray(int[] array) {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            array[i] = scan.nextInt();
            System.out.print(" ");
            i++;
        }
    }

    public static int[][] subset_sum_to_k(int[] input, int index, int sum) {
        if (index == input.length)
        {
            if (sum == 0)
            {
                int[][] arr = new int[1][0];
                return arr;
            }
            else
            {
                int[][] arr = new int[0][0];
                return arr;
            }
        }

        int[][] back_1 = subset_sum_to_k(input, index + 1, sum);
        int[][] back_2 = subset_sum_to_k(input, index + 1, sum - input[index]);
        int[][] ans = new int[back_1.length + back_2.length][];

        if (back_1.length == 0 && back_2.length == 0)
        {
            return back_1;
        }
        else if (back_1.length == 0 && back_2.length != 0)
        {
            int i = 0, j;
            while (i < back_2.length)
            {
                ans[i] = new int[back_2[i].length + 1];
                ans[i][0] = input[index];
                j = 0;
                while (j < back_2[i].length)
                {
                    ans[i][j + 1] = back_2[i][j];
                    j++;
                }
                i++;
            }
            return ans;
        }
        else if (back_1.length != 0 && back_2.length == 0)
        {
            int i = 0, j;
            while (i < back_1.length)
            {
                ans[i] = new int[back_1[i].length];
                j = 0;
                while (j < back_1[i].length)
                {
                    ans[i][j] = back_1[i][j];
                    j++;
                }
                i++;
            }
            return ans;
        }
        else
        {
            int i = 0, j, k = 0;
            while (i < back_2.length)
            {
                ans[k] = new int[back_2[i].length + 1];
                ans[k][0] = input[index];
                j = 0;
                while (j < back_2[i].length)
                {
                    ans[k][j + 1] = back_2[i][j];
                    j++;
                }
                i++;
                k++;
            }
            i = 0;
            while (i < back_1.length)
            {
                ans[k] = new int[back_1[i].length];
                j = 0;
                while (j < back_1[i].length)
                {
                    ans[k][j] = back_1[i][j];
                    j++;
                }
                i++;
                k++;
            }
            return ans;
        }
    }
}
