package lect_oops.oops_2.exceptionhandling.examples;

public class Example_11 {

	public static void main(String args[]) {
		try {
			throw 10;
		} catch (int e) {
			System.out.println("Got the  Exception " + e);
		}
	}
}