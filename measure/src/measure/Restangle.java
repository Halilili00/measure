package measure;

public class Restangle implements Measurable {
	private double x1;
	private double x2;
	private double y1;
	private double y2;

	public Restangle() {
		this.x1=0.0;
		this.x2=1.0;
		this.y1=0.0;
		this.y2=1.0;
	}
	public Restangle(double x2,double y2) {
		this.x1=0.0;
		this.x2=x2;
		this.y1=0.0;
		this.y2=y2;
	}
	public Restangle(double x1, double y1, double x2,double y2) {
		this.x1=x1;
		this.x2=x2;
		this.y1=y1;
		this.y2=y2;
	}
	
	public double width() {
		return Math.abs(this.x2 - this.x1);
	}
	public double length() {
		return Math.abs(this.y2 - this.y1);
	}
	@Override
	public double area() {
		return width() * length();
	}
	@Override
	public double perimeter() {
		return 2 * (width() + length());
	}
	@Override
	public void scale(double scaleValue) {
		this.x2 = this.x1 + scaleValue * width();
		this.y2 = this.y1 + scaleValue * length();
	}
}
