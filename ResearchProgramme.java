package ie.ul.records.model;

public class ResearchProgramme extends Programme{

  public ResearchProgramme(String code, String name, int durationYears, Department department){
  super(code, name, durationYears, department);
  }

@Override
  public String getLevel(){
    return "Research";
  }
}
