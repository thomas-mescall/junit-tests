import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CohortTest {

//    @Before
//    public void setup(){
//
//
//        Student tom = new Student( "Thomas", 1);
//        tom.addGrade(85);
//    }

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){
        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student tom = new Student( "Tommy T", 1);
        tom.addGrade(90);

        Student bob = new Student( "Bobby B", 2);
        bob.addGrade(100);
        bob.addGrade(100);
        bob.addGrade(100);

        cohortWithOne.addStudent(tom);
        cohortWithMany.addStudent(tom);
        cohortWithMany.addStudent(bob);
    }

    //A Cohort instance can add a Student to the List of students.
    @Test
    public void testAddStudentWorks(){
        cohortWithMany.addStudent(new Student( "Zachary G", 3));
        // We can test if addStudent worked by getting a specific student's name
        assertEquals("Zachary G", cohortWithMany.getStudents().get(2).getName());
        cohortWithMany.addStudent(new Student( "Vivian", 4));
        // Or we can test if addStudent worked by checking the size of the list
        assertEquals(4, cohortWithMany.getStudents().size());
    }

    //A Cohort instance can get the current List of students.
    @Test
    public void testIfGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());

        assertEquals(1, cohortWithMany.getStudents().get(0).getId());
        assertEquals(2, cohortWithMany.getStudents().get(1).getId());
    }

    //A Cohort instance can get the average, and it's being calculated correctly.
    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(90.0, cohortWithOne.getCohortAverage(), 0);
        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }

//    @Test
//    public void testCohortConstructor(){
//        Cohort student = new Cohort();
//        assertNotNull(student);
//    }
}
