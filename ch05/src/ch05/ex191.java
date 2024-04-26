package ch05;
import java.util.Scanner;
public class ex191 {

	public static void main(String[] args) {
		// While 반복문
		Scanner number = new Scanner(System.in);
		System.out.print("시작: ");
		int num1=number.nextInt();
		Scanner numberr = new Scanner(System.in);
		System.out.print("끝: ");
		int num2=numberr.nextInt();
		
		int begine=num1;
		int sum=0;
		System.out.printf("%d~%d까지의 3의 배수 : ",begine,num2);
		while(num1<=num2) {
			if(num1%3==0) {
				sum+=num1;
				if(num1%3==0 && num1+3<=num2) {
					System.out.printf("%d, ",num1);
				}
				else {
					System.out.printf("%d\n",num1);
				}
			}
			num1++;
		}
		System.out.printf("%d~%d까지의 3의 배수 합 : %d\n",begine,num2,sum);
		
		
		// While 무한 루프 while(true)
		while(true) {
			Scanner dan1 = new Scanner(System.in);
			System.out.print("원하는 단을 입력하세요(0: Stop): ");
			int dan=dan1.nextInt();
			
			if(dan==0) {
				System.out.print("무한루프를 종료합니다!");
				break;
			}
			
			int i=1;
			if(dan>1&&dan<10) {
				while(i<10) {
					System.out.printf("%dx%d = %d\n",dan,i,dan*i);
					i++;
				}
			}
			else System.out.print("2~9단 사이를 입력하세요!\n");
		}
		
		// Do-While 문
		Scanner dan1 = new Scanner(System.in);
		System.out.print("원하는 단을 입력하세요(0: Stop): ");
		int dan=dan1.nextInt();
		int i=1;
		do {
			System.out.printf("%dx%d = %d\n",dan,i,dan*i);
			i++;
		}while(i<10);
		
		
		// Do-While을 While문으로 바꾼 식
		Scanner month = new Scanner(System.in);

		int month1=1;
		while(month1!=0) {
			System.out.print("월을 입력하세요(끝: 0): ");
			month1=month.nextInt();
			
			if(month1>=3 && month1<=5) {
				System.out.printf("%d월은 봄 입니다.",month1);
			}
			else if(month1>=6&&month1<=8) {
				System.out.printf("%d월은 여름 입니다.",month1);
			}
			else if(month1>=9&&month1<=11) {
				System.out.printf("%d월은 가을 입니다.",month1);
			}
			else if(month1==1 || month1==2 || month1==12) {
				System.out.printf("%d월은 겨울 입니다.",month1);
			}
			else{
				System.out.printf("%d월은 잘못 입력하셨습니다.",month1);
			}
			System.out.print("\n월을 입력하세요(끝: 0): ");
			month1=month.nextInt();
		}
		System.out.println("출력을 종료합니다.");
		
		
		// 2중 while문
		Scanner number5 = new Scanner(System.in);
		int num5=1;
		while(num5!=0) {
			System.out.print("정수 하나 입력(0:Stop): ");
			num5=number5.nextInt();
			
			
			if(num5>0) System.out.printf("1~%d까지 2의 배수이면서 3의 배수가 아닌 수:",num5);
			else System.out.print("프로그램을 종료합니다.");
			
			int i=1;
			while(i<=num5) {
				if(i%2==0 && i%3!=0) {
					if(i+2<=num5 || i+3<=num5) System.out.printf("%d, ",i);
					else System.out.printf("%d",i);
				}
				i++;
		}
		System.out.print("\n");
		}
	}
}