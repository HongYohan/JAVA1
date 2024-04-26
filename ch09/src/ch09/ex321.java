package ch09;
import java.util.Scanner;
public class ex321 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		Box mybox=new Box();
		int vol = mybox.width * mybox.height * mybox.depth;
		System.out.println("박스의 부피(매개 변수 없음) : "+vol);
		
		Song myFavorite = new Song("Dancing Queen", "ABBA");
		myFavorite.show();
		
		System.out.print("수학, 과학, 영어 점수 입력 : ");
		int m=stdIn.nextInt();
		int s=stdIn.nextInt();
		int e=stdIn.nextInt();
		Grade grade = new Grade(m,s,e);
		System.out.printf("세 과목의 평균 : %.2f\n", grade.average());
	}

}
