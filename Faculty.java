/* Task:
Faculty.java: the same, but getRole() returns "Faculty".
extends Person. 
The constructor takes id, name and email and
passes them to super(...).
It overrides getRole() to return "Student".
*/

package ie.ul.records.model;

public class Faculty extends Person {
   private Department department;

  public Faculty(String id, String name, String email, Department department){
    super(id, name, email); //? i think ive fixed it now?
    this.department = department;
  }

@Override
  public String getRole() {
    return "Faculty";
      }

  public Department getDepartment(){
    return department;
  }


