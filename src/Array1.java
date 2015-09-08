public class Array1 {

	public static void main(String[] args) {
		int[] val = {0 , 1 , 2 , 3} ;
        int sum;
		sum = 0;
		int var;
		for ( var = 0 ; var < val.length;var++) //As long as the length (or in this case values) of var is less than Val keep going , go by one. 
			{sum+=val[var];} // adds previous number from val into sum.
        System.out.println("Sum of all numbers = " + sum );
	}

}
//Why doesn't the length method stop short like when saying to print <10 ? >

