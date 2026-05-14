class OddThread extends Thread{
    Thread t;
    String threadname;
    int arr[] = new int[50];

    OddThread(String name){
        threadname = name;
    }

    public void start(){
        if(t==null){
            t = new Thread(this, threadname);
        }
        System.out.println("Thread :"+threadname+" starting");
        t.run();
    }

    public void run(){
        for(int i=1; i<101; i++){
            if((i%2)!=0){
                arr[i/2]=i;
                System.out.println(threadname+" : "+i);
            }
        }
    }
}

class EvenThread extends Thread{
    Thread t;
    String threadname;
    int arr[] = new int[50];

    EvenThread(String name){
        threadname = name;
    }

    public void start(){
        if(t==null){
            t = new Thread(this, threadname);
        }
        System.out.println("Thread :"+threadname+" starting");
        t.run();
    }

    public void run(){
        for(int i=1; i<101; i++){
            if((i%2)==0){
                arr[(i/2)-1]=i;
                System.out.println(threadname+" : "+i);
            }
        }
    }
}

class test{
    public static void main(String[] args) {
        
        OddThread ot = new OddThread("Odd-Thread");
        ot.start();

        EvenThread et = new EvenThread("Even-Thread");
        et.start();

        int ARR[] = new int[100];

        for (int i = 0; i < 50; i++) {
            ARR[i * 2] = ot.arr[i];       
            ARR[i * 2 + 1] = et.arr[i];   
        }
        for(int i=0; i<101; i++){
            System.out.println(ARR[i]);
        }
    }
}