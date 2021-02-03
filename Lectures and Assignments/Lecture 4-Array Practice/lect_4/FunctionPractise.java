package lect_3;

/**
 * Created by ankurkumar on 6/13/17.
 */
public class FunctionPractise {

    public static void main(String[] args) {

        sum(5,10);
    }


   public static void sum(int num1, int num2){

        System.out.println(num1+num2);
    }


    public static  int sum2(int num1, int num2){

        return (num1+num2);
    }

    public static int ques1(){
        System.out.println("ques1");
         return 0;
    }

    public static String ques2(){
        System.out.println("ques2");
        return "";
    }
}
