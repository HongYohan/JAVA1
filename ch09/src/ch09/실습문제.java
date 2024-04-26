package ch09;
import java.util.Scanner;
public class 실습문제 {
	public static void main(String[] args) {
		Mul mul = new Mul();
		Div div = new Div();
		Add add = new Add();
		Sub sub = new Sub();
		
		for(;;) {
			Scanner s = new Scanner(System.in);
			System.out.print("두 정수와 연산자를 입력하세요 >> ");
			int a = s.nextInt();
			int b = s.nextInt();
			String c = s.next();
			try {
				if (c.equals("*")) System.out.println(mul.calculate(a, b));
				else if (c.equals("/")) System.out.println(div.calculate(a, b));
				else if (c.equals("+")) System.out.println(add.calculate(a, b));
				else if (c.equals("-")) System.out.println(sub.calculate(a, b));
				else {
					System.out.println("정확한 값 입력");
					break;
				}
			}catch(ArithmeticException e) {
				System.out.println("0으로 나눌수 없습니다.");
			}
		}
	}
}