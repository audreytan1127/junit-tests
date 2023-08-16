import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class StudentTest {

    private Student student;

    @Before
    public void setup() {
        student = new Student(1, "Alice");
    }

    @Test
    public void testForStudent() {
        Student student1 = new Student();
        assertNotNull(student1);
    }

    @Test
    public void testForThreeArgStudent(){
        assertNotNull(student);
    }

    @Test
    public void testGetStudentInfo(){
        assertEquals(student.getID(), 1);
        assertEquals(student.getName(), "Alice");
    }

    @Test
    public void testAddGrade(){
        ArrayList<Integer> grades = new ArrayList<>();
        student.addGrade(90);
        grades.add(90);
       assertEquals(student.getGrades(), grades);
    }

    @Test
    public void testGradeAverage(){
        student.addGrade(70);
        student.addGrade(90);
        assertEquals(student.getGradeAverage(), 80, 0.00001);
    }


}
