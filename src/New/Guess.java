package New;
import java.util.Random; 
import java.util.Scanner;
public class Guess {

	public static void main(String[] args) {
		
		Random rand = new Random ();
		int numberToGuess = rand.nextInt(10)+1;
		System.out.println(numberToGuess);
		int numberofTries = 0;
		Scanner input = new Scanner(System.in);
		int guess;
		
	    boolean Win = false;
	  
	    	
		   //System.out.println("Can you guess the number im thinking? (1-10)");
	          
	        //  numberofTries++;
	    for(numberofTries = 0 ; numberofTries<2; numberofTries = numberofTries+1)
	    	  {System.out.println("Can you guess the number im thinking? (1-10)");
	    	  guess = input.nextInt();
	          if (guess == numberToGuess){Win = true;break;}
	          else if (guess < numberToGuess){System.out.println("Sorry thats too low"); }
	          else if (guess > numberToGuess){System.out.println("Sorry thats too high"); }
	          
	  

	    
	            
	           }
	    if (Win == true){
	          System.out.println("Are You A Mind Reader Of Some Sort?");
	          System.out.println("The number I was thinking : " + numberToGuess);
	          System.out.println("It took you " + numberofTries +  "Tries");
	          }
	}
	}

