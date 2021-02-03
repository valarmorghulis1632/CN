package Lectures.Lecture_2_Programming_Fundamentals.Class_Codes;
/**
 * Created by Ayush Deshwal on 12/06/2017.
 */

public class Datatype_Practice {


    public static void main(String[] args) {

//        Scanner s = new Scanner(System.in);
////        System.out.println("Input Max value");
////
////
////
////
//        String st2 = s.next();
////        char ch = s.next().charAt(0);
////        float hra;
////        hra = (20.0f/100)*(float)max;
////        double h=(20.0d/100)*(float)max;
////
////
////
//        int max = s.nextInt();
//        System.out.println(st2+" "+max);
//
//        int x=5;
//        int y=6;
//        if((x=1)==y)
//            System.out.println(y);
//        else System.out.println(y+1);

        int i=1;
        while(i<3)
        {
            int j=0;
            while(j<5)
            {
                j++;
                if (j == 3)
                {
                    continue;
                }
                System.out.println(j+" ");
            }
            i++;
        }
      }
}
