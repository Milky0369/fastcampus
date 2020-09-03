package thread;

class Bank {
    private int money = 10000;

    public void saveMoney(int save) {

        int m = this.getMoney();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m + save);

    }

    public void minusMoney(int minus) {

        int m = this.getMoney();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        setMoney(m - minus);

    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

}

class Park extends Thread {

    public void run(){
        System.out.println("start save");
        SyncTest.myBank.saveMoney(30000);
        System.out.println("save money : " + SyncTest.myBank.getMoney());
    }

}

class ParkWife extends Thread {

    public void run(){
        System.out.println("start minus");
        SyncTest.myBank.minusMoney(10000);
        System.out.println("minus money : " + SyncTest.myBank.getMoney());
    }

}

public class SyncTest {

    public static Bank myBank = new Bank();

    public static void main(String[] args) throws InterruptedException {

        Park p = new Park();

        p.start();

        Thread.sleep(200);

        ParkWife pw = new ParkWife();

        pw.start();

        // 메서드 sync 하면 객체 자체에 lock이 걸리게 된다.
        // synchronized block 방식은 부분만 lock이 된다.

    }

}
