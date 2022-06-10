package MMT.SingletonClass;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallSIngleton {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        //Singleton class with reflection
        ReflectableSIngleton s1 = ReflectableSIngleton.obj;
        ReflectableSIngleton s2 = null;

        Constructor[] constructor = ReflectableSIngleton.class.getDeclaredConstructors(); //returns public protected and private constructors
                                                                                            // getConstrcutor only return public constructor
        for(Constructor c : constructor) {
            System.out.println("constructor" + c.getName());
            c.setAccessible(true);
            s2 = (ReflectableSIngleton) c.newInstance();
        }
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
