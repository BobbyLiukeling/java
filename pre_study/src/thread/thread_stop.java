package thread;

public class thread_stop {
    public static  void main(String [] args){
        MyRunnable2 myRunnable2 = new MyRunnable2();
        Thread t = new Thread(myRunnable2);
        t.start();
        try{
            Thread.sleep(2000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        myRunnable2.run = false;

    }
}

class MyRunnable2 implements Runnable{
    boolean run = true;
    @Override
    public void run(){
        for (int i = 0;i<10;i++){
            if(run){
                System.out.println(Thread.currentThread().getName()+"....."+i);
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
