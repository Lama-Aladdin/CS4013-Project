/*
A field can hold another object, not just text/numbers
Thats how classes link together:
an enrolment holds a student and a programme
logic method checks a rule before changing anything
rule broken -> throw new IllegalStateException("reason")

*/

/* Tasks:
fields student (Student), programme (Programme), startYear (String, e.g. "2026/27") and yearOfStudy (int)
a constructor that takes student, programme and startYear. It sets yearOfStudy to 1 and calls student.addEnrolment(this).
a getter for each field
advanceYear(): if the student is already in the final year (programme.getDurationYears()), throw an IllegalStateException. Otherwise, add 1 to yearOfStudy.

update student.java
*/

public class Enrolment{
  private Student student;
  private Programme programme;
  private String startYear;
  private int yearOfStudy;

  public Enrolment(String student, String programme, String startYear){
    this.student = student;
    this.programme = programme;
    this.startYear = startYear;
    this.yearOfStudy = 1;
    student.addEnrolment(this);
  }

  public Student getStudent(){
    return student;
  }

  public Programme getProgramme(){
    return programme;
  }

  public String getStartYear(){
    return startYear;
  }

  public int getYearOfStudy(){
    return yearOfStudy;
  }

  public void advanceYear(){
    if (yearOfStudy >= programme.getDurationYears()) {
      throw new IllegalStateException("Already in final year");
    } else {
      yearOfStudy++;
    }
  }

  
}
