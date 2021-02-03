package oops.exceptionHandling;

public class A {

	public static void main(String[] args) {

		try {
			try {
				int[] arr = new int[5];
				arr[5] = 20;
			} catch (ArrayIndexOutOfBoundsException e) {

			} finally{
				
			}
			System.out.println("dfjkhqwekjhf");
			int a = 5;

			System.out.println("Hi");

			String str = null;
			try {
				System.out.println(str.length());
			} catch (NullPointerException e) {

			}

			try {
				int x = 4 / 0;
				System.out.println(x);
			} catch (ArithmeticException e) {

			}
		} catch(Exception e) {
			System.out.println("kjfhkwqejhf");
		}finally{
			
			System.out.println("dmbckwecnwbjkbvkndknsdmdsamn");
		}
		System.out.println("HELLO");
	}

}
