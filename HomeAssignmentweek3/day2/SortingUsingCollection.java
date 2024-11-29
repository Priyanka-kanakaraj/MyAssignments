package HomeAssignmentweek3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		//Declare the string and store the values
    String[] cmpy= {"TCS","CTS","HCL","AspireSystem"};
    System.out.println("Given String:");
    for(int i=0;i<cmpy.length;i++) {
    	System.out.println(cmpy[i]);
    }
    //Add the elements of the array to a list
    List<String> cmpyList = new ArrayList<>();
    Collections.addAll(cmpyList, cmpy);
    //sorting the list
    Collections.sort(cmpyList);
    //Reverse the list
    Collections.reverse(cmpyList);
    //Iterate through the list and print the values
    System.out.println("**************");
    System.out.println("Reverse String:");
    for(int i=cmpyList.size()-1;i>=0;i--) 
    {
    	System.out.println(cmpyList.get(i));
    	
    }
	}

}
