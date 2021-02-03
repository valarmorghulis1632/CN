package Lectures.Lecture_7_Recursion_contd;

import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 22/06/2017.
 */
public class Integer_to_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("STRING IS: "+int_to_str(num));
    }

    public  static String int_to_str(int num)
    {
        String temp="";
        if(num==0)
        {
            return temp;
        }
        int dig=num%10;
        temp=temp.concat(give_string_value(dig));
        num=num/10;
        return int_to_str(num)+temp;
    }

    public static String give_string_value(int dig)
    {
        String temp="";
        switch (dig)
        {
            case 0: temp=temp.concat(" zero"); break;
            case 1: temp=temp.concat(" one"); break;
            case 2: temp=temp.concat(" two"); break;
            case 3: temp=temp.concat(" three"); break;
            case 4: temp=temp.concat(" four"); break;
            case 5: temp=temp.concat(" five"); break;
            case 6: temp=temp.concat(" six"); break;
            case 7: temp=temp.concat(" seven"); break;
            case 8: temp=temp.concat(" eight"); break;
            case 9: temp=temp.concat(" nine"); break;
        }
        return temp;
    }

//    public static String give_string_value_1(int dig)
}
