package Codezen.Assignment.Recursion.Recursion_1B;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 21/06/2017.
 */
public class Pair_Star {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
        System.out.println("CHANGED: "+pair_star(str));
    }

    public static String pair_star(String s)
    {
        String temp="";
        if(s.length()==1)
        {
            return temp.concat(s.charAt(0)+"");
        }
        if(s.length()==0)
        {
            return temp;
        }
        String small="";
        if(s.charAt(0)==s.charAt(1))
        {
            temp=temp.concat(s.charAt(0)+"*"+s.charAt(1));
            int i=2;
            while(i<s.length())
            {
                small=small.concat(s.charAt(i)+"");
                i++;
            }
        }
        else
        {
            temp=temp.concat(s.charAt(0)+"");
            int i=1;
            while (i<s.length())
            {
                small=small.concat(s.charAt(i)+"");
                i++;
            }
        }
        String ans=(pair_star(small));
        if(ans.length()!=0 && (ans.charAt(0)==temp.charAt(temp.length()-1)))
        {
            temp=temp.concat("*"+ans);
            return temp;
        }
        else
        {
            return temp.concat(ans);
        }
    }
}
