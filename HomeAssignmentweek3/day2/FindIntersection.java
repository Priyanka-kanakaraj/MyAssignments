package HomeAssignmentweek3.day2;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		// Declare the first array
        int[] num1 = {3, 2, 11, 4, 6, 7};
        // Declare the second array
        int[] num2 = {1, 2, 8, 4, 9, 7};

        // Convert the arrays to lists
        List<Integer> list = new ArrayList<>();
        List<Integer> list1= new ArrayList<>();

        // Add elements of the first array
        for (int i = 0; i < num1.length; i++) {
            list.add(num1[i]);
        }

        // Add elements of the second array 
        for (int i = 0; i < num2.length; i++) {
            list1.add(num2[i]);
        }

//print the heading
        System.out.println("Intersection number");
        //outer loop to check the list with num1
        for (int i = 0; i < list.size(); i++) {
            //inner loop to check the list1 with num2
            for (int j = 0; j < list1.size(); j++) {
            	//condition to check the common numbers
                if (list.get(i) == list1.get(j)) {
                    System.out.println(list1.get(i));
                    break; // to avoid duplicates
                }
            }
        }

	}
}
