import java.util.*;
public class Cents {

	public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int cents;
    int dollars = 0;
    int input1 = 0 ; //Input1 exits because duplicates
    System.out.println("Input the cents");
    cents = input.nextInt();
    
    input1 = dollars + cents; 
    
    dollars = input1 /100; //First divides the input by 100 because 100 cents make up a doll
	cents= input1 % 100;
	System.out.println("This is " + dollars + " dollars and " + cents + " cents " );
	
	
	
	}

}
