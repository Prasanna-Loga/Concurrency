package callableCollections;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

public class CollectionCallableDemo {
		
	public static void main(String[] args) throws InterruptedException, ExecutionException {
			// TODO Auto-generated method stub
			
			ExecutorService exec = Executors.newFixedThreadPool(5);
			Set<Callable<String>> callableCollections = new HashSet<Callable<String>>() ; 
			System.out.println("Current Thread executing  in main : " + Thread.currentThread().getName());
			callableCollections.add(() -> {
					Thread.sleep(1000);
					System.out.println("Current Thread executing in call 1: " + Thread.currentThread().getName());
					return "Task 1";
				}); 
			
			callableCollections.add(() -> {
					Thread.sleep(10);
					System.out.println("Current Thread executing in call 2: " + Thread.currentThread().getName());
					return "Task 2";
				});
			
			callableCollections.add(() -> {
					// TODO Auto-generated method stub
					Thread.sleep(100);
					System.out.println("Current Thread executing in call 3: " + Thread.currentThread().getName());
					return "Task 3";
			});
			
			String result = exec.invokeAny(callableCollections);
			System.out.println("InvokeAny Method result : " + result);
			
			List<Future<String>> future = exec.invokeAll(callableCollections);
			
			for(Future<String> fut : future){
				System.out.println("Invoke All result : " + fut.get());
			}
		}
}
