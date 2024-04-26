package ch10;
class Ramyon{
	String ramyon="라면";
	String water = "물";
	String onion = "파";
	void boilwater() {
		System.out.println(water+"을 끓인다");
	}
	void cooking() {
		System.out.printf("%s과 %s를 넣고 끓여 요리 완성",ramyon,onion);
	}
}
//Ramyon 이라는 상위 클래스를 RiceRamyon에 상속받는다
class RiceRamyon extends Ramyon{
	String topp="떡";
	void topping() {
		System.out.println(topp+"을 넣는다");
	}
}
public class ex367 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RiceRamyon rr = new RiceRamyon();
		rr.boilwater(); // 상위 멤버변수와 하위 멤버변수 명이 같다면 하위를 먼저 출력
		rr.topping();
		rr.cooking();

	}

}
