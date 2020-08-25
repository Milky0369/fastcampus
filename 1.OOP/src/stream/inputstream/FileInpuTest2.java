package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInpuTest2 {

    public static void main(String[] args) {

        // try with resource
        // 자원 선언과 해제를 자동으로 실행해줌
        try(FileInputStream fis = new FileInputStream("input.txt")){

            int i;

            while( (i = fis.read()) != -1 ) {
                System.out.println( (char) i );
            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
