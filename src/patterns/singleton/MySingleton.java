package patterns.singleton;

public class MySingleton {
    //early load a new instance
    private static MySingleton instance = new MySingleton();

    private MySingleton(){}

    public static MySingleton getInstance(){
        return instance;
    }
    
}
