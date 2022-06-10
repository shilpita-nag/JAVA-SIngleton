package MMT.SingletonClass;

public class SingletonSyncEmployee {
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

    private static SingletonSyncEmployee obj = null;

    SingletonSyncEmployee(String nameParam, int idParam) {
        name = nameParam;
        id = idParam;
    }

    public static synchronized SingletonSyncEmployee getInstance(String name, int id) {
        if(obj == null)
            obj = new SingletonSyncEmployee(name,id);
        return obj;
    }
}
