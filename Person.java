/* Abstract class = a general type that cant be created on its own, new Person() isnt allowed
Subclasses can be created
Private fields with public getters -> other classes can read date but not change it directly (encapsulation)
*/

/* Tasks:
fields: id, name, email (all String)
a constructor that sets all three
a getter for each field
an abstract method getRole() that returns a String
Javadoc comments ?
  */

package ie.ul.records.model; // ??

public abstract class Person {
  public String name;
  private String email;
  private String id; // int?

  // this = getter? for what?
  public void Person(String name, String email, String id) {
    this.name = name;
    this.email = email;
    this.id = id;
    }

  //why do we do these parts? will it be required in other classes?
  public String getName() {
    return name;
  }

  public String getEmail(){
    return email;
  }

  public int getID(){
    return id;
  }

  //"type" of person (student, teacher, staff, etc.)
  public abstract String getType() {
    return "Person";
  }
}

  

  

  
