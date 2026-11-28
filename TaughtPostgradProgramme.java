package ie.ul.records.model;

public class TaughtPostgradProgramme extends Programme{

  public TaughtPostgradProgramme(String code, String name, int durationYears, Department department){
  super(code, name, durationYears, department);
  }

@Override
  public String getLevel(){
    return "Taught Postgraduate";
  }
}
