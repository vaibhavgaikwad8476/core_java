import java.util.Scanner;
class FeetIntoMeter
{
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter The Value For Feet: ");
	double feetValue = sc.nextDouble();
	Double meter = feetValue*0.305;
	System.out.println("feet value is: "+feetValue+ "Feet is Equal to: "+meter+ "Meters.");

}
}
