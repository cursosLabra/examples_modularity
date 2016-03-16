package demeter.bad;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * University contains a list of courses.
 * 
 * However, in order to show a course, it has a dependency on students and 
 * their internal method getName
 * 
 * @author Labra
 *
 */
public class University {

  String name;
  List<Course> courses;
  
  University(String name) {
    this.name = name;
    courses = new ArrayList<Course>();
  }
  
  University addCourse(Course course) {
    courses.add(course);
    return this;
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("University: " + name + "\n");
    for (Course course: courses) {
      sb.append(" Course: " + course.getName() + "\n");
      sb.append(" Students: " );
      for (Student student: course.getStudents()) {
        sb.append(student.getName() + " ");
      }
    }
    return sb.toString();
  }
}
