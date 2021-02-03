package Codezen.Assignment.Recursion.Recursion_2B.Print;


import java.util.Scanner;

/**
 * Created by Ayush Deshwal on 24/06/2017.
 */
public class Print_Permutations {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String result="";
//        print_permutations(input,result);
        print_permutations_1(input,result);
    }
//
//    public static void print_permutations(String input,String result)
//    {
//        if(input.length()==0)
//        {
//            System.out.println(result);
//            return;
//        }
//        int i=0;
//        while(i<input.length())
//        {
//            String small="";
//            small=input.substring(0,i)+input.substring(i+1);
//            print_permutations(small,result.concat(input.charAt(i)+""));
//            i++;
//        }
//    }

    public static void print_permutations_1(String input,String result)
    {
        if (input.length() == 0)
        {
            System.out.println(result);
            return;
        }
        int i=0;
        while(i<result.length()+1)
        {
            String small="";
            small=result.substring(0,i)+input.charAt(0)+result.substring(i);
            print_permutations_1(input.substring(1),small);
            i++;
        }
    }
}
