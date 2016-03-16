package demeter.good;

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
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(" Course: " + courseName + "\n");
    sb.append(" Students: " );
    for (Student student: students) {
      sb.append(student + " ");
    }
    return sb.toString();
  }
  
}
