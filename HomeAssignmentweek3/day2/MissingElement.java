package HomeAssignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// Add the elements to the list
		 List<Integer> elements = new ArrayList<>();
	        Collections.addAll(elements, 1, 2, 3, 4, 10, 6, 8);
	        System.out.println("Given Elements:"+elements);
	        //Sort the array
	        Collections.sort(elements);

	        // Step 3: Check for missing numbers
	        System.out.print("Missing numbers:");
	        for (int i = 0; i < elements.size() - 1; i++) {
	            int current = elements.get(i);
	            int next = elements.get(i + 1);

	            // Step 4: Print numbers the missing numbers
	            for (int j = current + 1; j < next; j++) {
	                System.out.print((j)+" ");
	            }
	        }

	}

}
