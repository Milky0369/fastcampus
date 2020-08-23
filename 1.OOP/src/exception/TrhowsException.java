package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TrhowsException {

    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);

        return c;

    }

    public static void main(String[] args) {

        TrhowsException test = new TrhowsException();

        try {
            test.loadClass("a.txt", "java.lang.String");

            test.loadClass("b.txt", "java.lang.string");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
