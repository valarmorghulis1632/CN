
public class C {

	static C c ;//= new C();
	private C(){
		
	}
	
	public static C fun(){
		if(c==null){
			c= new C();
		}
		return c;
		
	}
}


class Test{
	public static void main(String[] args) {
		C c = C.fun();
		C c1 = C.fun();
	}
}