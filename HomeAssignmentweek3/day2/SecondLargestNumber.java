package HomeAssignmentweek3.day2;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare and initialize the array
        Integer[] number = {3, 2, 11, 4, 6, 7};

        // Convert the array to a list
        List<Integer> list = Arrays.asList(number);

        // Sort the list in ascending order
        Collections.sort(list);

        // Pick the second-to-last element (second largest)
        int secondLargest = list.get(list.size() - 2);

        // Print the result
        System.out.println("The second largest number is: " + secondLargest);
        
    }
}
