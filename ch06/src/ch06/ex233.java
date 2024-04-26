package ch06;

import java.util.Random;
import java.util.Scanner;

public class ex233 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner num = new Scanner(System.in);
		System.out.print("배열의 크기 입력: ");
		int x = num.nextInt();
		int dnum[]=new int[x]; // 배열의 크기 설정
		Scanner stdin = new Scanner(System.in);
		int i;
		int sum=0;
		double avg;
		System.out.println("dnum 배열의 길이 : " + dnum.length);
		System.out.print("초기화 하지 않은 dnum[]의 값: ");
		for(i=0;i<dnum.length;i++) System.out.print(dnum[i]+" ");
		System.out.println();
		for (i=0;i<dnum.length;i++) {
			try {
				System.out.print("dnum["+i+"] 번째 데이터 입력 : ");
				dnum[i] = Integer.parseInt(stdin.nextLine()); //int.Parse와 같음
				
				if(dnum[i]<0||dnum[i]>100) {
					System.out.println("점수가 올바르지 않습니다.");
					i--;
					continue;
				}
				sum+=dnum[i];
			} catch(NumberFormatException e) { // 예외처리
				System.out.println("잘못된 입력입니다.");
				i--;
			}
		}
		int min=dnum[0];
		for(int j : dnum) {
			if(j<min) min=j;
		}
		
		System.out.printf("배열의 최소값 : %d\n",min);
		System.out.println("배열의 합은 "+ sum + "입니다");
		avg=(double)sum/dnum.length;
		System.out.println("배열 값의 평균은 "+avg+"입니다");

		
		Random r= new Random();
		Scanner snum= new Scanner(System.in);
		System.out.print("생성하고 싶은 개수: ");
		int snunnm=snum.nextInt();
		
		int inunm[] = new int[snunnm];
		for(int i=0;i<inunm.length;i++)inunm[i]=r.nextInt(1,101);
		
		System.out.print("생성된 값: ");
		for(int i=0;i<inunm.length;i++) System.out.printf("%3d",inunm[i]);
		
		Scanner stdIn= new Scanner(System.in);
		System.out.print("\n찾고 싶은 수 입력: ");
		int number=stdIn.nextInt();
		
		
		int cnt=0;
		for(int i=0;i<inunm.length;i++) {
			if(number==inunm[i]) {
				System.out.printf("%d번째 데이터와 일치!\n",i+1);
				cnt++;
			}
		}
		
		if(cnt==0) System.out.printf("%d값은 배열에 없습니다.",number);
		else System.out.printf("%d값은 배열에 %d개 있습니다.",number,cnt);
		
		String slist[]= {"서울","대구","대전","광주","인천","부산","제주"};
		System.out.print("원래의 배열: ");
		for(String s : slist) System.out.print(s+" ");
		System.out.println();
		
		for(int i=0;i<slist.length/2;i++) 
		{
			String temp = slist[i];
			slist[i] = slist[slist.length-i-1];
			slist[slist.length -i -1]=temp;
		}
		System.out.print("역순으로 재배치된 배열: ");
		for(String s : slist) System.out.print(s+" ");
	}
}
