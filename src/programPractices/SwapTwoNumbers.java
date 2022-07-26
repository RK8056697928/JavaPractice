package programPractices;

public class SwapTwoNumbers {

	public static void main(String[]args) {
		
		
	//By using third variable
		int a = 100;
		int b = 200;

		System.out.println("Before Swapping");
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		int c= a;
		a = b;
		b = c;
		System.out.println("After swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		}
	
	
	//By using without third variable
	
	public void withOutThirdVariable() {
		
		int a = 100;
		int b = 200;
		
		System.out.println("Before Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After Swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
	
	}	
}