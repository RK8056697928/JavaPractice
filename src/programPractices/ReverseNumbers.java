package programPractices;

import java.util.Scanner;

public class ReverseNumbers {
public static void main(String[]args) {
	int a = 123456;
	int b = 0;
	while(a!=0) {
		
		b = b*10;
		b = b + a%10;
		a = a/10;
		}
	System.out.println(b);
	
	//By using Scanner Class
	
//	int a = 0;
//	int b = 0;
//	
//	System.out.println("Enter your no: ");
//	Scanner scanner = new Scanner(System.in);
//	a = scanner.nextInt();
//	while(a!=0) {
//		b = b*10;
//		b = b+a%10;
//		a = a/10;
//	}
	
}

}
