package thread;

/*
* 1、获取当前线程对象
* 2、获取当前线程对象名字
* */
public class threadtest1 {
    public static void main(String[] args){
        MyThread2 mythread = new MyThread2();
//        Thread t = new Thread(new MyRunnable());
        mythread.setName("thread1");
        String name = mythread.getName();
        System.out.println(name);
        Thread current = Thread.currentThread();
        System.out.println("main Thread name: "+current.getName());
        mythread.start();


    }
}

class MyThread2 extends Thread{
    @Override
    public void run(){
//        for(int i = 0 ;i<10;i++){
//            System.out.println("分支线程··@···"+i);
//        }
        Thread current = Thread.currentThread(); //获取当前线程名字
        System.out.println("not main Thread name: "+current.getName());

    }
}
