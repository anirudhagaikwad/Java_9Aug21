/**
 * 
 */
package multithread;

/**
 * @author Vaishnavi
 *
 */
public class MultithreadJava {

	/**
	 * @param args
	 * start(),run(),sleep(),currentThread(),join(),getPriority(),setPriority(),getName(),setName(),isAlive(),yield(),
	 * suspend(),resume(),stop(),destroy()
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Th1 th1obj=new Th1();	
		
		Th2 th2obj=new Th2();
		Thread t1=new Thread(th2obj);
		
		Th1 th3obj=new Th1();
		
		
		th1obj.setPriority(Thread.MIN_PRIORITY);
		
		th3obj.setPriority(Thread.MAX_PRIORITY);
		
		th1obj.start();
		try {
			th1obj.join();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		
		
		
		
		t1.start();
		th3obj.start();
		
		for(int i=0;i<3;i++)
		{
			t1.yield();
			System.out.println("Current thread : "+Thread.currentThread().getName());
			
		}
		
		
		System.out.println("Name of Thread Th1 : "+th1obj.getName());
		System.out.println("Name of Thread Th2 : "+t1.getName());

		
		th1obj.setName("MyThread1");

	} //end main

} // end class


// creating thread by extending Thread Class
class Th1 extends Thread
{
	
	
	public void run()
	{
		System.out.println("Thrad is Running");
		
		for(int i=1;i<5;i++)
		{
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			
			System.out.println(i);
			
		}
	} // end run()
	
} //end Th1


//creating thread by implements Runnable interface


class Th2 implements Runnable
{
	public void run()
	{
		System.out.println("Thrad is Running");
	}
	
	
	
} //end Th2

































