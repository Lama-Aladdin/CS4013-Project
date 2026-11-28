/*
Tasks:
extends Programme, calls super(...),
overrides getLevel() to return "Undergraduate", 
"Taught Postgraduate" or "Research".


*/

package ie.ul.records.model;

public class UndergradProgramme extends Programme{

  public UndergradProgramme(String code, String name, int durationYears, Department department){
  super(code, name, durationYears, department);
  }

@Override
  public String getLevel(){
    return "Undergraduate";
  }
}
