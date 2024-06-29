// public class MyThread1  
// {   
// public static void main(String argvs[])  
// {    
// Thread t= new Thread("My first thread");  
// t.start();   
// String str = t.getName();  
// System.out.println(str);  
// }  
// }

/*
public class MyThread2 implements Runnable  
{    
public void run()  {    
System.out.println("Now the thread is running ...");    
}    

public static void main(String argvs[])  {   
Runnable r1 = new MyThread2();    
Thread th1 = new Thread(r1, "My new thread");    
  
th1.start();   
 
String str = th1.getName();  
System.out.println(str);  
}    
} 
*/



class SimpleThread extends Thread {
    public SimpleThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName() + " is running. Iteration: " + i);
            try {
                Thread.sleep(500); // Pause for 500 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        // Create and start three threads
        for (int i = 1; i <= 3; i++) {
            SimpleThread thread = new SimpleThread("Thread " + i);
            thread.start();
        }
        
        // Wait for all threads to finish
        for (int i = 1; i <= 3; i++) {
            try {
                SimpleThread thread = new SimpleThread("Thread " + i);
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("All threads have finished.");
    }
}
