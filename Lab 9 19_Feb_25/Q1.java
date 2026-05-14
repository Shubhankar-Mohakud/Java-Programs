/*
Write a program to create a thread
which prints integer values from 10 to 1. The main method also prints values
from 10 to 1. (Using Runnable Interface)
*/

class Count implements Runnable{
    Thread t;
    
    Count(){
        t=new Thread(this, "myThread");
    }
    public void run(){
        for (int i=10; i>0; i--){
            System.out.println("Thread : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q1{
    public static void main(String[] args) {
        Count t1 = new Count();
        t1.t.start();
        for(int i=10; i>0; i--){
            System.out.println("Main : "+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        
    }
}