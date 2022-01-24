package measure;

import java.util.ArrayList;
import java.util.Scanner;

public class MeasurableMain {
	private ArrayList<Measurable> shapes = new ArrayList<Measurable>();
	public static void main(String[] args) {
		MeasurableMain esim = new MeasurableMain();
		esim.addShapes();
		esim.printAreaAndPerimeter();
		esim.scaleAndPrint();
	}
	//Lis‰‰ ArrayListaan oliot
	public void addShapes() {
		shapes.add(new Restangle(4, 2));
		shapes.add(new Restangle(2, 1, 5, 3));
		shapes.add(new Restangle(9, 1, 2, 3));
		shapes.add(new Circle(5));
	}
	
	public void printAreaAndPerimeter() {
		for(Measurable s: shapes) {
			System.out.println("Area: " + s.area() + ", perimeter: " + s.perimeter());
		}
	}
	
	public void scaleAndPrint() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter scale value: ");
		double scaleValue = scanner.nextDouble();
		System.out.println("Skaalaus");
		for(int i=0; i<shapes.size(); i++) {
			shapes.get(i).scale(scaleValue);
			System.out.println("Area: " + shapes.get(i).area() + ", perimeter: " + shapes.get(i).perimeter());
		}
		scanner.close();
	}

}
