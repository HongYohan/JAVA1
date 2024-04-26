package ch03;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		//문제 1 형 변환
		System.out.println("2진 상수: 0b101010" +"->"+0b101010); 
		System.out.println("8진 상수: 052" +"->"+052);
		System.out.println("16진 상수: 0X2A"+"->" + 0X2A);		
		System.out.println("43을 2진 상수: "+"0b101011");
		System.out.println("43을 8진 상수: "+"053");
		System.out.println("43을 16진 상수: "+"0X2B");
		char c= 43;
		System.out.println("43을 한 문자로: "+c);
		
		System.out.printf("43을 8진 상수: %o\n",43); // %o은 8진수 형식으로 출력함 
		System.out.printf("43을 16진 상수: %x\n",43); // %x는 16진수 형식으로 출력함
		System.out.printf("43을 한 문자로: %c\n",43); // %c는 char 형식으로 출력
		Scanner number = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num=number.nextInt(); 
		System.out.print("2진수: ");
		System.out.println(Integer.toBinaryString(num)); // Integer.toBinaryString(num)로 2진수 변환
		System.out.print("8진수: 0");
		System.out.println(Integer.toOctalString(num)); // Integer.toOctalString(num)로 8진수 변환
		System.out.print("16진수: 0x");
		System.out.println(Integer.toHexString(num)); // Integer.toHexString(num)로 16진수 변환
		

		//문제 2 환율 변환
		Scanner money = new Scanner(System.in);
		System.out.print("원화를 입력하세요(단위: 원): ");
		int mon = money.nextInt();
		int other_mon= mon/1100;
		int change=mon-other_mon*1100;
		System.out.printf("%d원은 $%d입니다.\n",mon,other_mon);
		System.out.printf("원금 %d원에서 환율로 변환한 값인 %d값을 제외한 ",mon,1100*other_mon);
		System.out.printf("나머지 %d원을 반납.\n\n",change);

		//문제 3 원의 둘레와 넓이 구하기
		Scanner circle = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		double circles = circle.nextDouble();
		final double PI=3.14159;
		System.out.printf("반지름이 %.2f인 원의 둘레: %.2f입니다.\n",circles,circles*PI*2);
		System.out.printf("반지름이 %.2f인 원의 넓이: %.2f입니다.",circles,circles*PI*circles);
		
		//문제 4 사칙연산
		Scanner numver1 = new Scanner(System.in);
		System.out.print("첫 번째 정수 입력: ");
		int numb1=numver1.nextInt();
		Scanner numver2 = new Scanner(System.in);
		System.out.print("두 번째 정수 입력: ");
		int numb2=numver2.nextInt();
		System.out.printf("%d + %d = %d\n",numb1,numb2,numb1+numb2);
		System.out.printf("%d - %d = %d\n",numb1,numb2,numb1-numb2);
		System.out.printf("%d * %d = %d\n",numb1,numb2,numb1*numb2);
		System.out.printf("%d / %d = %.2f\n\n",numb1,numb2,numb1/(double)numb2); // 둘중의 하나의 값은 강제변환해야한다.
		
		//문제 5 초로 시간 구하기
		Scanner second_time = new Scanner(System.in);
		System.out.print("정수 입력: ");
		int timenow=second_time.nextInt();
		int second=timenow%60;
		int hour=(timenow-second)/3600;
		int minute=(timenow-second)/60 - hour*60;
		System.out.printf("%d초는 %d시간, %d분, %d초 입니다.\n\n",timenow,hour,minute,second);
		
		//문제 6 가장 큰수 구하기
		Scanner number = new Scanner(System.in);
		System.out.print("각각 다른 정수 3개를 입력하세요: ");
		int num1=number.nextInt();
		int num2=number.nextInt();
		int num3=number.nextInt();
		int most_num = num1 > num2 ? num1 > num3 ? num1 : num2 > num3 ? num2 : num3: num2 > num3 ? num2 : num3;
		System.out.printf("가장 큰 수는 : %d",most_num);
	}
}