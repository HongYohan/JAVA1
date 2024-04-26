package ch03;

import java.util.Scanner;

public class ex99 {

	public static void main(String[] args) {
		byte a = 128; // 범위에 초과된다,, (byte)128은 강제 할당으로 -1이 나온다,, 오버플로우
		System.out.println(a);
		
		System.out.println("2진수 0b111 = "+0b111); // 2진수로 초기화
		System.out.println("8진수 017 = "+017); // 8진수
		System.out.println("16진수 0XAF = "+0XAF); // 16진수 대문자로 적으면 대문자로 결과값이 나옴
		
		int hexa16=0XAF; //숫자 변수에 담았기 때문에 숫자로 출력됨
		char ch1 =0x41, ch2=0101; //문자 변수에 담았기에 문자로 출력됨
		System.out.println(ch1);
		System.out.println(ch2); //8진수 아스키코드값 출력
		System.out.println(hexa16); //변수에 있는 값 출력
		
		char ch3 ='韓', ch4='國', ch5='K', ch6='\u004f', ch7='R', ch8='\u0045', ch9='A';
		System.out.println("출력결과: " + ch3 + ch4 + " = " + ch5 + ch6 + ch7 + ch8 + ch9);
		
		
		// 실수형
		float f = 3.14f; // 구문 오류로 묵시적 double로 취급되기에 3.14f로 표기해야 한다 
		double d =3.14; // 3.14d 나 3.14나 같다.
		
		// 상수
		final PI=3.14159; //PI라는 상수를 지정한것 default랑 같음
		
		// 형식 지정자,, 개행이 자동 x됨 그래서 \n을 사용해야 한다
		System.out.printf("%d, %c, %f, %s\n"), int,char,double,String); // 형식으로 지정할수 있다
		
		// printf 정수형,,
		// %-10d는 값을 왼쪽에 두고 나머지 7개의 공간을 오른쪽에 채움
		// %+10d는 값을 오른쪽에 두고 부호도 표현해준다 나머지 9개의 공간을 왼쪽에 채움
		// %10d는 값을 오른쪽에 두고 나머지 6개의 공간을 왼쪽에 채움
		System.out.printf("%-10d원 짜리 %+10d개를 사면 %10d입니다\n",300,9,300*9);
		System.out.printf("10진수 15를 16진수로 출력하면 : %X, 8진수로 출력하면 : %o\n", 15,15);
		
		// printf 실수형,, .1f는 소수점 1자리 까지 반올림해서 표기함
		Scanner inch=new Scanner(System.in);
		System.out.print("inch입력: ");
		double inch_Num= inch.nextDouble();
		System.out.println(inch_Num+" inch는 "+inch_Num*2.54+"cm입니다");
		System.out.printf("%.1f inch는 %.2fcm입니다.",inch_Num,inch_Num*2.54); //.2f는 소수자리를 2자리까지 표기함
		
		// 강제 형 변환
		int num1=4;
		int num2=3;
		System.out.println(num1/num2); // 결과 1만 출력됨,, 고로 둘중에 아무거나 강제 변환으로 double형이 들어가야 한다
		System.out.println(num1/(double)num2); // 결과 1.3333이 출력됨 
		
		// 연산자
		// 산술 연산자(+,-,*,/,%(나머지))
		// var ++,++var,var--,--var 등으로 구분가능
		// 관계 연산자(>,>=,<,<=,==,!=(같지 않음)
		// 논리 연산자(&&,||,!(not))
		// 시프트 연산자
		// a<<n: a*2의n승 / a>>n: a/2의n승

		// 삼항연산자
		// 조건 ? 참 : 거짓;
		int count = 18;
		System.out.println(count != 10 ? "10이 아님": "10을 가짐");
		int b = -10;
		System.out.println(b>=0?b*b:-b*-b);
	}
}