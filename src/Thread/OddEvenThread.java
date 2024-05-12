package Thread;

public class OddEvenThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddPrinter op =  new OddPrinter();
		Thread thop= new Thread(op);
		
		EvenPrinter ep= new EvenPrinter();
		Thread thep = new Thread(ep);
		
		thop.start();
		thep.start();

	}
	static class OddPrinter implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=1;i<=10;i+=2) {
				System.out.println("Value of i printing as:"+i+" from "+ Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}
	static class EvenPrinter implements Runnable{

		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i=2;i<=10;i+=2) {
				System.out.println("Value of i printing as:"+i+" from "+ Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
		
	}

}
