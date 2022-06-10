package MMT.SingletonClass;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class CallSIngleton {
    public static void main(String args[]) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {
        //Call to SingletonEmployee
        SingletonEmployee s = SingletonEmployee.getInstance("Shilpita", 1);
        System.out.println(s.getName()+s.getId());
        SingletonEmployee s1 = SingletonEmployee.getInstance("Shilpita1", 2);
        System.out.println(s1.getName()+s1.getId());

        //Call to SingletonSyncEmployee & SingletonDoubleSyncEmployee
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                SingletonDoubleSyncEmployee s = SingletonDoubleSyncEmployee.getInstance("Shilpita", 1);
                System.out.println(s.getName()+s.getId());
            }
        };

        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                SingletonDoubleSyncEmployee s1 = SingletonDoubleSyncEmployee.getInstance("Shilpita1", 2);
                System.out.println(s1.getName()+s1.getId());
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();

        //Call to SingletonEager
        SingletonEager s = SingletonEager.getInstance("Shilpita");
        System.out.println(s.getName());
        SingletonEager s1 = SingletonEager.getInstance("Shilpita1");
        System.out.println(s1.getName());

    }
}
