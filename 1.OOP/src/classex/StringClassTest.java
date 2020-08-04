package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StringClassTest {

    public static void main(String[] args) throws ClassNotFoundException {

        Class c1 = String.class;

        String str = new String();
        Class c2 = str.getClass();

        Class c3 = Class.forName("java.lang.String");

        Constructor[] cons = c3.getConstructors();

        for(Constructor c : cons){
            System.out.println(c);
        }

        Method[] methods = c3.getMethods();

        for(Method m : methods){
            System.out.println(m);
        }

    }

}
