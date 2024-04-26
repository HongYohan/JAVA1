package ch07;

import java.util.Scanner;

public class ex270 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlusMinus ob1 = new PlusMinus();
		String splus, sminus;
		splus = ob1.plus(50, 30);
		sminus = ob1.minus(50, 30);
		System.out.println(splus);
		System.out.println(sminus);
		
		Circle ob2= new Circle();
		String ccircle;
		Scanner CIRcle = new Scanner(System.in);
		System.out.print("Circle의 명칭 : ");
		String b = CIRcle.next();
		System.out.print("반지름 : ");
		int a = CIRcle.nextInt();
		ccircle= ob2.bangirm(a, b);
		System.out.println(ccircle);
		
		Rectangle ob3 = new Rectangle();
		String rrectangle;
		Scanner RECtangle = new Scanner(System.in);
		System.out.print(">> ");
		int width = RECtangle.nextInt();
		int height = RECtangle.nextInt();
		rrectangle= ob3.getArea(width,height);
		System.out.println(rrectangle);
	}

}
