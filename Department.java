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

public class Department {
  private String name;
  private String code;
  private List<String> staff = new ArrayList<>(); 

  //Constructor?
  public Department(String name, String code, List staff){
    //List starting empty?
  }


  //getters:
  public Department(String name){
    this.name = name;
  }

  public Department(String code){
    this.code = code;
  }

  //why no getter for list?
  public void AddStaff(Faculty f){
    staff.add(f) // ? 
  }

  public void getStaff(){
    return staff;
  }

  public void findStaff(String id){
    return staff.equals(id);
  }








