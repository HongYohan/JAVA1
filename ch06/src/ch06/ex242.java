package ch06;
import java.util.Scanner;
public class ex242 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String course[]= {"Java","C++","HTML5","DataStructure","Android"};
		int score[]= {95,88,76,62,85};
		while(true) {
			Scanner courses = new Scanner(System.in);
			System.out.print("과목 이름 : ");
			String a=courses.next();
			int cnt=0;
			if(a.equals("그만")) {
				System.out.println("감사합니다.");
				break;
			}
			
			for(int i =0;i<score.length;i++) {
				if(course[i].equals(a)) {
					System.out.printf("%s 점수는 %d\n",a,score[i]);
					cnt++;
				}
			}
			if(cnt==0) {
				System.out.println("없는 과목입니다.");
			}
		}
		
		int inum[]= {8,7,3,6,9,8,7,0,4,1,2};
		Scanner inums= new Scanner(System.in);
		System.out.print("찾고 싶은 숫자 입력 : ");
		int key=inums.nextInt();
		int cnt=0;
		
		for(int i =0;i<inum.length;i++) {
			if(key==inum[i]) {
				System.out.printf("%d 번째 데이터와 일치\n",i+1);
				cnt++;
			}
		}
		System.out.printf("%d 값은 배열에 %d개 있습니다.\n",key,cnt);
		
	}

}
