/*
 * 43. W.A.J. P to create one thread by extending Thread class in another Class.
 */
package Assign;
class MyThread1 extends Thread {
    @Override
    public void run() {
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
             
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
        System.out.println("Thread has finished execution.");
    }
}
public class Q43 {
	    public static void main(String[] args) {
	        
	        MyThread1 myThread = new MyThread1();
	        
	       
	        myThread.start();
	        
	        
	        try {
	            myThread.join(); 
	        } catch (InterruptedException e) {
	            System.out.println("Main thread interrupted: " + e.getMessage());
	        }

	        System.out.println("Main thread has finished execution.");
	    }
	

	

}
