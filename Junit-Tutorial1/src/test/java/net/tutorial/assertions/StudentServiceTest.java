package net.tutorial.assertions;

import net.tutorial.Student;
import net.tutorial.StudentService;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    @Test
    public void getStudentsTest(){
        StudentService service=new StudentService();

        Student student=new Student(1,"Arjun");

        //geAll Student
        List<Student> listOfStudents=service.getStudents();

        //Add Student
        service.addStudent(student);

        boolean actualResult=listOfStudents.isEmpty();
        //check supply condition is true or not
      //  assertTrue(actualResult);
       // assertTrue(()->actualResult);
       // assertTrue(actualResult,"List of student is empty");
        //assertTrue(()->actualResult,"List of Student is Emptyyyy");
        assertTrue(()->actualResult,()->"List Of Student is Empty");
    }

    @Test
    public void getStudentsTestUsingAssertFalse(){
        Student student=new Student(1,"Bhavesh");
        StudentService studentService=new StudentService();

        List<Student> studentList=studentService.getStudents();
        studentService.addStudent(student);

        boolean actualResult=studentList.isEmpty();

        //it expect Actual result should be False
       // assertFalse(actualResult);

      //  assertFalse(actualResult,"There is False Condition");

       // assertFalse(()->actualResult);

        assertFalse(actualResult,()->"Student list not be empty");
    }

    @Test
    public void getStudentByIdTestUsingAssertNull(){
        StudentService service=new StudentService();
        Student student=new Student(1,"Sarang");
        service.addStudent(student);

        Student actualObject=service.getStudentById(1);

       // assertNull(actualObject);
        assertNull(actualObject,"Student Object is not Null");

    }

    @Test
    public void getStudentByIdTestUsingAssertNotNull(){
        StudentService service=new StudentService();
        Student student=new Student(1,"Arjun");

        service.addStudent(student);
        Student actualObject= service.getStudentById(2);

      //  assertNotNull(actualObject);
        assertNotNull(actualObject,"Student object is null");
    }

}