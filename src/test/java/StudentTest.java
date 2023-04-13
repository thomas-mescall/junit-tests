import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {
    @Test
    public void studentConstructor(){
        Student Tom = new Student("Tom", 123);
        Student Tommy = null;

        assertNull(Tommy);
        assertNotNull(Tom);
    }

    @Test
    public void getName(){
        Student student = new Student("Tom", 1234);
        Object teacher = new Object();
        assertNotSame(teacher, student);
    }

//    @Test
//    public void addGrade(){
//
//    }
//
//    @Test
//    public void getGrades(){
//
//    }
//
//    public void getGradeAverage(){
//
//    }
}
