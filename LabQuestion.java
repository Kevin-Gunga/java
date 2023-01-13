import java.util.Scanner;
public class LabQuestion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice ;
	    System.out.println("\nPlease enter your selection:"
	                + "\n1:Get Gum "
	                + "\n2:Get Chocolate"
	                + "\n3:Get Popcorn "
	                + "\n4:Get juice"
	                + "\n5:Display total sold so far"
	                + "\n6:Quit ");
	    
	    do{
	    	 choice = input.nextInt();
	   	    
	      
	    if (choice == 1) {
	        System.out.println("Here is your gum");
	    continue;}
	    if (choice == 2) {
	    	System.out.println("Here is your chocolate");
	    continue;}
	    if (choice == 3) {
	    	 System.out.println("Here is your popcorn");
	    continue;}
	    if (choice == 4) {
	    	 System.out.println("here is your juice");
	    continue;}
	    if (choice == 5) {
	    	System.out.println("3 items of gums sold"
	    			           +"\n 2 items of chocolate sold"
	    			           +"\n 6 items of popcorn sold "
	    			           +"\n 9 items of juice sold");
	    continue;}
	    if (choice == 6) 
	    	break;
	    }while(true);
	
		
	   
		
		
	}
}
