package ocp.bad;

public class CalculatorOutputter {

  AreaCalculator areaCalculator;
  public CalculatorOutputter(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }
  
  String toXML() throws Exception {
    return "<areas>" + areaCalculator.sum() + "</areas>";
  }
  
  String toHTML() throws Exception  {
    return "<h1>" + areaCalculator.sum() + "</h1>";
  }
  
  String toJSON() throws Exception {
    return "{ \"area\": " + areaCalculator.sum() + " } ";
  }

}
