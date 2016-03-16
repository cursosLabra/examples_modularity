package demeter.bad;

import java.util.ArrayList;
import java.util.List;

public class Course {

  private String courseName;
  private List<Student> students;
  
  Course(String courseName) {
    this.courseName = courseName;
    students = new ArrayList<Student>();
  }
  
  Course enrol(Student student) {
    students.add(student);
    return this;
  }
  
  String getName() {
    return courseName;
  }
  
  List<Student> getStudents() {
    return students;
  }
  
}
