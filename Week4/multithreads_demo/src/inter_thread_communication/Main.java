package inter_thread_communication;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pages page = new Pages();
		
		SendPage sender1 = new SendPage(page);
		new Thread(sender1, "sender-job1").start();
		
		SendPage sender2 = new SendPage(page);
		new Thread(sender2, "sender-job2").start();
		
		SendPage sender3 = new SendPage(page);
		new Thread(sender3, "sender-job3").start();
		
		SendPage sender4 = new SendPage(page);
		new Thread(sender4, "sender-job4").start();
		
		SendPage sender5 = new SendPage(page);
		new Thread(sender5, "sender-job5").start();
		
		SendPage sender6 = new SendPage(page);
		new Thread(sender6, "sender-job6").start();
		
		Printer print = new Printer(page);
		new Thread(print, "printer").start();
		System.out.println("Printing");
		

	}

}
