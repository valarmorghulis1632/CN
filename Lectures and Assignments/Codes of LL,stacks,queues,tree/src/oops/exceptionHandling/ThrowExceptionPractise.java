package oops.exceptionHandling;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ThrowExceptionPractise {

	
	static void validateAge(int age) throws FileNotFoundException {
		if(age<18){
			FileNotFoundException a = new FileNotFoundException();
			throw a;
		}
	}
	
	static void fun2(){
		
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(System.in);
		
		validateAge(s.nextInt());
	}
}
