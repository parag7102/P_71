/*
 * 44. W.A.J.P to create 2 threads and execute that threads by providing sleep 
 * 		  time as 2000ms and check the execution.  
 */
package Assign;

class MyThread2 extends Thread {  
    private String threadName;  

    MyThread2(String name) {  
        this.threadName = name;  
    }  

    public void run() {  
        try {  
            System.out.println(threadName + " is going to sleep for 2000 ms.");   
            Thread.sleep(2000);  
        } catch (InterruptedException e) {  
            System.out.println(threadName + " was interrupted.");  
        }  
        System.out.println(threadName + " has woken up and is executing.");  
    }  
}
public class Q44 { 
	    public static void main(String[] args) {  
	          
	        MyThread2 thread1 = new MyThread2("Thread 1");  
	        MyThread2 thread2 = new MyThread2("Thread 2");  

	         
	        thread1.start();  
	        thread2.start();  

	          
	        try {  
	            thread1.join();  
	            thread2.join();  
	        } catch (InterruptedException e) {  
	            System.out.println("Main thread was interrupted.");  
	        }  

	        System.out.println("Both threads have finished execution.");  
	    }  
	
}
