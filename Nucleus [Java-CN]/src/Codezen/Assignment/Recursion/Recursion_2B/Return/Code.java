package Codezen.Assignment.Recursion.Recursion_2B.Return;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 28/06/2017.
 */
public class Code
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String[] ans = code(num);
        int i = 0;
        while (i < ans.length) {
            System.out.println(ans[i]);
            i++;
        }
    }

    public static String[] code(int num)
    {
        if (num == 0) {
            String[] arr = {""};
            return arr;
        }
        String[] back = code(num / 10);
        int n = ((num / 10) % 10) * 10 + (num % 10);
        if (n <= 26 && n > 9)
        {
            String back_1[] = code(num / 100);
            String[] ans_1 = new String[back.length + back_1.length];
            int i = 0, k = 0;
            while (i < back.length) {
                ans_1[k] = back[i].concat((char) (96 + num % 10) + "");
                i++;
                k++;
            }
            int j = 0;
            while (j < back_1.length)
            {
                ans_1[k] = back_1[j].concat((char) (96 + n) + "");
                j++;
                k++;
            }
            return ans_1;
        }
        else
        {
            String[] ans_2 = new String[back.length];
            int i = 0;
            while (i < back.length)
            {
                ans_2[i] = back[i].concat((char) (96 + num % 10) + "");
                i++;
            }
            return ans_2;
        }
    }
}
