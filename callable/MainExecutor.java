package callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainExecutor {

	public static void main(String args[]){
		
		int c =  0 ;
		
		ExecutorService executors = Executors.newFixedThreadPool(10);
		CalcValue calc = new CalcValue(); 
		Future future =  executors.submit(calc);
		try{
			System.out.println("Task is executed by Thread "+Thread.currentThread().getName());
			Thread.sleep(10);
			System.out.println("Is future task completed  "+future.isDone());
			System.out.println(future.get()); //}
			
			for(int i = 0 ; i< 10000 ; i++){
				
				c = c + i;
			}
			System.out.println("The value is : "+ c);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		calc.display(5, "Hello Team");
		
	}
}
