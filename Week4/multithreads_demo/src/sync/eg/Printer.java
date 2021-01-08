package sync.eg;

public class Printer {
	public synchronized static void printPages(Pages page) {
		System.out.println(page.getPage1());
		try {
			System.out.println("Waiting for page to print...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("   " + page.getPage2());
	}

}