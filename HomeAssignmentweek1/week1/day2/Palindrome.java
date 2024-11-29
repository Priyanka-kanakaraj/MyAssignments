package HomeAssignment.week1.day2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        int originalInput = input;
        int output = 0;
        while (input != 0) {
            int lastDigit = input % 10; 
            output = output * 10 + lastDigit;
            input = input / 10;
        }
        if (originalInput == output) 
        {
            System.out.println(originalInput + " is a palindrome.");
        } 
        else {
            System.out.println(originalInput + " is not a palindrome.");
        }
        sc.close();
    }
}
