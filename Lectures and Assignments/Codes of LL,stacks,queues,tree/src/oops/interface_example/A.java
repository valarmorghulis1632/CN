package oops.interface_example;

public interface A {
	void fun1();
	void fun2();
	int fun(int arr[]);
}

interface B extends A{
	void fun5();
}





class Test implements B{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fun2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int fun(int[] arr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void fun5() {
		// TODO Auto-generated method stub
		
	}
	
}
