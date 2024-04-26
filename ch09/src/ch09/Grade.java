package ch09;

public class Grade{
	public Grade(double a, double b, double c) {
		avera(a,b,c);
	}
	double x;
	private void avera(double a, double b, double c) {
		x=(a+b+c)/3;
	}
	public double average() {
		return x;
	}
}