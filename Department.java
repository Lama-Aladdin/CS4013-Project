/*
Lists (ArrayList) and adding to them
-> Declare with List<Faculty>
-> Created with Arraylist<>()
.add(x) to add
.size() to count
for (Faculty f : staff) to loop through it
Compare strings with .equals(), never ==
A getter returns only a COPY of the list

*/

/*
Tasks:
-> fields code and name (Strings) and staff (a List<Faculty>) ✅
-> a constructor that takes code and name, with the list starting empty ✅
-> getters for code and name ✅
-> addStaff(Faculty f) method
-> getStaff(), which returns a copy of the list✅
-> findStaff(String id), which returns the matching Faculty, or null if there isn't one
Javadoc on everything

Update Faculty.java: add a private Department department field, 
take it as a 4th constructor parameter, 
and add getDepartment().

*/

package ie.ul.records.model;
import java.util.List;
import java.util.ArrayList; //mistake

public class Department {
  private String name;
  private String code;
  private List<Faculty> staff = new ArrayList<>(); //starts empty, hold faculty object

  //Constructor?
  public Department(String name, String code){
    this.code = code;
    this.name = name;
  }


  //getters:
  public String getCode(){
    return code;
  }

  public String getName(){
    return name;
  }

  //why no getter for list?
  public void AddStaff(Faculty f){
    staff.add(f) // ? 
  }

  public List<Faculty> getStaff(){
    return new ArrayList<>(staff);
  }

  public Faculty findStaff(String id){
    for (Faculty f : staff) {
      if (f.getID().equals(id)) {
        return f;
      }
   }
    return null;
  }
}








