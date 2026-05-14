class threadDemo{
    public static void main(String[] args) {
        Thread t=Thread.currentThread();
        System.out.println("The current thread is:"+t);
        t.setName("myThread");
        System.out.println("The current thread is:"+t);
        String s=t.getName();
        System.out.println(s);
        t.setPriority(7);
        System.out.println("Current thread:"+t);

        try{
            for(int i=10;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}