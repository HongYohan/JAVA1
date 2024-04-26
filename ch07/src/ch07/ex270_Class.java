package ch07;

class PlusMinus{
	int add, sub;
	public String plus(int x, int y) {
		add=x+y;
		return "두 수의 합은 " + add;
	}
	public String minus(int x, int y) {
		sub=x-y;
		return "두 수의 차는 " + sub;
	}
}

class Circle{
	double half;
	public String bangirm(double a,String b) {
		half=3.14*(a*a);
		return b+"의 면적은 "+half;
	}
}

class Rectangle{
	int square;
	public String getArea(int width,int height) {
		square=width*height;
		return "사각형의 면적은 "+square;
	}
}