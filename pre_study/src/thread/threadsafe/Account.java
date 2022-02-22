package thread.threadsafe;

public class Account {
    //账号
    private String actno;
    //余额
    private double balance;

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getActno() {
        return actno;
    }

    public void withdraw(double money){
        synchronized (this){ //参数传入需要进行线程同步的共享对象，同步参数的范围越小则代码效率越高，反之亦然

            //取款之前的金额
            double before = this.getBalance();
            //取款之后的金额
            double after = before - money;
            //更新账户余额
            this.setBalance(after);
        }


    }
}
