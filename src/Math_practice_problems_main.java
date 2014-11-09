import java.util.*;

public class Math_practice_problems_main {

	public static void main(String args[])
	{

		String problem_type;
		do 
		{
			System.out.println("What kind of math would you like to practice today. You can type addition, subtraction, multiplication, or division");
			Scanner scan = new Scanner(System.in);
			problem_type = scan.next();
			
			if (!problem_type.equalsIgnoreCase("addition") || !problem_type.equalsIgnoreCase("subtraction") ||!problem_type.equalsIgnoreCase("division") || !problem_type.equalsIgnoreCase("multiplication"))
			{
				System.out.println("Whoops! You may have typed something wrong or " + problem_type + " is not yet supported");
			}
			else 
			{
				System.out.println("Great, we will begin practicing " + problem_type);
			}
		}
		while (!problem_type.equalsIgnoreCase("addition") || !problem_type.equalsIgnoreCase("subtraction") ||!problem_type.equalsIgnoreCase("division") || !problem_type.equalsIgnoreCase("multiplication"));
		
		
	
	}
	
}
