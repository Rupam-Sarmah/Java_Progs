package Thread;

public class Thread1 implements Runnable {
	
	@Override
	public void run() {
		// task to be done by the thread.
		for(int i=0;i<10;i++) {
			System.out.println("Value of i="+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 myth = new Thread1();
		Thread my =new Thread(myth);
		my.start();
		System.out.println(my.currentThread());
		Thread2 t2= new Thread2();
		t2.start();
		System.out.println(t2.currentThread());
	}

	

}
