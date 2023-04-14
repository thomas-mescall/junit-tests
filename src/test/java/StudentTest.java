import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {
    @Test
    public void testStudentConstructor(){
        Student Tom = new Student("Tom", 1);
        assertNotNull(Tom);
    }

    @Test
    public void testStudentFields(){
        Student Tom = new Student("Tom", 1);
        assertSame("Tom", Tom.getName());
        assertSame(1, Tom.getId());
        assertSame(0, Tom.getGrades().size()); //we use .size because getGrade returns an ArrayList
    }

    @Test
    public void testAddGrade(){
        Student Tom = new Student( "Tom", 1);
        Tom.addGrade(100);
        assertSame(100, Tom.getGrades().get(0));
    }

    @Test
    public void getGradeAverage(){
        Student Tom = new Student("Tom", 1);
        Tom.addGrade(100);
        Tom.addGrade(50);
        assertEquals(75, Tom.getGradeAverage(), 0);
    }
}
