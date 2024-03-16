import java.util.Scanner;
class NumberToMonth
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a month number: ");
		int monthnum = sc.nextInt();
		String month = null;
		switch(monthnum)
		{
			case 1: month = "JAN";break;
			case 2: month = "FEB";break;
			case 3: month = "MAR";break;
			case 4: month = "APR";break;
			case 5: month = "MAY";break;
			case 6: month = "JUN";break;
			case 7: month = "JULY";break;
			case 8: month = "AUG";break;
			case 9: month = "SEP";break;
			case 10: month = "OCT";break;
			case 11: month = "NOV";break;
			case 12: month = "DEC";break;
			default : System.out.println("Invalid input");
		}
		System.out.println((month != null)?(monthnum+ "-" +month): ".");
	}
}