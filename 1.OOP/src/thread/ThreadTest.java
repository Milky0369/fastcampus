package thread;

class MyThread extends Thread {

    public void run() {
        int i;

        for( i = 0; i <= 200; i++) {
            System.out.println(i + "\t");

            try {
                sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

}

class YourThread implements Runnable {


    @Override
    public void run() {
        int i;

        for( i = 0; i <= 200; i++) {
            System.out.println(i + "\t");

            try {
                Thread.sleep(10);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}

public class ThreadTest {

    public static void main(String[] args) {

//        System.out.println("extend Thread start");
//
//        MyThread th1 = new MyThread();
//        MyThread th2 = new MyThread();
//
//        th1.run();
//        th2.run();
//
//        System.out.println("extend Thread end");


        System.out.println("interface Thread start");

        YourThread runner1 = new YourThread();
        Thread th3 = new Thread(runner1);
        YourThread runner2 = new YourThread();
        Thread th4 = new Thread(runner2);

        th3.start();
        th4.start();

        System.out.println("interface Thread end");



    }

}
