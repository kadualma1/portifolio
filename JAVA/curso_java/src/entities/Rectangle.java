package entities;

public class Rectangle {

	public double height, width;
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return (height + width) * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(height * height + width * width);
	}
	
	public String toString () {
		return String.format("AREA = %.2f%nPERIMETER = %.2f%nDIAGONAL = %.2f%n", area(), perimeter(), diagonal());
	}
}
