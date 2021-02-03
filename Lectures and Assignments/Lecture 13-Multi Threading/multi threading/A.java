
public class A {

	public static void main(String[] args) {
		//System.out.println("Hello");
		Thread t =Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		//System.out.println(t.getName());
	}
}
