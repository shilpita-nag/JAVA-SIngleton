package MMT.SingletonClass;

public class CloneSingleton implements Cloneable{
    public static CloneSingleton obj = new CloneSingleton();
    private CloneSingleton() {}

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone(); //used to create clone of object
        throw new CloneNotSupportedException(); //used to avoid breaking singleton class
    }
}
