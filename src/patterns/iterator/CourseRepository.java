package patterns.iterator;

import java.util.Iterator;
import java.util.logging.Logger;

public class CourseRepository implements Iterable<String> {

    Logger log = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private String[] courses;
    private int index;


    public CourseRepository(){
        log.info("Defualt CourseRepository Constructor");
        this.courses = new String [0];
        index = 0;
    }

    public void addCourse(String course){
        if(index == this.courses.length) {
            log.info("Adding course: " + course);
            String[] moreCourses = new String[this.courses.length + 1];
            System.arraycopy(this.courses, 0, moreCourses, 0, this.courses.length);
            this.courses = moreCourses;
            moreCourses = null;
        }
        this.courses[index] = course;
        index++;
    }

    @Override
    public Iterator<String> iterator() {   
       Iterator<String> itr = new Iterator<String>(){
           private int currentIndex = 0;

           @Override
           public boolean hasNext() {
               return currentIndex < getCourses().length;
           }

           @Override
           public String next() {
               return getCourses()[currentIndex++];
           }
       };
       return itr;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
