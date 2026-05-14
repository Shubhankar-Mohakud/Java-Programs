/* 
Write a program to create a thread
which prints integer values from 10 to 1. The main method also prints values
from 10 to 1. (Using subclass of Thread class)
*/

class Count extends Thread {
    public void run() {
        for (int i = 10; i >= 1; i--) {
            System.out.println("Thread:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Count cd = new Count();
        cd.start();
        for(int i=10; i>0; i--){
            System.out.println("Main:"+i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
