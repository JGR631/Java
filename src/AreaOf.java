import java.util.*;
public class AreaOf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What is the radius?");
		double Area;
		int radius;  
		radius = input.nextInt();
		Area = Math.PI * radius * Math.exp(2);
		System.out.println("The area is : "+ Area);
				
				

	}

}
