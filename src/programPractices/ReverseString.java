package programPractices;

public class ReverseString {

	public static void main(String[]args) {

		//1st Methos
		String string = "Greeks";

		StringBuffer s = new StringBuffer();

		s.append(string);
		System.out.println(s.reverse());



		//2nd Method

		String name = "GreeksofGreeks";

		String reversed ="";

		char[] array = name.toCharArray();

		for(int i = array.length-1; i>=0; i--) {

			reversed = reversed + array[i];
		}

		System.out.println(reversed);

	}


}
