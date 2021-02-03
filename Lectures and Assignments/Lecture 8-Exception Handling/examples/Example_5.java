package lect_oops.oops_2.exceptionhandling.examples;

public class Example_5 {

	public static void main(String[] args) {
		try {
			badMethod();
			System.out.print("A");
		} catch (RuntimeException ex) {
			System.out.print("B");
		} catch (Exception ex1) {
			System.out.print("C");
		} finally {
			System.out.print("D");
		}
		System.out.print("E");
	}

	public static void badMethod() {
		throw new RuntimeException();
	}
}
