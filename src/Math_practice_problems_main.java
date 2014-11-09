import java.util.*;

public class Math_practice_problems_main {

	public static void main(String args[])
	{
		char addition= 0;
		char subtraction = 0;
		System.out.println("What kind of math would you like to practice today. You can type addition, subtraction, multiplication, or division");
		Scanner scan = new Scanner(System.in);
		String problem_type = scan.next();
		
		if (problem_type = "addition")
		{
			
			
			// this is a test
		}
		
		if (problem_type != "addition" || "subtraction" || "multiplication" || "division")
		{
			System.out.println("Whoops! Please try again, you may have type something wrong or " + problem_type +" is not yet supported.");
		}
	}
	
}
