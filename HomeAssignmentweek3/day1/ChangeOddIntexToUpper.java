package HomeAssignmentweek3.day1;

public class ChangeOddIntexToUpper {

	public static void main(String[] args) {
		// Input string
        String test = "changeme";

        // Convert string to character array
        char[] charArray = test.toCharArray();

        // Loop through the character array from end to start
        for (int i = charArray.length - 1; i >= 0; i--) {
            // Check if the index is odd
            if (i % 2 != 0) {
                // Convert character at odd index to uppercase
                charArray[i] = Character.toUpperCase(charArray[i]);
            }
        }

        // Print the modified character array as a string
        System.out.println(new String(charArray));
    }

}
