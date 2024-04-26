package ch09;
class Box12{
	private int ivol;
	public Box12(int w, int h, int d)
	{
		ivol = w*h*d;
	}
	public String get_ivol()
	{
		return "박스의 부피는 " + ivol;
	}
}

class Argument{
	public void change(int i,int j[]) { // int j를 배열의 값으로 받아들임
		i=20;
		j[3]=400;  // j[3] 배열에 400이라는 값을 선언함
	}
	public void display(int i,int j[]) {
		System.out.println("객체 변수 i의 값: "+i);
		System.out.print("배열의 값: ");
		for(int value : j) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
public class ex350 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box12 mybox[] = new Box12[10]; // 10개의 요소를 가진 Box12형의 배열 선언
		for(int i = 0; i< mybox.length; i++)
		{
			mybox[i]=new Box12(i*10,i*20,i*30); // 각 배열의 요소에 값을 입력
		}
		for(Box12 mb : mybox) {
			System.out.println(mb.get_ivol()); // 각 배열의 요소의 값을 각각 출력
		}
		
		Argument d = new Argument();
		int a =10;
		int b[]= {1,2,3,4};
		System.out.println("첫 번째 display() 메소드 호출");
		d.display(a, b);
		d.change(a, b); // change 메소드로 값을 변경시킴
		System.out.println("----------");
		System.out.println("값을 변환한 다음 두 번째 display() 호출");
		d.display(a, b); // 변경된 값을 출력
	}

}
