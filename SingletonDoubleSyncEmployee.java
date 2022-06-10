package MMT.SingletonClass;

public class SingletonDoubleSyncEmployee {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String name;
    int id;

    private static SingletonDoubleSyncEmployee obj = null;

    private SingletonDoubleSyncEmployee(String nameP, int idP) {
        name = nameP;
        id = idP;
    }

    public static SingletonDoubleSyncEmployee getInstance(String name, int id) {
        if(obj == null) {
            synchronized (SingletonDoubleSyncEmployee.class) {
                if(obj == null) {
                    obj = new SingletonDoubleSyncEmployee(name,id);
                }
            }
        }
        return obj;
    }
}
