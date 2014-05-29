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
		// �ر��̳߳�
		exec.shutdown();
	}
	
	public static void toto(){ 
		ExecutorService executorService = Executors.newCachedThreadPool(); 
		List<Future<String>> resultList = new ArrayList<Future<String>>(); 

		//����10������ִ�� 
		for (int i = 0; i < 10; i++){ 
			//ʹ��ExecutorServiceִ��Callable���͵����񣬲������������future������ 
			Future<String> future = executorService.submit(new TaskWithResult(i)); 
			//������ִ�н���洢��List�� 
			resultList.add(future); 
		} 

		//��������Ľ�� 
		for (Future<String> fs : resultList){ 
				try{ 
					while(!fs.isDone()){
						System.out.println("û����ɣ�");
					}//Future�������û����ɣ���һֱѭ���ȴ���ֱ��Future�������
					
					System.out.println("���:"+fs.get());     //��ӡ�����̣߳�����ִ�еĽ�� 
				}catch(InterruptedException e){ 
					e.printStackTrace(); 
				}catch(ExecutionException e){ 
					e.printStackTrace(); 
				}finally{ 
					//����һ��˳��رգ�ִ����ǰ�ύ�����񣬵�������������
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
	 * ����ľ�����̣�һ�����񴫸�ExecutorService��submit������
	 * ��÷����Զ���һ���߳���ִ��
	 */ 
	public String call() throws Exception {
		System.out.println("call()�������Զ����ã�����    " + Thread.currentThread().getName()); 
		//�÷��ؽ������Future��get�����õ�
		return "call()�������Զ����ã����񷵻صĽ���ǣ�" + id + "    " + Thread.currentThread().getName(); 
	} 
}

