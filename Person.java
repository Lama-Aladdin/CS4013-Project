/* Abstract class = a general type that cant be created on its own, new Person() isnt allowed
Subclasses can be created
Private fields with public getters -> other classes can read date but not change it directly (encapsulation)
*/

/* Tasks:
fields: id, name, email (all String) ✅ 
a constructor that sets all three ✅ -> no reutrn type
a getter for each field ✅ -> public for this one
an abstract method getRole() that returns a String ✅ -> an abstract method has no body
Javadoc comments *
  */

package ie.ul.records.model; // ?? change 

public abstract class Person {
  private String name;
  private String email;
  private String id; // int? ID is label, not something to do math with

  /* this = constructor. runs once when an object (new student (n,e,id)) is created. this. puts
  values into the field */
  public Person(String name, String email, String id) {
    this.name = name;
    this.email = email;
    this.id = id;
    }

  /*Getters, theyre public. the only way other classes can read them.
Example: Transcript calls student.getName()
 */
  public String getName() {
    return name;
  }

  public String getEmail(){
    return email;
  }

  public String getID(){
    return id;
  }

  //an abstract method has no body
  public abstract String getRole() {
  }
}

  

  

  
