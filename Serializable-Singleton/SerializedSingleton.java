package MMT.SingletonClass;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
    public static SerializedSingleton obj = new SerializedSingleton();

    private SerializedSingleton() {
    }

    //added to resolve serializable problem
    protected Object readResolve() {
        return obj;
    }
}
