package ch10;
import java.util.Scanner;

class Engine{
	String capacity;
	String fuel;
	private int price =20000000;
	public Engine(int cc,int fuel) {
		if(cc==1) {
			capacity="2000cc미만";
			price+=0;
		}
		else if(cc==2) {
			capacity="2000cc이상";
			price+=10000000;
		}
		else if(cc==3) {
			capacity="100kWh 미만";
			price+=15000000;
		}
		else if(cc==4) {
			capacity="100kWh 이상";
			price+=20000000;
		}
		else {System.out.println("명확한 값을 입력하시오!");}
		
		if(fuel==1) {
			this.fuel ="가솔린";
			price += 5000000;
		}
		else if(fuel==2) {
			this.fuel="디젤";
		}
		else if(fuel==3){this.fuel="전기차";}
	}
	public int getPrice() {
		return price;
	}
}
class Car{
	String color;
	Engine e; // Car이라는 클래스의 속성으로 Engine이라는 객체를 선언함
	public Car(String c, int cc, int fuel) {
		color =c;
		e = new Engine(cc,fuel); // Engine이라는 객체 생선과 선언
	}
	public String getPrice() {
		// e.capacity나 e.fuel, e.getPrice는 Engine이라는 객체에 연동되어 값을 가져옴
		return "당신이 요청한 " + e.capacity + "의 " + e.fuel + 
				"차량(컬러:"+color+")의 가격은 : "+e.getPrice();
	}
}
public class ex408 {

	public static void main(String[] args) {
		String color;
		int cc, fuel;
		for(;;) {
			System.out.print("차량 구입(1:2000cc이하, 2:2000cc이상, "
					+ "3:1000와트이하, 4:1000와트이상): ");
			Scanner s = new Scanner(System.in);
			cc=s.nextInt();
			if(cc==0) {
				break;
			}
			if(cc ==1 || cc==2) {
				System.out.println("차의 연료 선택(1:가솔린, 2:디젤): ");
				fuel=s.nextInt();
			}
			else {fuel=3;}
			System.out.println("차량 색상: ");
			color=s.next();
			Car c = new Car(color,cc,fuel); // Car 클래스 선언과 동시에 초기화
			System.out.println(c.getPrice()); // 값을 가져옴
		}
	}

}
