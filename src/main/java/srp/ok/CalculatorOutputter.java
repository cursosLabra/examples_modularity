package srp.ok;

public class CalculatorOutputter {

  AreaCalculator areaCalculator;
  public CalculatorOutputter(AreaCalculator areaCalculator) {
    this.areaCalculator = areaCalculator;
  }
  
  String toXML() {
    return "<areas>" + areaCalculator.sum() + "</areas>";
  }
  
  String toHTML() {
    return "<h1>" + areaCalculator.sum() + "</h1>";
  }
  
  String toJSON() {
    return "{ \"area\": " + areaCalculator.sum() + " } ";
  }

}
