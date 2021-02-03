/**
 * a. The string begins with an 'a'
 * b. Each 'a' is followed by nothing or an 'a' or "bb"
 * c. Each "bb" is followed by nothing or an 'a'
 */
package Codezen.Assignment.Recursion.Recursion_2A;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 27/06/2017.
 */
public class Check_AB {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        System.out.println(check_ab(input));
    }

    public static boolean check_ab(String input)
    {
        if(input.length()==0)
        {
            return true;
        }
        if(input.charAt(0)!='a')
        {
            return false;
        }
        else
        {
            if(input.substring(1).length()==0)
            {
                return true;
            }
            else if(input.charAt(1)=='a')
            {
                return check_ab(input.substring(1));
            }
            else if(input.substring(1).length()>=2 && input.substring(1,3).equals("bb"))
            {
                return check_ab(input.substring(3));
            }
            return false;
        }
    }
}
