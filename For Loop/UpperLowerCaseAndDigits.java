class UpperLowerCaseAndDigits
{
		public static void main(String[] args) {
			System.out.println("Upper Case A to Z: ");
				for(char ch = 'A';ch<='Z';ch++)
				{
						System.out.print(ch+ "  ");
				}
				System.out.println("***************************************************");
				System.out.println("Lower Case a to z: ");
				for(char ch = 'a';ch<='z';ch++)
				{
						System.out.print(ch+ "  ");
				}
				System.out.println("*******************************************************");
				System.out.println("Assending Order Digit 0 To 9: ");
				for(int i = 0;i<=9;i++)
					System.out.print(i+ "  ");
				System.out.println("******************************************************************");
				System.out.println("Decendeing Order Digit 9 To 0: ");
				for(int i = 9;i>=0;i--)
				{
						System.out.print(i+ "  ");
				}
		}
}