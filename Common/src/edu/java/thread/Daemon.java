package edu.java.thread;

//daemon thread will stop right after all thread stop, call isDaemon to check 
public class Daemon {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread t1 = new MyCommon();
		Thread t2 = new Thread(new MyDaemon());
		//t2.setDaemon(true);
		
		t2.start();
		t1.start();

	}

}

class MyDaemon implements Runnable {
	public void run() {
		for(long i = 0; i<9999999L;i++){
			System.out.println("back daemon "+i+" times");
			try {
				Thread.sleep(7);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class MyCommon extends Thread{
	public void run() {
		for(int i = 0; i< 5;i++){
			System.out.println("thread 1 "+i+" times!");
			try {
				Thread.sleep(7);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}