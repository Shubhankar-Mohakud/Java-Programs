class myThread implements Runnable {
    Thread t;
    myThread(){
        t=new Thread(this,"myThread");
        System.out.println(t);
    }
    public void run(){
        try{
            for(int i=5;i>0;i--){
                System.out.println(i);
            }
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }

    public void start(){
        System.out.println("Thread : "+t.getName()+" is starting\n");
        t.run();
    }
}
class test{
    public static void main(String[] args) {
        myThread t1=new myThread();
        t1.start();
        /* try{
            for(int i=5;i>0;i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        } */
    }
}
