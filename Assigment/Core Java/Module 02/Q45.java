/*
 * 45. W.A.J.P to start the same Thread twice by calling start () method twice. 
 *       Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
 *       Test ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start (); 
 */
package Assign;
class TestThreadTwice1 extends Thread {  
    @Override  
    public void run() {  
        System.out.println("Thread is running: " + Thread.currentThread().getName());  
    }  
}  
public class Q45 {  
	    public static void main(String[] args) {  
	        TestThreadTwice1 t1 = new TestThreadTwice1();  
	        t1.start();
	        
	        try {  
	            t1.start();   
	        } catch (IllegalThreadStateException e) {  
	            System.out.println("Exception: " + e.getMessage());  
	        }  
	    }  
	
}
