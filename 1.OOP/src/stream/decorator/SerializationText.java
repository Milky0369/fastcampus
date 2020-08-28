package stream.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Person {

    String name;
    String job;

    public Person(String name, String job){
        this.name = name;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}

public class SerializationText {

    public static void main(String[] args) {

        Person lee = new Person("이순신","엔지니어");
        Person kim = new Person("김유신","선생님");

        try(FileOutputStream fos = new FileOutputStream("serial.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos)
        ){

            oos.writeObject(lee);
            oos.writeObject(kim);

        } catch(Exception e) {
            System.out.println(e);
        }

        try(FileInputStream fis = new FileInputStream("serial.dat");
            ObjectInputStream ois = new ObjectInputStream(fis)
        ) {

            Person p1 = (Person)ois.readObject();
            Person p2 = (Person)ois.readObject();

            System.out.println(p1);
            System.out.println(p2);

        } catch(Exception e) {
            System.out.println(e);
        }

    }

}
