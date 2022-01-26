package patterns.singleton;

public class LazyMySingleton {

      //lazy load a new instance
      private static LazyMySingleton instance = null;

      private LazyMySingleton(){}
  
      public static LazyMySingleton getInstance(){
        if(instance == null)  {
            instance = new LazyMySingleton();
        } 
        return instance;
      }
      
}
