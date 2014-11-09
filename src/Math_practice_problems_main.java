import java.util.*;

public class Math_practice_problems_main {

	public static void main(String args[])
	{
		char addition= 0;
		char subtraction = 0;
		System.out.println("What kind of math would you like to practice today. You can type addition, subtraction, multiplication, or division");
		Scanner scan = new Scanner(System.in);
		String problem_type = scan.next();
		
		if (problem_type.equalsIgnoreCase("addition") || problem_type.equalsIgnoreCase("subtraction") ||problem_type.equalsIgnoreCase("division") || problem_type.equalsIgnoreCase("multiplication"))
		{
			System.out.println("Great, let's beigin practicing " + problem_type + "!" );
		}
		else 
		{
			System.out.println("Whoops! Please try again, you may have type something wrong or " + "'" + problem_type + "' " + "is not yet supported.");
		}
	}
	
}
