package MMT.SingletonClass;

public class SingletonEmployee {
    String name;
    int id;

    private static SingletonEmployee obj = null;

    private SingletonEmployee(String nameParam, int  idParam) {
        name = nameParam;
        id = idParam;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public static SingletonEmployee getInstance(String name, int id) {
        if(obj == null) {
            obj =  new SingletonEmployee(name,id);
        }
        return obj;
    }
}
