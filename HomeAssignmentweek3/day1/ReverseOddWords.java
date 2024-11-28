package HomeAssignmentweek3.day1;

public class ReverseOddWords {
	public static void main(String[] args) {
        // Input string
        String test = "I am a software tester";

        // Step 1: Split the string into words
        String[] words = test.split(" ");

        // Step 2: Traverse through each word in the array
        for (int i = 0; i < words.length; i++) {
            // Step 3: Reverse the word if it's in an odd position (0-based indexing)
            if (i % 2 == 0) {
                // Convert the word into a character array and reverse it
                char[] wordArray = words[i].toCharArray();
                int left = 0;
                int right = wordArray.length - 1;
                
                // Reverse the characters in the array
                while (left < right) {
                    char temp = wordArray[left];
                    wordArray[left] = wordArray[right];
                    wordArray[right] = temp;
                    left++;
                    right--;
                }

                // Step 4: Convert the reversed character array back
                words[i] = new String(wordArray);
            }
        }

        // Step 5: Join the words back into a single string
        String result = String.join(" ", words);

        // Step 6: Output the result
        System.out.println(result);
    }
}
