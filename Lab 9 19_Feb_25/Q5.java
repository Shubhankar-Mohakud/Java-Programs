/*
Write a program in using
multi-threading which will display a counter value within a specified range
with a gap of 5 milliseconds after setting it’s name as given by the user. 
*/

import java.util.Scanner;

class Counter extends Thread{
    int lower,upper;
    Counter(String s,int lower,int upper){
        super(s);
        System.out.println(this);
        this.lower=lower;
        this.upper=upper;
        
    }
    public void run(){
        if(upper>=lower){
            for(int i=lower;i<=upper;i++){
                System.out.println(i+" ");
                try{
                    Thread.sleep(5);
                }catch(InterruptedException e){
                    System.out.println(e);
                }
            }
        }else{
            System.out.println("Invalid input");
        }
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter name of thread:");
        String s=sc.nextLine();
        System.out.print("Enter lower range of counter:");
        int lower=sc.nextInt();
        System.out.print("Enter upper range of counter:");
        int upper=sc.nextInt();
        Counter counter = new Counter(s,lower,upper);
        sc.close();
        counter.start();
    }
}
