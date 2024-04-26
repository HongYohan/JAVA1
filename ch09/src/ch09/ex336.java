package ch09;

class Box9 {
	private int width;
	private int height;
	private int depth;
	private int vol;
	public Box9(int width, int height, int depth) {
		this.width=width;
		this.height=height;
		this.depth=depth;
		volume(); // 생성자 volume 메서드 호출
	}
	private void volume() {
		vol = width*height*depth; // 결과값을 vol에다가 저장
	}
	public int getvolume() {
		return vol; // vol을 출력하기 위해 값을 리턴함
	}
}

public class ex336 {
	// String[] args 는 시작과 동시에 값을 지정하는 변수이다
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]); // 문자열로 입력받는것을 정수형으로 바꾼겂
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		Box9 mybox1 = new Box9(a,b,c);
		System.out.println("정수 박스의 부피 : "+mybox1.getvolume());

	}

}
