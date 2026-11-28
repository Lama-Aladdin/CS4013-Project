/* Task:
Faculty.java: the same, but getRole() returns "Faculty".
extends Person. 
The constructor takes id, name and email and
passes them to super(...).
It overrides getRole() to return "Student".
*/

package ie.ul.records.model;

public class Faculty extends Person {
  // am i supposed to add stuff like public string teacher, etc?

  public Faculty(String id, String name, String email){
    super(id, name, email); //? i think ive fixed it now?
  }

@Override
  public String getRole() {
    return "Faculty"
      }
}
