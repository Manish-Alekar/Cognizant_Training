
public class MainThread {

	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		t.setName("Thread1");
		System.out.println(t);
		System.out.println(t.getPriority());
		System.out.println("Is daemon ?"+t.isDaemon());
		System.out.println("Is alive ?"+t.isAlive());
	}

}
