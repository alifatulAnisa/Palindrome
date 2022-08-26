import java.util.*;  
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Palindrome {

	public static void main(String[] args) {
		
		String InputString;
		String TrashSymbolString="";
		String reverse = "";
		boolean pal = true;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a string:");  
		InputString = scan.next();
		
		Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(InputString);
        boolean sc = matcher.find();
        
        if(sc) {
            TrashSymbolString = InputString.replaceAll("[a-zA-Z0-9^]", "");
            System.out.println("Trash Symbol String: " + TrashSymbolString);
            TrashSymbolString = InputString.replaceAll("[^a-zA-Z0-9]", "");
        }else {
        	TrashSymbolString = InputString.replaceAll("[^a-zA-Z0-9]", "");
        }
        
        for(int i = TrashSymbolString.length()-1; i >= 0; i--) {
			reverse += TrashSymbolString.charAt(i);
		}
		
		for(int i = 0; i < TrashSymbolString.length(); i++) {
			if(TrashSymbolString.charAt(i) != reverse.charAt(i)) {
				pal = false;
			}
		}
		
        if(pal) {
        	System.out.println(InputString);
			System.out.println("Palindrome");
		}else {
			System.out.println(InputString);
			System.out.println("Not Palindrome");
		}
		
	}

}
