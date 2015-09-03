package typecasting;
import java.util.Scanner;
public class Value {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("What do you want x to be?");
		double quad=0;
		double x=0;
        quad = (3*Math.pow(x,2))-(8*x)+4;
	    x = input.nextDouble();
        System.out.println("At X  = "+x+" the value is: " + quad);
	
	
	}

}
