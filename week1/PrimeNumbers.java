package HomeAssignment.week1;

import java.util.Scanner;

public class PrimeNumbers {  
    public static void main(String[] args) {
    	int num,i,count=0;
    	System.out.println("Enter the Number:");
    	Scanner sc= new Scanner(System.in);
    	num= sc.nextInt();
    	if(num==0||num==1)
    	{
    		System.out.println(num+ " is not a prime Number");
    }
    	{
    	for (i=1;i<=num;i++)
    		{
    			if(num%i==0)
    			{
    				count++;
    			}
    		}
    	if(count ==2)
    	{
    		System.out.println(num+" is a prime Number");
    	}
    		else
    		{
    			System.out.println(num+ " is not a prime Number");
    		
    	}
    }
    	}
    	
}


