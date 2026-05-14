import java.lang.Thread;

class MyThread extends Thread {
    public void run()
    {
        String str = "Thread Started Running...";
        System.out.println(str);
    }
}

public class Geeks{
      public static void main(String args[]){
        MyThread t1 = new MyThread();
        t1.start();
        t1.setName("Thread 1");
        // String name = t1.getName();
        System.out.println("Name of thread : "+t1.getName());
  }
}