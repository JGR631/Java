import java.util.*;
public class Order {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		   int bolt , nuts , washers,amount, amount1, amount2;//amount of each
		    int bolt1,nuts1,washers1,price;//actual price values
		    int bolt2 , nuts2, washers2;//Combination of both variables 
		    bolt1 = 5;
		    nuts1 = 3;
		    washers1 = 1; 
		    
		    // multiply the 1 variable * the no number variable and assign to the 2nd number var 
		  System.out.println("Hi!");
	      System.out.println("How many bolts?");
	      amount = input.nextInt();
	      bolt = amount;
	      bolt2 = (bolt * bolt1);
	      System.out.println("How many nuts?");
	      amount1 = input.nextInt();
	      nuts = amount1;
	      nuts2 = (nuts * nuts1);
	      System.out.println("How many Washers?");
	      amount2 = input.nextInt();
	      washers = amount2;
	      washers2 = (washers * washers1);
	      
	      price = (bolt2 + nuts2 + washers2);
	      
	      if ((bolt == nuts ) && (2*bolt >= washers))
	      {System.out.println("Order is A OK ! Here is your order Bolts: " + bolt +  " nuts : " + nuts + " Washers : " + washers + " Total Cost : " + price  );}
	      else if (2*bolt < washers)
	      {System.out.println("Check the order : too few washers");}
	      else if (bolt != nuts)
	      {System.out.println("Check the order : too few nuts or bolts");}
	}

}
