package entities;

public class Employee {

	public String name;
	public double grossSalary, tax;
	
	public double netSalary () {
		return grossSalary - tax;
	}
	
	public void increaseSalary (double percentage) {
		grossSalary *= (1 + percentage/100);
	}
	
	public String toString() {
		return String.format("%s, $ %.2f", name, grossSalary - tax);
	}
}
