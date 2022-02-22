package thread;
/*
*实现线程第一种方式
*   编写一个类，直接继承java.lang.Thread. 然后重写run方法
*
* */
public class threadtest2 {
    public static void main(String[] args){
        MyThread mythread = new MyThread();
        mythread.start();
        //启动线程，start方法作用是在JVM中开辟一个新的栈空间，给子线程，
        // 若使用mythread.run(),则不会启动分支线程，此时，只有一个线程
        // 启动成功的线程会自动调用run方法
        //并且run方法在分支栈底部
        for(int i = 0 ;i<100;i++){
            System.out.println("主线程·····"+i);
        }

    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        //本段程序运行在分支线程中
        for(int i = 0 ;i<100;i++){
            System.out.println("分支线程·····"+i);
        }

    }
}