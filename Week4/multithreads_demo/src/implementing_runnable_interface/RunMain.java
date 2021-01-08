package implementing_runnable_interface;

public class RunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyRun run1 = new MyRun();
		Thread th1 = new Thread(run1, "run-1");
		
		MyRun run2 = new MyRun();
		Thread th2 = new Thread(run2, "run-2");
		
		MyRun run3 = new MyRun();
		Thread th3 = new Thread(run3, "run-3");
		
		MyRun run4 = new MyRun();
		Thread th4 = new Thread(run4, "run-4");
		
		MyRun run5 = new MyRun();
		Thread th5 = new Thread(run5, "run-5");
		
		th1.setDaemon(true);
		th2.setDaemon(true);
		th3.setDaemon(true);
		th4.setDaemon(true);
		th5.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		
		try {
			th1.join();
			th2.join();
			th3.join();
			th4.join();
			th5.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
//		for (int i = 0; i < 4; i++) {
//			System.out.println("Printing from thread - "+Thread.currentThread().getName()+" value of i = "+(i+1));
//			try {
//				Thread.sleep(1500);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
		System.out.println("main function ends at this point");

	}

}