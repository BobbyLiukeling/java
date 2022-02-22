package thread.threadsafe;

public class AccountThread extends Thread {
    private Account act;
    public AccountThread(Account act){
        this.act = act;
    }
    public void run(){
        //表示取款操作
        double money = 500;
        act.withdraw(money); //设定取款500
        System.out.println(Thread.currentThread().getName()+"账户:"+act.getActno()+"取款："+money+"成功，剩余"+act.getBalance());


    }
}
