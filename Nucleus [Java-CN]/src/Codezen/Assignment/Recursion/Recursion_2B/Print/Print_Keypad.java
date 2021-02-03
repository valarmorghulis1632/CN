package Codezen.Assignment.Recursion.Recursion_2B.Print;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 24/06/2017.
 */
public class Print_Keypad {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String result="";
        print_keypad(num,result);
    }

    public static void print_keypad(int num,String result)
    {
        if(num==0)
        {
            System.out.println(result);
            return;
        }
        String key=keys(num%10);
        int i=0;
        while(i<key.length())
        {
            String small=key.charAt(i)+result;
            print_keypad(num/10,small);
            i++;
        }
    }

    public static String keys(int n)
    {
        String[] str={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wyxz"};
        return str[n];
    }
}
