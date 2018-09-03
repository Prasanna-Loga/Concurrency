package callableCollections;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class CollectionCallbleDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService exec = Executors.newFixedThreadPool(5);
		Set<Callable<String>> callableCollections = new HashSet<Callable<String>>() ; 
		
		callableCollections.add(new Callable<String>(){
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 1";
			}
		});
	}

}
