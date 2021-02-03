package sharingObject;

 class ShareObject {
	static int i =0;
	
	synchronized static void fun(int n){
		for(;i<100;i++){
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(n*i +"      "+Thread.currentThread().getName());
		}
	}
}


class T1 extends Thread{
	ShareObject obj;
	T1(ShareObject obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.fun(100);
	}
}



















class T2 extends Thread{
	ShareObject obj;
	T2(ShareObject obj){
		this.obj = obj;
	}
	@Override
	public void run() {
		obj.fun(3);
	}
}


public class Test{
	public static void main(String[] args) {
		//ShareObject obj1 = new ShareObject();
		ShareObject obj = new ShareObject();
		T1 t1 = new T1 (obj);
		T2 t2 = new T2(obj);
		t1.start();
		t2.start();
	}
}







