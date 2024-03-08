import java.util.Scanner;
class PoundsIntoKilogram
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter A Number In Pounds: ");
	double poundsValue = sc.nextDouble();
	double kiloGram = poundsValue*0.454;
	System.out.println("Number in Pounds "+poundsValue+ "pounds"+kiloGram+ "Kilogeam.");
}
}