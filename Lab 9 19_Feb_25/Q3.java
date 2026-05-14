/*
Write a program to create three number
of thread where all the threads print integer values from 100 to 90. (Any method) 
*/

class Thread1 extends Thread {
    private int threadnum;

    Thread1(int threadnum){
        this.threadnum = threadnum;
    }

    public void run(){
        try {
            for(int i=100; i>=90; i--){
                System.out.println("Thread "+threadnum+":"+i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
/* 
class Thread2 extends Thread{
    public void run(){
        for(int i=100;i>=90;i--){
            System.out.println("Thread 2:"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Thread3 extends Thread{
    public void run(){
        for(int i=100;i>=90;i--){
            System.out.println("Thread 3:"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
*/

public class Q3 {
    public static void main(String[] args) {
        Thread1 t1=new Thread1(1);
        Thread1 t2=new Thread1(2);
        Thread1 t3=new Thread1(3);
        t1.start();
        t2.start();
        t3.start();
    }
}
