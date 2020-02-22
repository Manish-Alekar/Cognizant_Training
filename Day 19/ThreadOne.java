
public class ThreadOne {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		ThreadDemo t1 = new ThreadDemo();
		ThreadTwo t2 = new ThreadTwo();
		
		t1.start();
		t2.start();
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
}
