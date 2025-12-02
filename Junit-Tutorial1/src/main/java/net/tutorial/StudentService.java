package net.tutorial;

import java.util.ArrayList;
import java.util.List;

public class StudentService {

    private List<Student> students=new ArrayList<>();

    public List<Student> getStudents(){
        return this.students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudentById(int id){
      return   students.stream()
                .filter((student)->student.getId()== student.id)
                .findFirst()
                .orElse(null);
    }
}
