class TestThread implements Runnable {

   public void run() {
      System.out.println(Thread.currentThread().getName() + " called");
  }
    public static void main(String[] args) {
        TestThread tt = new TestThread();
        Thread t1 = new Thread(tt, "Thread-1");
        Thread t2 = new Thread(tt, "Thread-2");
        Thread t3 = new Thread(tt, "Thread-3");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(7);
        t3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getPriority());
        t1.start();
        t2.start();
        t3.start();
    }

    
}
