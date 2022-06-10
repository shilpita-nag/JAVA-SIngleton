package MMT.SingletonClass;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallSIngleton {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        //Singleton with Cloneable
        CloneSingleton c1 = CloneSingleton.obj;
        CloneSingleton c2 = (CloneSingleton) c1.clone();
        System.out.println("instance1 hashCode:- "
                + c1.hashCode());
        System.out.println("instance2 hashCode:- "
                + c2.hashCode());

    }
}
