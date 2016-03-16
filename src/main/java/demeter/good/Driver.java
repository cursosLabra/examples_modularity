package demeter.good;

public class Driver {

  public static void main(String[] args) {
    University uniovi = new University("UniOvi");
    uniovi.addCourse(
        new Course("HTML").
        enrol(new Student("Mary")).
        enrol(new Student("John"))
    );
    System.out.println("University: " + uniovi.toString());
  }

}
