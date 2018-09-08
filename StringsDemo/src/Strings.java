import java.util.Locale;
import java.util.StringTokenizer;

public class Strings {

	public static void main(String[] args) {
		
		String str1 = "ABC";
		String str2 = "ABCD";
		String str3 = "ABCD";
		String str4 = new String("ABCD");
		str1 = str1 + "D";
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str3 == str2);
		System.out.println(str3 == str4);
		
		char ch = str1.charAt(1);
		System.out.println(ch);
		
		//compares two strings
		System.out.println("ABC".compareTo("XYZ"));
		System.out.println("abc".compareToIgnoreCase("ABC"));
		
		System.out.println("ABC".concat("D"));
		
		System.out.println("ABCD".contains("ABC"));
		System.out.println("ABCD".endsWith("D"));
		System.out.println("ABCD".startsWith("A"));
		System.out.println("TRUE".equalsIgnoreCase("true"));
		System.out.println("TRUE".equals("true"));
		
		System.out.println("--------------------------");
		byte[] bytes = "ABCD!@#$%^&*".getBytes();
		for (int index = 0; index < bytes.length; index++) {
			System.out.println(bytes[index]);
		}
		
		System.out.println("--------------------------");
		
		char[] chars = "AWEDFGHJHGFD!@#$%^&*".toCharArray();
		
		for (int index = 0; index < chars.length; index++) {
			System.out.println(chars[index]);
		}
		
		
		System.out.println("--------------------------");
		
		System.out.println("ABBBBBBCD".indexOf("B"));
		System.out.println("ABBBBBBCD".lastIndexOf("B"));
		
		
		if ("email123454@domain.ca".matches("^[a-zA-Z0-9]+@[a-z0-9]+.(com|ca)$")) {
			System.out.println("Valid email.");
		} else {
			System.out.println("Invalid email.");
		}
		
		System.out.println("ABCD".regionMatches(1, "BC", 0, 2));
		System.out.println("ABCDAAAADDDFFF".replace('A', 'Z'));
		
		System.out.println("--------------------------");
		String row1 = "firstName,lastName,18,M";
		String[] columnValues = row1.split(",");
		for (int index = 0; index < columnValues.length; index++) {
			System.out.println(columnValues[index]);
		}
		
		System.out.println("--------------------------");
		StringTokenizer stringTokenizer = new StringTokenizer(row1, ",");
		while(stringTokenizer.hasMoreTokens()) {
			System.out.println(stringTokenizer.nextToken());
		}
		
		System.out.println("--------------------------");
		System.out.println("ABCDEFG".subSequence(1, 4));
		
		System.out.println("--------------------------");
		System.out.println("ABCDEFG".substring(1));
		System.out.println("ABCDEFG".substring(1, 4));
		
		System.out.println("--------------------------");
		System.out.println("ABCDEFG".toLowerCase());
		System.out.println("Bonjour".toLowerCase(Locale.CANADA_FRENCH));
		System.out.println("Bonjour".toUpperCase());
		
		
		String email = "         email123@domain.com       ";
		System.out.println(email.trim());
		
		System.out.println(String.valueOf(10.5));

	}

}

















