package string;

public class Zadatak3 {

	public static void main(String[] args) {
		
        String input = "ict cluster is awesome";
        String inputUpper = "";

        for (int i = 0; i < input.length(); i++) {
        	
        	char currentChar = input.charAt(i);
        	
        	if (currentChar == ' ') {
        		inputUpper += " ";
        	}
        	else {
	            if (Character.isLowerCase(currentChar)) {
	            	
	            	int asciiValue = (int) currentChar - 32;
	                char charValue = (char) (asciiValue);
	
	                inputUpper += charValue;	
	            }
        	}
        }
        System.out.println(inputUpper);
	}
}