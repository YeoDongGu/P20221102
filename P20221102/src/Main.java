import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
//		
//		System.out.print(n1 + " ");
//		System.out.println(n2);
//		
		n1 = n1 +100;
		n2 = n2 % 10;
//		
//		System.out.printf("%d %d \n",n1,n2);
//		
		System.out.println(n1 + " " + n2);
	}

}
