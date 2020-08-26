package stream.reader;

import java.io.*;

public class FileReaderTest {

    public static void main(String[] args) throws IOException {

//        FileInputStream fis = new FileInputStream("reader.txt");
//        InputStreamReader isr = new InputStreamReader(fis);
//
//        int i;
//
//        while( ( i = isr.read()) != -1 ){
//            System.out.println( (char)i );
//        }
//
//        isr.close();

        FileReader fr = new FileReader("reader.txt");

        int i;

        while( ( i = fr.read()) != -1 ){
            System.out.println( (char)i );
        }

        fr.close();

    }

}
