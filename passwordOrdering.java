import java.util.*;
public class passwordOrdering {
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		String k = s.next();
		StringBuilder number = new StringBuilder();
		StringBuilder lowletter = new StringBuilder();
		StringBuilder upletter = new StringBuilder();
		for(char ch : k.toCharArray()) {
			if(Character.isDigit(ch)) {
				number.append(ch);
			}
			if(Character.isUpperCase(ch)) {
				upletter.append(ch);
			}
			if(Character.isLowerCase(ch)) {
				lowletter.append(ch);
			}
		}
		System.out.println(number.toString()+  lowletter.toString() + upletter.toString());
	}

}
