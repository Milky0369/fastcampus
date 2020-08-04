package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassTest {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

        Person p1 = new Person("James");
        System.out.println(p1);

        Class c1 = Class.forName("classex.Person");

        Person p2 = (Person)c1.newInstance();
        System.out.println(p2);

        Class[] parameterTypes = {String.class};
        Constructor cons = c1.getConstructor(parameterTypes);

        Object[] init = {"김유신"};
        Person p3 = (Person)cons.newInstance(init);
        System.out.println(p3);

    }

}
