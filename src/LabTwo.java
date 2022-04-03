import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     
		Scanner scnr = new Scanner(System.in);
		String choice = "y";
	     
		do {
			System.out.print("Enter a number between 1 and 100: ");
			int n = scnr.nextInt();
	      
	        if(n % 2 == 0 && n <= 25){
	        System.out.println(n + " is even and less than 25");
	      }	  
	        else if(!(n % 2 ==0) && n >= 60) {
	        
	        System.out.println(n + " is odd and greater than 60");	
	      }
	        else if(n % 2 == 0 && n >= 60) {
	        System.out.println(n + " is even and greater than 60");
	      }	  
	        else if(!(n % 2 ==0) && n <= 25) {
	        System.out.println(n + " is odd and less than 25");
	        }
	       
	        else if (n % 2==0 && !(n <= 25 && n >= 60))
	        {
	        System.out.println(n + " is even");
	        } else {
	     
	       System.out.println(n + " is odd");
		}
	      	
	      	System.out.print("Do you want to continue? (y/n): ");
	      	choice = scnr.next();
	        } while (choice.equalsIgnoreCase("y") && !(choice.equalsIgnoreCase("N")));
	       System.out.println("Goodbye");
	       scnr.close();
	        
	}
	
    }	
	  



	        	

	
	



