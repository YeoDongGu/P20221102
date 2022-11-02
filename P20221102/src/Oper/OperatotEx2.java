package Oper;

public class OperatotEx2 {

	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		
		int iz = x * y;
		long lz1 = (long)x * (long)y; // 연산 우선순위가 (long)가 더높으므로 long타입으로 변환후 연산
		long lz2 = (long) (x*y); // 괄호안 계산이 연산우선순위가 높으므로 이미 int 끼리 곱해서 값이 깨진상태
		
		System.out.println(iz);
		System.out.println(lz1);
		System.out.println(lz2);
	}

}
