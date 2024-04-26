package ch02;
import java.util.Scanner; // 함수는 package 밑에 입력한다, 라이브러리 클래스 포함
public class ex64 {

	public static void main(String[] args) {
		System.out.println("처음 시작하는 자바!"); // 개행
		System.out.print("처음 시작하는 자바!"); // 개행 x
		System.out.println("처음 시작하는"+" 자바!"); // 문자열 연결
		
		Scanner stdIn= new Scanner(System.in); // scanner 형식으로 stdIn의 변수값을 받는다.
		// new는 새로운 값을 만들때 사용, System.in 은 키보드로 입력받겠다는 소리임
		System.out.print("몇 번째 프로그램인지 입력하세요 : ");
		String s= stdIn.next();
		//string으로 문자열의 형태이고 s는 변수이다. 그래서 stdIn의 값을 s에 저장한다.
		System.out.println(s+" 번째로 작성해 보는 자바 프로그램 입니다"); //s의 값을 출력
		
		//ex75
		Scanner stdIn=new Scanner(System.in);
		System.out.print("이름과 나이, 몸무게를 공간(space)으로 구분하여 입력 : ");
		//스페이스든 엔터든 뭐든 상관없다.
		String name = stdIn.next(); //문자열을 받음
		int age = stdIn.nextInt(); //정수를 받음
		double weight =stdIn.nextDouble(); //실수를 받음
		System.out.println(name+"씨의 나이는 "+age+"세이고");
		System.out.println("몸무게는 "+weight+"Kg 입니다");
	}
}