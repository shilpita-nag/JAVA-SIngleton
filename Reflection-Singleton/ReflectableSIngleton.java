package MMT.SingletonClass;

public class ReflectableSIngleton {

    public static ReflectableSIngleton obj = new ReflectableSIngleton();

    private ReflectableSIngleton() {
    }

    public static ReflectableSIngleton getInstance(){
        return obj;
    }
}
