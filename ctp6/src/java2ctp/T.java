package java2ctp;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.sun.jna.Native;

public class T {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		//gogo();
		String myLibraryPath = System.getProperty("user.dir");//
		System.out.println("myLibraryPath:"+myLibraryPath);
		 
	}
	
	public static void trancefer()throws UnsupportedEncodingException{
		
		String urf="\u56de\u8c03\u51fd\u6570\u7c7b\u578b\u5b9a\u4e49\uff08\u4e3a\u7f16\u5199\u65b9\u4fbf\uff0c\u6309\u5b57\u6bcd\u6392\u5e8f\uff09";
		String fullStr = new String(urf.getBytes(), "GBK");
		
		System.out.println(fullStr);
	}
	
	
	public static void gogo() throws InterruptedException,  ExecutionException {
	 
		ExecutorService exec = Executors.newFixedThreadPool(10);
		CompletionService<String> serv = new ExecutorCompletionService<String>(exec);

		for (int index = 0; index < 5; index++) {
			final int NO = index;
			Callable<String> downImg = new Callable<String>() {
				public String call() throws Exception {
					Thread.sleep((long) (Math.random() * 10000));
					return "Downloaded Image " + NO;
				}
			};
			serv.submit(downImg);
		}

		Thread.sleep(1000 * 2);
		
		System.out.println("Show web content");
		
		for (int index = 0; index < 5; index++) {
			Future<String> task = serv.take();
			String img = task.get();
			System.out.println(img);
		}
		
		System.out.println("End");
		// 关闭线程池
		exec.shutdown();
	}
	
	public static void toto(){ 
		ExecutorService executorService = Executors.newCachedThreadPool(); 
		List<Future<String>> resultList = new ArrayList<Future<String>>(); 

		//创建10个任务并执行 
		for (int i = 0; i < 10; i++){ 
			//使用ExecutorService执行Callable类型的任务，并将结果保存在future变量中 
			Future<String> future = executorService.submit(new TaskWithResult(i)); 
			//将任务执行结果存储到List中 
			resultList.add(future); 
		} 

		//遍历任务的结果 
		for (Future<String> fs : resultList){ 
				try{ 
					while(!fs.isDone()){
						System.out.println("没有完成：");
					}//Future返回如果没有完成，则一直循环等待，直到Future返回完成
					
					System.out.println("完成:"+fs.get());     //打印各个线程（任务）执行的结果 
				}catch(InterruptedException e){ 
					e.printStackTrace(); 
				}catch(ExecutionException e){ 
					e.printStackTrace(); 
				}finally{ 
					//启动一次顺序关闭，执行以前提交的任务，但不接受新任务
					executorService.shutdown(); 
				} 
		} 
	} 

	


}


class TaskWithResult implements Callable<String>{ 
	private int id; 

	public TaskWithResult(int id){ 
		this.id = id; 
	} 

	/** 
	 * 任务的具体过程，一旦任务传给ExecutorService的submit方法，
	 * 则该方法自动在一个线程上执行
	 */ 
	public String call() throws Exception {
		System.out.println("call()方法被自动调用！！！    " + Thread.currentThread().getName()); 
		//该返回结果将被Future的get方法得到
		return "call()方法被自动调用，任务返回的结果是：" + id + "    " + Thread.currentThread().getName(); 
	} 
}

