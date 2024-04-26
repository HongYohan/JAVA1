package ch07;
// extends로 PlusMinus 클래스를 MultiDiv에 상속시킴
class MultiDiv extends PlusMinus{ 
	int gop;
	double nanum;
	public String multi(int x, int y) {
		gop = x*y;
		return "두 수의 곲은 " + gop;
	}
	public String div(int x, int y) {
		nanum = (double)x/y;
		return "두 수의 나눈 값은 " + nanum;
	}
}