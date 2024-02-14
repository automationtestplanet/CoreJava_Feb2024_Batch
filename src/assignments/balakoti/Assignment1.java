package assignments.balakoti;

import java.util.LinkedHashSet;

public class Assignment1 {
	// Method to remove duplicate characters in a string
	    public String removeDuplicateCharacters(String inputString) {
	        // Create a LinkedHashSet to maintain order and remove duplicates
	        LinkedHashSet<Character> set = new LinkedHashSet<>();

	        // Add characters from inputString to the set
	        for (int i = 0; i < inputString.length(); i++) {
	            set.add(inputString.charAt(i));
	        }

	        // Construct the result string from the set
	        StringBuilder result = new StringBuilder();
	        for (Character c : set) {
	            result.append(c);
	        }

	        return result.toString();
	    }

	    public static void main(String[] args) {
	        Assignment1 assignment = new Assignment1();

	        // Example usage
	        String inputString = "hello";
	        String result = assignment.removeDuplicateCharacters(inputString);
	        System.out.println("Input: " + inputString);
	        System.out.println("Output: " + result);
	

	}

}
