package ch11;
import java.util.Random;
interface IStack{ // 인터페이스 선언
	public void push(int item); // 인터페이스 추상 값 선언
	public int pop();
}
// implements 로 인터페이스를 상속받는다
class FixedStack implements IStack{
	private int stack[];
	private int tos;
	// 한정자 없이 사용
	FixedStack(int size){
		stack = new int[size];
		tos = -1;
	}
	
	public void push(int item) { // 인터페이스에 선언된 값 상속
		if(tos==stack.length-1) System.out.println("스택이 꽉 찾음");
		else stack[++tos] = item;
	}
	
	public int pop() { // 인터페이스에 선언된 값 상속
		if(tos<0) {
			System.out.println("스택이 비었음");
			return 0;
		}
		else return stack[tos--]; // 배열을 역으로 접근함
	}
}
public class ex442 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random();
		// 클래스 선언,, 즉, stack의 크기 설정
		FixedStack mystack1 = new FixedStack(10);
		for(int i=0;i<10;i++) mystack1.push(r.nextInt(10)); // 랜덤 값 입력
		
		System.out.println("스택 : mystack1");
		// pop 함수 이용, 값 출력
		for(int i=0;i<10;i++) System.out.print(mystack1.pop()+" ");
	}

}
