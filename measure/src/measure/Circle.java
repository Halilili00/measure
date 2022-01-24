package measure;

public class Circle implements Measurable{
	private double x;
	private double y;
	private double rain;
	
	public Circle() {
        this.x = 0;
        this.y = 0;
        this.rain = 1;
    }
	
    public Circle(double rain) {
        this.x = 0;
        this.y = 0;
        this.rain = Math.abs(rain); 
    }
	
    public Circle(double x, double y, double rain) {
        this.x = x;
        this.y = y;
        this.rain = Math.abs(rain);
    }
	
    public void setRain(double rain) {
        this.rain = Math.abs(rain);   //säde ei saa olla negatiivinen
    }
	
    public void setX(double x) {
        this.x = x;
    }
	
    public void setY(double y) {
        this.y = y;
    }
	
    public double getRain() {
        return rain;
    }
	
    public double getX() {
        return x;
    }
	
    public double getY() {
        return y;
    }

	@Override
	public double area() {
		return Math.PI * getRain() * getRain();
	}

	@Override
	public double perimeter() {
		return 2 * Math.PI * getRain();
	}

	@Override
	public void scale(double scaleValue) {
		this.rain = scaleValue * getRain();
	}
}
