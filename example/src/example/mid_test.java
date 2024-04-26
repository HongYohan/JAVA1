package example;
import java.util.Scanner;
import java.util.Random;
public class mid_test {

	public static void main(String[] args) {
		
		Scanner scores = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int score=scores.nextInt();
		switch(score/10) {
			case 10:
			case 9:
				System.out.println("장학생");
				break;
			case 8:
			case 7:
			case 6:
				System.out.println("통과");
				break;
			default:
				System.out.println("재시험");
				break;
		}
		
		Scanner s_scores = new Scanner(System.in);
		System.out.print("점수를 입력하세요(0~100): ");
		int s_score=s_scores.nextInt();
		Scanner s_grades = new Scanner(System.in);
		System.out.print("학년을 입력하세요(1~4): ");
		int s_grade=s_grades.nextInt();
		
		if(s_grade ==4) {
			if(s_score>=70) System.out.println("합격!");
			else System.out.println("불합격!");
		}
		else {
			if(s_score>=60) System.out.println("합격!");
			else System.out.println("불합격!");
		}
		
		Scanner number = new Scanner(System.in);
		int numbers=0;
		int sum=0, count_num=0;
		for(;numbers>=0;) {
			System.out.print("숫자 입력(minus to quit): ");
			numbers=number.nextInt();
			if(numbers>=0) sum+=numbers;
			else break;
			count_num++;
		}
		System.out.printf("평균 : %.2f",(double)sum/count_num);
		
		
		String course[]= {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
		int numnum[]= {95,88,76,62,55};
		
		while(true) {
			Scanner aa = new Scanner(System.in);
			System.out.print("과목 이름 : ");
			String aaa = aa.next();
			
			if(aaa == "그만") {
				System.out.println("프로그램 종료~");
				break;
			}
			else {
				for(int i=0;i<course.length;i++) {
					if(aaa == course[i]) {
						System.out.printf("%s의 점수는 %d",course[i],numnum[i]);
						continue;
					}
				}
				System.out.println("없는 과목입니다.");
			}
		}
		
//		
//		while(true) {
//			Random r = new Random();
//			int vv= r.nextInt(100);
//			System.out.println("** 수를 결정하였습니다. 맞춰 보세요 **");
//			int vh=1;
//			
//			Scanner cc = new Scanner(System.in);
//			int ccc=cc.nextInt();
//			if(ccc >vv) {
//				System.out.printf("%d회 : ",vh);
//				System.out.printf("%d-%d",,ccc);
//				vh++;
//			}
//			else if(ccc<vv) {
//				System.out.printf("%d회 : ",vh);
//				System.out.printf("%d-%d",ccc,);
//				vh++;
//			}
//			else {
//				System.out.println("맞았습니다.");
//				Scanner dd = new Scanner(System.in);
//				System.out.print("\n다시하시겠습니까(y/n) : ");
//				String ddd=dd.next();
//				if(ddd=="y") {
//					continue;
//				}
//				else {
//					System.out.println("게임 종료!");
//				}
//			}
//		}
	}
}