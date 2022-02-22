package thread.threadsafe;

public class test {
    public static void main(String[] args){
        //创建账户对象
//        Account act = new Account("act-001", 1000);
        Account act = new Account();
        act.setActno("act-001");
        act.setBalance(1000);
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        t1.setName("t1");
        t2.setName("t2");
        //启动线程
        t1.start();
        t2.start();

    }
}
