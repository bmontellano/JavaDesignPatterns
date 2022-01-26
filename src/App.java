import java.util.Iterator;
import java.util.logging.Logger;

import patterns.adapter.WineGallonsImplClass;
import patterns.adapter.WineInGallonsInterface;
import patterns.iterator.CourseRepository;
import patterns.singleton.LazyMySingleton;
import patterns.singleton.MySingleton;

public class App {
    
    public static void main(String[] args) {
        //implement logger
        Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        log.info("Hello, welcome to design patterns");
        
        //Implement Iterator Pattern
        /*
        CourseRepository repository = new CourseRepository();
        
        log.info("First, let's add some courses:");

        repository.addCourse("Concepts and Features");
        repository.addCourse("Object Oriented Programming");
        repository.addCourse("Design Patters");
        repository.addCourse("Arrays and ArrayLists");
        
        Iterator<String> courseIterator = repository.iterator();

        log.info("Now let's iterate over the courses:");
        while(courseIterator.hasNext()) {
            log.info(courseIterator.next());
        }
        
        for (String course : repository) {
            System.out.println(course);
        }
        */
        //Implement Singleton Patter
        /*
        //This is "early loadiing"
        MySingleton instance = MySingleton.getInstance();
        System.out.println(instance);
        // grab another instance, where in fact it is the same MySingleton object
        MySingleton newInstance = MySingleton.getInstance();
        System.out.println(newInstance);

        //We want to lazy loading
        LazyMySingleton instance2 = LazyMySingleton.getInstance();
        System.out.println(instance2);
        // grab another instance, where in fact it is the same MySingleton object
        LazyMySingleton newInstance2 = LazyMySingleton.getInstance();
        System.out.println(newInstance2);
        */
        WineInGallonsInterface adapterInterfaceClass = new WineGallonsImplClass();
        adapterInterfaceClass.purchaseWineInGallons(10);




    }
}
