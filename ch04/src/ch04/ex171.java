package ch04;
import java.util.Scanner;
public class ex171 {

	public static void main(String[] args) {

		// if - else if - else 문
		Scanner num = new Scanner(System.in);
		System.out.print("숫자를 입력: ");
		int count= num.nextInt();
		if(count>0) System.out.printf("입력된 수: %d은(는) 양수 입니다",count);
		else if(count<0) System.out.printf("입력된 수: %d은(는) 음수 입니다",count);
		else System.out.printf("입력된 수: %d은(는) zero입니다.", count);
		
		// 내포 if문
		Scanner num_1 = new Scanner(System.in);
		System.out.print("\n점수를 입력: ");
		int score= num_1.nextInt();
		
		if(score>=60) {
			if(score>=70) {
				if(score>=80) {
					if(score>=90) {
						if(score==100) {
							System.out.printf("입력된 점수: %d\nA+학점",score);
						}
						else System.out.printf("입력된 점수: %d\nA학점",score);
					}
					else System.out.printf("입력된 점수: %d\nB학점",score);
				}
				else System.out.printf("입력된 점수: %d\nC학점",score);
			}
			else System.out.printf("입력된 점수: %d\nD학점",score);
		}
		else System.out.printf("입력된 점수: %d\n학점 취득 실패",score);
		
		
		// 다중 if 문
		Scanner number = new Scanner(System.in);
		System.out.print("각각 다른 정수 3개를 입력하세요: ");
		int num1=number.nextInt();
		int num2=number.nextInt();
		int num3=number.nextInt();
		if(num1 > num2 && num1 > num3) System.out.printf("가장 큰 수는 : %d",num1);
		else if(num2 > num3 && num2 > num1) System.out.printf("가장 큰 수는 : %d",num2);
		else System.out.printf("가장 큰 수는 : %d",num3);
		
		// 계절 구하기
		Scanner num_2 = new Scanner(System.in);
		System.out.print("\n현재의 월 입력(1~12): ");
		int month= num_2.nextInt();
		
		if (month<1 || month>12) System.out.printf("잘못된 입력입니다.");
		else {
			if (month>=3&&month<=5) System.out.printf("봄입니다.");
			else if (month>=6&&month<=8) System.out.printf("여름입니다.");
			else if (month>=9&&month<=11) System.out.printf("가을입니다.");
			else System.out.printf("겨울입니다.");
		}
		
		
		// switch case 문
		// 학점 구하기
		Scanner num_5 = new Scanner(System.in);
		System.out.print("\n학점 입력: ");
		int real_score= num_5.nextInt();
		
		switch (real_score/10) { // real_score/10 즉 나머지 를 버렸기 때문에 90점대 이상이라는 의미를 가짐
			case 10:
			case 9:
				System.out.printf("점수: %d, A학점",real_score);
				break;
			case 8:
				System.out.printf("점수: %d, B학점",real_score);
				break;
			case 7:
				System.out.printf("점수: %d, C학점",real_score);
				break;
			case 6:
				System.out.printf("점수: %d, D학점",real_score);
				break;
			default: // else와 같음
				System.out.print("분발하세요");
				break;
		}
	}
}
