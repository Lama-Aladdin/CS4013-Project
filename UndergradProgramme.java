/*
Tasks:
extends Programme, calls super(...),
overrides getLevel() to return "Undergraduate", 
"Taught Postgraduate" or "Research".


*/

public class UndergradProgramme extends Programme{
  super(code, name, durationYears, department);

@Override
  public String getLevel(){
    return "Undergraduate";
  }
}
