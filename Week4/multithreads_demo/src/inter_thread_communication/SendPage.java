package inter_thread_communication;

public class SendPage implements Runnable {
	
	private Pages page;
	
	public SendPage() {
		// TODO Auto-generated constructor stub
	}
	
	
	public SendPage(Pages page) {
		super();
		this.page = page;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		int j=1;
		String thread = Thread.currentThread().getName();
		System.out.println(thread + " started");
		try {
			Thread.sleep(1000);
			
			synchronized(page) {
					page.setNumberPage(j);
				page.notify();
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
