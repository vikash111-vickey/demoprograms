package day3training;
import java.util.Iterator;
public class muthithread2 implements Runnable {
	public	void run() 
	{
		for(int i=0;i<=5;i++) {
			System.out.println("thread"+i);
		}
		
	}
	
	public static void main(String[] args) {
		muthithread2 m = new muthithread2();
		Thread b= new Thread(m);
		b.start();
		for(int i=0;i<=5;i++) {
			System.out.println("main thread"+i);
		}
		
	}

}
