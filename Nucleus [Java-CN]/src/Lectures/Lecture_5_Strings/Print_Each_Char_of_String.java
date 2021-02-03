package Lectures.Lecture_5_Strings;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 17/06/2017.
 */
public class Print_Each_Char_of_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("");
        int i=0;
        while(i<str.length())
        {
            System.out.print(str.charAt(i)+" ");
            i++;
        }
    }
}
