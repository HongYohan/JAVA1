package ch05;

import java.util.Scanner;

public class ex204 {

	public static void main(String[] args) {
		// 2개의 정수를 입력받아 그 사이 누적의 합
		Scanner stdin = new Scanner(System.in);
		System.out.print("정수 2개를 입력: ");
		int num1=stdin.nextInt();
		int num2=stdin.nextInt();
		if(num1>num2) {
			int sum=0;
			for(int i =num2; i<=num1; i++) 
			{
				sum=sum+i;
				System.out.printf("%d번째 누적의 합: %d\n",i,sum);
			}
		}
		else {
			int sum=0;
			for(int i =num1; i<=num2; i++) 
			{
				sum=sum+i;
				System.out.printf("%d번째 누적의 합: %d\n",i,sum);
			}
		}
		
		// 월 입력 - 계절 출력
		int month=1;
		for(;month!=0;) {
			Scanner month_ = new Scanner(System.in);
			System.out.print("\n현재의 월 입력(종료: 0): ");
			month= month_.nextInt();
			
			if (month==0) System.out.println("프로그램 종료!");
			else {
				if (month<1 || month>12) System.out.printf("잘못된 입력입니다.");
				else if (month>=3&&month<=5) System.out.printf("봄입니다.");
				else if (month>=6&&month<=8) System.out.printf("여름입니다.");
				else if (month>=9&&month<=11) System.out.printf("가을입니다.");
				else System.out.printf("겨울입니다.");
			}
		}
		
		// 숫자만큼 *찍기
		Scanner number = new Scanner(System.in);
		System.out.print("원하는 숫자 입력: ");
		int num= number.nextInt();		
		int i=1,j=1;
		for(i=1;i<=num;i++) {
			for(int k=num-1;k>=j;k--) System.out.print(" ");
			for(j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// 마름모
		Scanner number = new Scanner(System.in);
		System.out.print("원하는 숫자 입력: ");
		int num= number.nextInt();
		int i=1,j=1; // while문 이므로 미리 초기화 1번 한다
		while(i<=num) {
			int k=num-1; // 공백을 먼저 입력하기 위해서 k라는 변수는 num보다 1개 작은 수로 시작한다 왜냐 별 표시가 하나 있기 때문이다
			while(k>=j) { 
				System.out.print(" "); 
				k--;
			}
			j=1;
			while(j<=i) { // *를 표시
				System.out.print("*");
				j++;
			}
			int o=1;
			while(o<i) { // 홀수개의 *를 표시하기 위해서 해당 별표 표시에 -1개씩을 더한다
				System.out.print("*");
				o++;
			}
			System.out.println(); // 줄을 바꾸고 다음 줄의 개수를 실행함
			i++;
		}
		// 다시 초기화 해준다
		i=1;
		j=1;
		int a=1;
		while(num>=i) {
			int k=1;
			while(k<=a) {
				System.out.print(" "); //공백을 입력해 주는데 1개부터 시작한다
				k++;
			}
			j=1;
			while(j<=num-1) { // 순서가 역으로 되지만 마지막꺼하고 1개적게 나타야 하기 때문에 -1을 해준다
				System.out.print("*");
				j++;
			}
			int o=1;
			while(o<num-1) { // 이 위의 별표개보다 한번더 1개더 적게 나타나야 하기 때문에 <로 표기한다
				System.out.print("*");
				o++;
			}
			System.out.println();
			a++; // 공백의 순서를 ++ 해준다
			num--; // 입력한 값이 기준이기 때문에 빼준다
		}

		//for문으로 마름모(Chat GTP)
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
		
	    int mid = (n - 1) / 2; // 다이아몬드의 가운데 줄을 계산합니다.

	    for(int d=0;d<n;d++) { // i는 줄 수
	      for(int e=0;e<Math.abs(mid-d);e++) { // j는 해당 줄에서 출력할 공백의 개수
	        System.out.print(" ");
	      }
	      for(int e=0;e<2*(mid-Math.abs(mid-d))+1;e++) { // j는 해당 줄에서 출력할 별의 개수
	        System.out.print("*");
	      }
	      System.out.println(); // 줄바꿈
	    }
	}
}