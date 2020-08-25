package stream.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInput3 {

    public static void main(String[] args) {

        // BYTE ARRAY
        try(FileInputStream fis = new FileInputStream("input.txt")){

            int i;
            byte[] bs = new byte[10];

            while( (i = fis.read(bs)) != -1 ) {

                /*
                for(byte b : bs) {
                    System.out.println(b);
                }
                 */

                for(int k=0; k < i; k++) {
                    System.out.println( (char)bs[k] );
                }

                System.out.println();

            }

        } catch(IOException e) {
            e.printStackTrace();
        }

        System.out.println("end");

    }

}
