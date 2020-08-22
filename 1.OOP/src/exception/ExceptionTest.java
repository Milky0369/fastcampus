package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("a.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e);
            return;
        } finally {
            try {
                fis.close();
                System.out.println("finally");
            } catch(IOException e){
                System.out.println(e);
            }
        }

        // java7부터 추가된 try with resource 구문 AutoCloserable을 구현해서 자원을 자동으로 해제해준다.
        try(FileInputStream fis2 = new FileInputStream("a.txt")) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
