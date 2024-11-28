package HomeAssignmentweek3.day1;

public class RemoveDuplicateWords {


	public static void main(String[] args) {
		        //Initialize the input string
		        String text = "We learn Java basics as part of java sessions in java week1";
		        System.out.println("User Input:"+text);

		        //  Initialize a count variable
		        int count = 0;

		        // Split the text into an array of words
		        String[] words = text.split(" ");

		       // Outer loop: iterates over each word
		        for (int i = 0; i < words.length; i++) {
		        	 // Inner loop: checks for duplicates
		            for (int j = i + 1; j < words.length; j++) {
		            	// Case-insensitive comparison
		                if (words[i].equalsIgnoreCase(words[j])) {
		                	// Mark duplicate as empty
		                    words[j] = "";
		                    // Increment duplicate count
		                    count++;
		                }
		            }
		        }

		        //  Initialize an empty StringBuilder
		        StringBuilder result = new StringBuilder();
		     // Iterate through each word in the array
		        for (String word : words) {
		        	  // Check if the word is not empty
		            if (!word.isEmpty()) {
		            	// Append the word to the result, followed by a space
		            }
		                result.append(word).append(" ");
		            }

		        // Print the final result
	System.out.println("Output: " + result.toString().trim());
		}
}