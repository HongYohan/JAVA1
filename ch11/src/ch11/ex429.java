package ch11;

class Item{
	public int price;
	
}
class Noodle extends Item{
	public Noodle() {
		price =2500;
	}
	public String toString() {return "국수";}
}
class Mixnoodle extends Item {
	public Mixnoodle() {
		price = 3000;
	}
	public String toString() { return "비빔 국수";}
}
class Wodong extends Item{
	public Wodong() {
		price = 2500;
	}
	public String toString() {return "우동";}
}
class Buyer{
	private int money;
	public Buyer(int money) {
		this.money = money;
	}
	// Item 클래스를 여기서는 속성으로 사용함
	public void buy(Item it, int count) {
		System.out.println(it+"을(를) "+count+"개 맛있게 먹었습니다");
		money = money - it.price*count;
		System.out.println("현재 남은 돈 : " + money);
	}
}

public class ex429 {
	public static void main(String args[]) {
		Buyer me = new Buyer(20000); // 선언과 동시에 가진 돈을 초기화함
		me.buy((new Wodong()), 3); // new로 Item 하위클래스에 해당되는 클래스를 선언하여 불러옴
		me.buy((new Noodle()), 2);
		me.buy((new Mixnoodle()), 2);
	}
}