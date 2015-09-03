package typecasting;

public class payroll {

	public static void main(String[] args) {
	long hoursWorked= 10  ;
	double payRate = 10 ;  double taxRate = 10 ;
	System.out.println("Hours Worked : " + hoursWorked );
	System.out.println("pay Amount : " + (hoursWorked * payRate) );
    System.out.println("tax Amount : " + (hoursWorked * payRate * taxRate) ) ;
	}

}
// syntax error when all variables are not declared 
//Exception error when there isn't a value assigned