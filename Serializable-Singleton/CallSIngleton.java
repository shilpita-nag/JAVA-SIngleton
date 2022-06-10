package MMT.SingletonClass;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallSIngleton {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        //Singleton with Serializable
        SerializedSingleton s1 = SerializedSingleton.obj;
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.txt"));
        out.writeObject(s1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.txt"));
        SerializedSingleton s2 = (SerializedSingleton) in.readObject();
        in.close();

        System.out.println("instance1 hashCode:- "
                + s1.hashCode());
        System.out.println("instance2 hashCode:- "
                + s2.hashCode());

    }
}
