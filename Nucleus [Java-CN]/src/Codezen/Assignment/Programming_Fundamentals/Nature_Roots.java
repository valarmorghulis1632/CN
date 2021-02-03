package Codezen.Assignment.Programming_Fundamentals;

/**
 * Created by Ayush Deshwal on 15/06/2017.
 */
import java.util.Scanner;
public class Nature_Roots {



        public static void main(String[] args) {
//            double root=-0.57656;
//            long total_salary_1= (long)(root*10.0);
//            System.out.println(total_salary_1);

            Scanner scan=new Scanner(System.in);

            float a=scan.nextFloat();

            float b= scan.nextFloat();

            float c= scan.nextFloat();

            double root1,root2,discriminant;
            discriminant=(Math.pow(b,2)-(4*a*c));
            if(discriminant>0) {
                root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.println(1);
                long root_1=round_off(root1);
                long root_2=round_off(root2);
                System.out.println(root_1+" "+root_2);
            }
            else if(discriminant<0) {
                System.out.println(-1);
            }
            else {
                System.out.println(" ROOTS ARE REAL AND EQUAL");
                root1 = -b / (2 * a);
                System.out.println(0);
                long root_1=round_off(root1);
                System.out.println(root_1+" "+root_1);
            }
            // Write your code here

        }

        public static long round_off(double root)
        {
            long total_salary_1= (long)(root*10.0);

            if(total_salary_1>=0 && (total_salary_1%10)>=5)
            {
                total_salary_1 = total_salary_1 + 10;
            }
            else if(total_salary_1<0 && (total_salary_1%10)<=-5 )
            {
                total_salary_1=total_salary_1-10;

            }
            total_salary_1=total_salary_1/10;

            return total_salary_1;
        }
}
