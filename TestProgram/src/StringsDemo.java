import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringsDemo {
	
	
	public static  void printString(String str) {
		for(int i = 0; i <= str.length()-1; i++) {
			System.out.print(str.charAt(i) + "  ");
		}	
	}
	//schaahcs
 //  i
//           schaahcs       c	   2
	
	public static boolean isPalindrome(String str) {
		String reversed ="";
		for(int i = str.length() -1; i >= 0; i--) {
			reversed += str.charAt(i);
		}
		if(reversed.equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		
//		String str1 = new String("Learning");
//		System.out.println(str1);
//		System.out.println(str1.concat("Java"));
//		str1 = str1.concat("Language");
//		System.out.println(str1);
		
		String s1 = new String("Spring");
		s1.concat("Fall");
		String s2 = s1.concat("Winter");
		s2.concat("Summer");
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1.charAt(2));
		String str = " ";
		System.out.println(str.isEmpty());
		System.out.println(str.isBlank());
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		s1.isBlank();
		s1= s1.replace('i', 'a');
		System.out.println(s1);
		String str3 = "Learning Java";
		System.out.println(str3.substring(4));
		System.out.println(str3);
		System.out.println(str3.substring(1, 5));
		System.out.println(str3.indexOf('g'));
		System.out.println(str3.lastIndexOf('a'));
		System.out.println(str3.toUpperCase());
		System.out.println(str3.toLowerCase());
		String str4 = "  asd   asd  ";
		System.out.println(str4.trim());
		
		String string= "learning java language";
		String [] result = string.split(" "); //["learning", "java", "language"]
		
		
		for(String element : result) {
			System.out.println(element);
		}
		
		printString(str3);
		String str5 = "Learning C++";
		System.out.println();
		printString(str5);
		
		System.out.println(isPalindrome("schaahcs"));
		
		
		
		

	}

}
