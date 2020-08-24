package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

    public static void main(String[] args) {

        System.out.println("입력 : ");

        // System.in은 inputstream
        try {
            int i = System.in.read();
            System.out.println(i);
            System.out.println((char)i);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            int i;
            InputStreamReader isr = new InputStreamReader(System.in);

            while( (i = isr.read() ) != '끝' ) {
                System.out.println((char)i);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
