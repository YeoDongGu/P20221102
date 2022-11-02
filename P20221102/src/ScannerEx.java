import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력해주세요.>");
//		String input = sc.nextLine();
//		String input = sc.next();
//		int input = sc.nextInt();
//		double input = sc.nextDouble();
		char input = sc.next().charAt(0);
		sc.close();
		
		System.out.println("입력내용 :"+input);
	}



}
