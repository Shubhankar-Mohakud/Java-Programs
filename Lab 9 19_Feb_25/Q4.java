/*
Write a program to create two numbers
of threads where one thread prints the all even numbers from 1 to 50 where other
thread prints all the odd numbers. (Any method) 
*/

class EvenThread extends Thread{
    public void run(){
        for(int i=2;i<=50;i+=2){
            System.out.println("Even:"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread{
    public void run(){
        for(int i=1;i<=50;i+=2){
            System.out.println("Odd:"+i);
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}

class Q4{
    public static void main(String[] args) {
    EvenThread et= new EvenThread();
    OddThread ot=new OddThread(); 
    et.start();
    ot.start();
    }
}
