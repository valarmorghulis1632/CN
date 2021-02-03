/*QUESTION -
Write a program to determine whether the entered character
is in upper case or lower case, or is an invalid character.
*/

package Lectures.Lecture_2_Programming_Fundamentals.Assignment_2A;

/**
 * Created by Ayush Deshwal on 12/06/2017.
 */
import java.util.Scanner;
public class Upper_or_Lower_Case
{
    public static void main(String[] args)
    {
       Scanner scan=new Scanner(System.in);
        System.out.println("ENTER THE CHARACTER TO BE TESTED: ");
       char character=scan.next().charAt(0);
       if(upper(character))
//           System.out.println(character + " is an UPPER CASE one");
           System.out.println(1);
       else if(lower(character))
           System.out.println(character + " is an LOWER CASE one");
       else System.out.println(character+" is an INVALID one (Niether Upper case nor Lower case)");
    }

    public static boolean lower(char ch)
    {
        if(ch>=97 && ch<=122)
            return true;
        else return false;
    }

    public static boolean upper(char ch)
    {
        if(ch>=65 && ch<=90)
            return true;
        else return false;
    }
}
