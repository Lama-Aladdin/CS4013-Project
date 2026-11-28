/*
Polymorphism ->
-> one method call behaves differently depending on the object
-> Abstract parent declares method with no body
-> each subclass gives its own version
-> code can loop through List<Programme> calling p.getLevel()
-> without knowing which type each one is.

*/

/* 
Tasks:
Programme.java (abstract): ✅
fields code and name (Strings), durationYears (int) and department (Department) ✅
a constructor and a getter for each field ✅
an abstract method getLevel() that returns a String

*/

package ie.ul.records.model;

public abstract class Programme { //why do abstract classes need public/private
  private String code;
  private String name;
  private int durationYears;
  private Department department; //public? private?

  public Programme(String code, String name, int durationYears, Department department){
    this.code = code;
    this.name = name;
    this.durationYears = durationYears;
    this.department = department;
  }

  public String getCode(){ // are getters methods? are the brackets correct?
    return code;
  }

  public String getName(){
    return name;
  }

  public int getDurationYears(){
    return durationYears;
  }

  public Department getDepartment(){
    return department;
  }

  public abstract String getLevel(){ 
  }  
  
  
}
