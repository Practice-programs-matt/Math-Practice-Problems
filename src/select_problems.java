import java.util.Scanner;


public class select_problems 
{
	
	
	public static void select()
	{
		String problem_type;
		String number_of_problems;
		String problem_verb = null;
		int largest_number;
		int terms;	
		
		Scanner scan = new Scanner(System.in);
		do 
		{
			System.out.println("What kind of math would you like to practice today. You can type addition, subtraction, multiplication, or division");
			
			problem_type = scan.next();
			
			if (!problem_type.equalsIgnoreCase("addition") && !problem_type.equalsIgnoreCase("subtraction") && !problem_type.equalsIgnoreCase("division") && !problem_type.equalsIgnoreCase("multiplication"))
			
			{
				System.out.println("Whoops! You may have typed something wrong or " + problem_type + " is not yet supported");
			}
			else 
			{
				System.out.println("Great, we will begin practicing " + problem_type);
				
			}
		}
		while (!problem_type.equalsIgnoreCase("addition") && !problem_type.equalsIgnoreCase("subtraction") && !problem_type.equalsIgnoreCase("division") && !problem_type.equalsIgnoreCase("multiplication"));
		
		
		if (problem_type.equalsIgnoreCase("addition"))
		{
			problem_verb = "add";
		}
		
		if (problem_type.equalsIgnoreCase("division"))
		{
			problem_verb = "divide";
		}
		
		if (problem_type.equalsIgnoreCase("subtraction"))
		{
			problem_verb = "subtract";
		}
		
		if (problem_type.equalsIgnoreCase("multiplication"))
		{
			problem_verb = "multiply";
		}
		
		System.out.println("How many problems do you want to to try?");
		number_of_problems = scan.next();
		
		System.out.println("What are the largest numbers you want to " + problem_verb);
		largest_number = scan.nextInt();
		
		System.out.println("How many terms do you want to multiply? You can choose up to 5.");
		terms = scan.nextInt();
		
		
		
	
	}
	
	
}
