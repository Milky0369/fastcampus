package thread;

import java.util.ArrayList;

class FastLibrary {

    public ArrayList<String> books = new ArrayList<String>();

    public FastLibrary(){
        books.add("태백산맥 1");
        books.add("태백산맥 2");
        books.add("태백산맥 3");
    }

    public synchronized String lendBook() throws InterruptedException {

        Thread t = Thread.currentThread();

        while( books.size() == 0 ) { // 책이 없을 경우 Thread를 멈춘다.
            System.out.println(t.getName() + " waiting start");
            wait();
            System.out.println(t.getName() + " waiting end");
        }

        String title = books.remove(0);

        System.out.println(t.getName() + " : " + title + " lend.");

        return title;

    }

    public synchronized void returnBook(String title) {

        Thread t = Thread.currentThread();

        books.add(title);

        notify(); // 책이 반납된 것을 알린다.

        System.out.println(t.getName() + " : " + title + " lend.");

    }

}

class Student extends Thread {

    public void run() {

        try {
            String title = LibraryMain.library.lendBook();

            if( title == null ) return;

            sleep(5000);
            LibraryMain.library.returnBook(title);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

public class LibraryMain {

    public static FastLibrary library = new FastLibrary();

    public static void main(String[] args) {

        // 학생은 6명인데 책은 3권인 상황이다.
        // 공유자원인 책이 3개이기 때문에 Exception 발생.
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student();
        Student std4 = new Student();
        Student std5 = new Student();
        Student std6 = new Student();

        std1.start();
        std2.start();
        std3.start();
        std4.start();
        std5.start();
        std6.start();

    }

}
