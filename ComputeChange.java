import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ComputeChange{
	public static void main(String[] arg) {
		 int sum =0;
		 int totalCost =0;
		 int itemNumber ;
		 String desc="";
		 int quant =0;
		 int unitCost = 0;
		 int i,a=0,b=0,c=0,d=0;
		 
		 //welcome comment
		 System.out.println("-------------------------------");
		 System.out.println("-------------------------------");
		 System.out.println("Welcome to Musa buddy shop - Kisii");
		 System.out.println("-------------------------------");
		 System.out.println("-------------------------------");
		 System.out.println("");
		 
		 //Quantity of items
		 System.out.println("Please enter the number of items bought by customer: " );
		 Scanner item = new Scanner(System.in); 
		 itemNumber  =  item.nextInt();
		 
		 //Arrays of:description,quantity,unit cost of items & total cost
		 int cost[] = new int[itemNumber];
		 String description[] =new String[itemNumber];
		 int quantity[] = new int[itemNumber];
		 int unitCostItem[] = new int[itemNumber];
		  
		 //loop for:description,quantity,unit cost of items,item numbers & total cost
		 int counter = 1;
		 for(i = 0;i< itemNumber;i++) {
		 System.out.println("***********Item " + counter+ " ********** ");
		  
		 System.out.println("Enter description of Item " + counter +":");
		 Scanner descriptions = new Scanner(System.in);
		   desc  = descriptions.next();
		   description[b] =desc;
		   
		 System.out.println("Enter Quantity of Item " + counter +":");
		 Scanner quantities = new Scanner(System.in);
		 quant =  quantities.nextInt();
		 quantity[c] =quant;
		 
		 System.out.println("Enter unit cost of item " + counter+":");
		 Scanner unitCosts = new Scanner(System.in);
		 unitCost =  unitCosts.nextInt();
		 unitCostItem[d] =unitCost;
		 
		 totalCost = quant * unitCost;
		 cost[a] = totalCost;
		 
		 
		 description[counter-1] = description[b++];
		 quantity[counter -1] =quantity[c++];
		 unitCostItem[counter -1] =unitCostItem[d++];
		 cost[counter -1]=cost[a++];
		 counter++;
		 }
		 
		 System.out.println("**********************************************");
		 System.out.println("");
		 System.out.println("-------------------------------");
		 System.out.println("Summary of items bought");
		 System.out.println("-------------------------------");
		 System.out.println("Quantity Description UnitCost SubTotal");
		 System.out.println("-------------------------------");
		 
				 
		 //loop for:item quantity & item name & unit cost & total cost
		 int Arrays =0;
		 while(Arrays<itemNumber) {
			 System.out.println(quantity[Arrays] + " " +description[Arrays] +
			 " " +unitCostItem[Arrays] + " " + cost[Arrays] + "\n");
			 Arrays++;
		 }
		 
		 System.out.println("-------------------------------");
		 
		 //total cost of items
		 for(int j=0;j<cost.length;j++) {
			 sum=sum+cost[j];
		 }
		 
		 //display total cost of items
		 System.out.println("The total cost of items is :" + sum);
	
		 //enter amount tendered by customer
		 System.out.println("Please enter the amount tendered by customer: ");
		 Scanner tendered = new Scanner (System.in);
		 int TenderedByCustomer =  tendered.nextInt();
		 
		 //display change due to customer
		 int Balance = TenderedByCustomer - sum;
		 System.out.println("The change due to customer is : " + Balance);
		 
		 //printing customer receipt
		 System.out.println("Printing Customer receipt!!!!!!!");
		 System.out.println("-------------------------------");
		 System.out.println("-------------------------------");
		 
		 System.out.println("---------Musa buddy shop - Kisii----------");
		 System.out.println("-------------------------------");
		 System.out.println("-------------------------------");
		 System.out.println("");
		 
		 //local Date and Time
		 LocalDateTime myDateTime =LocalDateTime.now();
		 DateTimeFormatter myFormatTime =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		 String formattedDate = myDateTime.format(myFormatTime);
		 System.out.println("Date & Time:" +formattedDate);
			 
		 System.out.println("Quantity Description UnitCost SubTotal");
		 
		 System.out.println("-----------------------------------");
		 
		//loop for:item quantity & item name & unit cost & total cost
		 int Array =0;
		 while(Arrays<itemNumber) {
			 System.out.println(quantity[Array] + " " +description[Array] +
			 " " +unitCostItem[Array] + " " + cost[Array] + "\n");
			 Array++;
		 }
		 
		 System.out.println("-----------------------------------");
		 System.out.println("Total cost of goods " + sum + " +");
		 System.out.println("Balance to customer " + Balance + " -");
		 System.out.println("Amount tendered by customer " + TenderedByCustomer);
		 System.out.println("-----------------------------------");
		 
		 //Thank you comment
		System.out.println("Thank you ! Come again");
		 System.out.println("Goods once sold are not returnable");
					
		}
	
}
