/*
 *  42. W.A.J. P to create one thread by implementing Runnable interface in Class.
 */
package Assign;

class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class Q42 {
	    public static void main(String[] args) {
	        MyThread mt = new MyThread();
	        Thread t = new Thread(mt);
	        t.start();
	        for (int i = 0; i < 5; i++) {
	            System.out.println("Main Thread");
	        }
	    }
	
}
