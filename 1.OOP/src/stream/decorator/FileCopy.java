package stream.decorator;

import java.io.*;
import java.net.Socket;

public class FileCopy {

    public static void main(String[] args) throws IOException {

        long sec = 0;

        try ( FileInputStream fis = new FileInputStream("a.zip");
              FileOutputStream fos = new FileOutputStream("copy.zip");
              BufferedInputStream bis = new BufferedInputStream(fis);
              BufferedOutputStream bos = new BufferedOutputStream(fos)
              ) {

            sec = System.currentTimeMillis();

            int i;

            while( (i = fis.read()) != -1 ){
                fos.write(i);
            }

            sec = System.currentTimeMillis() - sec;

            System.out.println("fos 시간 : " + sec);

            sec = System.currentTimeMillis();

            i = 0;

            while( (i = bis.read()) != -1 ){
                bos.write(i);
            }

            sec = System.currentTimeMillis() - sec;

            System.out.println("bos 시간 : " + sec);

        } catch (IOException e) {
            System.out.println(e);
        }

        Socket socket = new Socket();

        BufferedReader isr = new BufferedReader( new InputStreamReader(socket.getInputStream()) );
        isr.readLine();

        System.out.println("총 시간 : " + sec);

    }

}
