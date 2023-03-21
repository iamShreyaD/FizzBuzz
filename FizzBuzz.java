
/*
 * Shreya B Deshpande
 * This project is done through the course Codecademy 'Learn: Java'
 * FizzBuzz is a challenge demonstrated with the help of creative use
 * of coding knowledge in order to solve the problem.
 * For multiples of both 3 and 5, it prints "Fizz Buzz"
 * For multiples of 3, it prints "Fizz"
 * For multiples of 5, it prints "Buzz"
 */

public class FizzBuzz 
{
	public static void main(String[] args)
	{
		for (int i = 1; i < 100; i++) 
		{
			if (i % 3 == 0 && i % 5 == 0) 
			{
				System.out.println("Fizz Buzz");
			}
			
			else if (i % 5 == 0)
			{
				System.out.println("Buzz");
			}
			
			else if (i % 3 == 0)
			{
				System.out.println("Fizz");
			}
			else
			{
				System.out.println(i);
			}
					
		}
		
	}
}