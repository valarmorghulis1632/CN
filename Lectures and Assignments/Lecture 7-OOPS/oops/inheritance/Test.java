package Temp1.oops.inheritance;

class A{
	int x=10;
	
	void fun(){
		System.out.println("A fun");
	}
	
	A(int a){
		System.out.println("A");
	}
	
	A(int a, int b){
		System.out.println("A B");
	}
	A(){
		System.out.println("Default");
	}
	
}

class B extends A{
	int z=20;
	
	B(){
		System.out.println("B");	
		B b = new B();
	}
	
	B(int a, int b){
		super(a,b);
	}
	
	void fun2(){
		super.fun();
		
	}
}




public class Test {
	public static void main(String[] args) {
		//B b = new A();
		
		
		A a = new B();
		System.out.println(a.x);
		
		//((B)a).z
		
		
		//b.fun();
		
	}
}
