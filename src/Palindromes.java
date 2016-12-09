import java.util.ArrayList;

public class Palindromes {

	public boolean isPalindrome(String string) {
//		String a = string.toLowerCase();
//		a = a.replaceAll("[ ,\\.!]", "");
//				
//				
//		for (int i = 0; i < a.length(); i++) {
//			if(a.charAt(i)!=a.charAt(a.length()-i-1)) {
//				
//				return false; 
//			}
//		}
//		return true;
		String a = string.toLowerCase();
	a = a.replaceAll("[ ,\\.!]", "");
		StringBuffer buffer = new StringBuffer(a);
		buffer.reverse();
		
		return a.equals(buffer.toString());
		
	
		}

	public Object reverseMe(String string) {
//		String a = ""; 
//		
//for (int i = 0; i < string.length(); i++) {
//	a = string.charAt(i) + a; 
//}
//System.out.println(a);
//		return a;
//	}

		

StringBuffer howtodothiseasier = new StringBuffer(string);
		 howtodothiseasier.reverse();
		 return howtodothiseasier.toString(); 

	}
	}
