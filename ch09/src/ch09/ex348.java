package ch09;
class Box11{
	private int ivol;
	private double dvol;
	public Box11(int w, int h, int d) {
		volume(w,h,d);
	}
	public Box11(double w, double h, double d) {
		volume(w,h,d);
	}
	private void volume(int w, int h, int d) {
		ivol=w*h*d;
	}
	private void volume(double w, double h, double d) {
		dvol=w*h*d;
	}
	public int get_ivol() {
		return ivol;
	}
	public double get_dvol() {
		return dvol;
	}
}

public class ex348 {

	public static void main(String[] args) {
		Box11 box1 = new Box11(10,20,30);
		System.out.println("박스의 부피(int): "+box1.get_ivol());
		box1 = new Box11(10.5,20.5,30.5);
		System.out.println("박스의 부피(double): "+box1.get_dvol());
		box1 = new Box11(10,20,30.5);
		System.out.println("박스의 부피(int,double): "+box1.get_dvol());
	}
}