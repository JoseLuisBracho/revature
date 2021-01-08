package inter_thread_communication;

public class Printer implements Runnable{
	private Pages page;
	
	public Printer() {
		// TODO Auto-generated constructor stub
	}

	public Printer(Pages page) {
		super();
		this.page = page;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		String thread = Thread.currentThread().getName();
		
		synchronized (page) {
			System.out.println("Waiting to be notified...");
			try {
				page.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Has been notified!");
		}
		
	}
	

}
