import java.util.Scanner;


public class StringThings {


	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);
		String firstString = scanner.next();
		String secondString = scanner.next();


		// 1. Print the total length of the strings.
		
			System.out.println(firstString.length());
			System.out.println(secondString.length());
		
		// 2. Is firstString lexicographically larger than than secondString? Print "Yes" or "No". Hint: check out the compareTo() method in the String class.
		if (firstString.compareTo(secondString)>0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		// 3. Capitalize both strings and print them on a single line separated by a space.
		//String a = firstString.toUpperCase();
		//String b = secondString.toUpperCase();
		
		char a1 = firstString.charAt(0);
		String a = Character.toUpperCase(a1) + firstString.substring(1).toLowerCase();
		
		char b1 = secondString.charAt(0);
		String b = Character.toUpperCase(a1) + secondString.substring(1).toLowerCase();
		
		
		System.out.println(a + " " + b);
		
	}
}



//Copyright ©TheTrueTechies
