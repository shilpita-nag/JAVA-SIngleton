package MMT.SingletonClass;

public class SingletonEager {

    String name;

    private static SingletonEager obj = new SingletonEager();

    private SingletonEager() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SingletonEager getInstance(String name) {
        return obj;
    }
}
