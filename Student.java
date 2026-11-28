/*
extends -> class becomes subclass, gets all parent's fields and methods.
super(..) -> calls parent's constructor and has to be first line in subclass constructor
overriding a method -> @Override marks a method where the subclass gives its own version of 
a parent method

*/

/* 
Tasks: 
Student.java: 
extends Person. ✅ 
The constructor takes id, name and email and passes them to super(...).
It overrides getRole() to return "Student".
Add Javadoc on both classes, both constructors and getRole()

*/

package ie.ul.records.model;

public class Student extends Person {
  public String role; //? Role? studies?

  public Student( String id, String name, String email){
    super(Person); //?
    }

  @Override
  public String getRole(){
    return "Student";
  }

}
 
