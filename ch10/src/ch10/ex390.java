package ch10;
class SD1{
	public int i1;
	public double d1;
	public SD1(int i1) {
		System.out.println("SD1(int i1) 생성자 수행");
		this.i1 = i1*i1;
		System.out.println(i1+"의 제곱은 : "+this.i1);
	}
	public SD1(double d1) {
		System.out.println("SD1(double i1) 생성자 수행");
		this.d1 = d1*d1;
		System.out.println(d1+"의 제곱은 : "+this.d1);
	}
}
//super - 상위 클래스의 멤버 변수나 메소드에 접근
// super.멤버 변수
// super.메소드 이름(매개 변수)
// super - 상위 클래스의 생성자 호출 : 반드시 첫 번째 라인에 위치해야 한다
// super(매개 변수)

class Sub1 extends SD1{
	public Sub1(int i1) {
		// super은 항상 맨 첫번째 라인에 있어야 한다,, 하위 생성자만 사용 가능
		super(i1);
		System.out.println("Sub1(int i1) 생성자 수행");
		this.i1 = this.i1*i1; // this 해당 클래스 안에서 수행함
		System.out.println(i1+"의 3제곱은 : "+this.i1);
	}
	public Sub1(double d1) {
		super(d1);
		System.out.println("Sub1(double i1) 생성자 수행");
		this.d1 = this.d1*d1; // 제곱의 d1을 호출 == this.d1
		System.out.println(d1+"의 3제곱은 : "+this.d1);
	}
}
public class ex390 {

	public static void main(String[] args) {
		Sub1 sub1 = new Sub1(10);
		Sub1 sub2 = new Sub1(10.5);

	}

}
