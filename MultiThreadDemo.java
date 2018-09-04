
public class MultiThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThread multithread = new MultiThread();
		Thread thread = new Thread(multithread);
		thread.start();
	}

} 

class MultiThread implements Runnable {

	@Override
	public void run() {
		try {
			Thread.sleep(100);
			System.out.println("Thread "+ Thread.currentThread().getId() + " is running..");
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		
	}
	
}
