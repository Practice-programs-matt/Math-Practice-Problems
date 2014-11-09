import java.util.Scanner;
import java.util.*;


public class select_problems 
{
	
	
	public static void select()
	{
		String problem_type;
		String problem_verb = null;
		
		int number_of_problems;
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
			
			addition();
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
		
		
	}	

	
	
	public static void addition()
	{
		
		String problem_verb = "add";
		int i =0;  //first lcv
		int k=0;// second lcv
		int m=0; //to do math check
		int a=1;
		
		Scanner scan2 = new Scanner(System.in);
		
		System.out.println("How many problems do you want to to try?");
		int number_of_problems = scan2.nextInt();
		
		System.out.println("What are the largest numbers you want to " + problem_verb);
		int largest_number = scan2.nextInt();
		
		System.out.println("How many terms do you want to multiply? You can choose up to 5");
		int terms = scan2.nextInt();
		
		System.out.print("What does ");	
		
		while (i<number_of_problems)
		{
		Random rand2 = new Random();
			
			
			while (k<terms)
			{
				if (a==terms)
				{
					System.out.print(" =");
					
				}
				else
				{
					System.out.print((rand2.nextInt(largest_number)));	
				}
					
				k++;
			}
		k=0;
		
		int answer =scan2.nextInt();
		
		i++;
		}
	}
}
		
	
	



