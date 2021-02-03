
public class B extends Thread {

	@Override
	public void run() {
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		

		for(int i=0;i<100;i++){
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
}



