import java.util.Scanner;
class PositiveNegativeAndNeutral
{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Number: ");
			double number = sc.nextDouble();

			if(number>=0)
			{
					System.out.print("The number is Positive.");
			}
			else if(number<0)
			{
					System.out.print("The number is Negative.");
			}
			else 
			{
					System.out.print("The number is Zero.");
			}
		}
}