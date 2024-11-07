/*
 * 46. W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set 
 * 		  Daemon() method of Thread class and check whether the thread is set daemon 
 *       or not by using is Daemon () method. TestDaemonThread2 t1=new TestDaemonThread2(); TestDaemonThread2 t2=new TestDaemonThread2(); t1.start(); t1.setDaemon(true);//will throw exception here t2.start();
 */
package Assign;
class TestDaemonThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }
}
public class Q46 {
	    public static void main(String[] args) {
	        TestDaemonThread2 t1 = new TestDaemonThread2();
	        t1.setName("Non-Daemon Thread");

	        TestDaemonThread2 t2 = new TestDaemonThread2();
	        t2.setName("Daemon Thread");

	        System.out.println("Is t1 daemon? " + t1.isDaemon());
	        System.out.println("Is t2 daemon? " + t2.isDaemon());

	        t2.setDaemon(true); 

	        t1.start();
	        t2.start();

	        System.out.println("Is t1 daemon? " + t1.isDaemon());
	        System.out.println("Is t2 daemon? " + t2.isDaemon());
	    }
		   
}