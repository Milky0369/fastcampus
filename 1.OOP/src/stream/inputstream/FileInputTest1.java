package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

    public static void main(String[] args) {

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("input.txt");

            // 한글자씩 읽을 경우
//            int i = fis.read();
//            System.out.println((char) i);
//
//            i = fis.read();
//            System.out.println((char) i);
//
//            i = fis.read();
//            System.out.println((char) i);

            // 끝까지 읽을 경우
            int i;
            while( (i = fis.read()) != -1 ) {
                System.out.println( (char) i );
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                fis.close();
            } catch(IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("end");

    }

}
