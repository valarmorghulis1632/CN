package Temp1.oops.methodoverriding;

class A {
	int x;
	int y;
	public void fun1() {

	}
	public void fun2() {

	}
}

class B extends A {
	int z;
	int x;
	public void fun1(int x) {

	}
	public void fun2() {
		System.out.println(super.x);
	}
	
	public void fun3(){
		
	}
}

public class Test {
	public static void main(String[] args) {
		A a = new A();
		a.fun1();
		
		B b = new B();
		b.fun2();
		
		
		
		A a1= new B();
		a1.fun2();
		//((B)a1).
		
	}

}
