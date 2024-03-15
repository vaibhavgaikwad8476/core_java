import java.util.Scanner; 
class VowelsAndConsonents
{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter a Character: ");
			String alpa = sc.next().toLowerCase();

			if(alpa.equals("a"))
			{
					System.out.println("Alpabet is a Vowels");
			}
			else if(alpa.equals("e"))
			{
					System.out.println("Alpabet is a Vowels");
			}
			else if(alpa.equals("i"))
			{
					System.out.println("Alpabet is a Vowels");
			}
			else if(alpa.equals("o"))
			{
					System.out.println("Alpabet is a Vowels");
			}
			else if(alpa.equals("u"))
			{
					System.out.println("Alpabet is a Vowels");
			}
			else 
			{
					System.out.println("Alpabet is consonents");
			}
		}
}