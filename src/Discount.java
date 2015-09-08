import java.util.*;
public class Discount {

	public static void main(String[] args) {
		System.out.println("Enter the amount of purchases");
		Scanner input = new Scanner(System.in);
	    int price;
	    int aprice;
	    price = input.nextInt();
	    if (price > 1000)
	      { int discount; 
	       discount = (price*10)/(price);
	       aprice = (price - discount);
	       System.out.println("Discounted Price : " + aprice);}
	
	    else {System.out.println("The Value is not high enough");}
	
	}

}
