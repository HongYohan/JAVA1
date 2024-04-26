package ch06;

import java.util.Arrays;

public class ex254 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		Arrays.fill(a,1); // a라는 배열의 모든 값을 1로 채움
		Arrays.fill(a,1,5,10); // 배열 1부터 4까지 10으로 채움
		System.out.println(Arrays.toString(a));
		
		int[] b= {3,7,1,0,8,9};
		Arrays.sort(b); // b배열을 오름차순으로 정렬
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.binarySearch(b,7)); // b배열에 7이라는 값의 인덱스 번호를 가져옴
		
		int[] c = {1,2,3};
		int[] d = {1,2,3};
		int[] e = {4,5,6};
		System.out.println(Arrays.equals(c,d)); // 각 배열의 값이 일치하면 true
		System.out.println(Arrays.equals(c,e)); // 각 배열의 값이 일치하지 않다면 false
		
		int[] f = new int[3];
		System.arraycopy(d, 0, e, 0, 3); // d의 값 0번지부터의 값을 e의 0번지 부터 3개를 덮어씌운다
		System.out.println(Arrays.toString(e));
		System.arraycopy(e, 0, f, 0, 3); // e의 0번지 값부터 f의 0번지 값 부터 3개를 덮어씌운다
		System.out.println(Arrays.toString(f));
	}
}
