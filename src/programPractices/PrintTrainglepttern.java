package programPractices;

public class PrintTrainglepttern {

	public static void main(String[]args) {
		int input = 10;
		
		int rows,columns = 0;
		
		for(rows = 0; rows<input; rows++) {
			
			for(columns = 0; columns<=rows; columns++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}
}
