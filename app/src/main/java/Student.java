




public class Student {
  private int StudentID;
  private String StudentName;
  private String StudentAddress;
  private String StudentCourse;
  private int StudentAge;

  public Student(int studentID, String studentName, String studentAddress, String studentCourse, int studentAge) {
    this.StudentID = studentID;
    this.StudentName = studentName;
    this.StudentAddress = studentAddress;
    this.StudentCourse = studentCourse;
    this.StudentAge = studentAge;
  }
  
  // Display the Student Details
  public void displayStudentDetails() {
    System.out.println("Student ID: " + StudentID);
    System.out.println("Student Name: " + StudentName);
    System.out.println("Student Address: " + StudentAddress);
    System.out.println("Student Course: " + StudentCourse);
    System.out.println("Student Age: " + StudentAge);
  }



}
