package Codezen.Practice_Section.Pattern;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 16/06/2017.
 */
public class Mirror_Image_Triangle {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row=scan.nextInt();
        int i=1,j;
        while(i<=row+1)
        {
            j=1;
            while(j<=row-i+1)
            {
                System.out.print(" ");
                j++;
            }
            j=1;
            int k=i-1;
            while(j<=(2*i)-1)
            {
                if(j<=i)
                {
                    System.out.print(k--);
                }
                else
                {
                    if(j==i+1)
                    {
                        k++;
                    }
                    System.out.print(++k);
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
