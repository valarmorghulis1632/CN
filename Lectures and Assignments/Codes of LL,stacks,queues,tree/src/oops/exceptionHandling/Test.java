package oops.exceptionHandling;

import java.io.FileNotFoundException;

public class Test {

	void fun1() throws FileNotFoundException {
		// int a = 5 / 0;
		throw new FileNotFoundException();

	}

	void fun2() throws FileNotFoundException {
		fun1();
		System.out.println("fun2 hello");
	}

	void fun3() {
		try {
			fun2();
		} catch (Exception e) {
			System.out.println("Handled");
		}
		System.out.println("fun3 hello");
	}

	void fun4() {
		fun3();
	}

	public static void main(String[] args) {
		Test t = new Test();

		t.fun4();

	}
}
