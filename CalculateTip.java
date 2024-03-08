import java.util.Scanner;
class CalculateTip
{
 public static void main(String[] args) {
 	Scanner sc = new Scanner(System.in);
 	System.out.print("Enter Your Sub Total Bill: ");
 	double subTotal = sc.nextDouble();
 	System.out.print("Enter The Tip Rate: ");
 	double tipRate = sc.nextDouble();

 	double total = subTotal + tipRate*(subTotal/100);
 	System.out.println("Sub Total is: "+subTotal +"And The Tip Rate: "+tipRate+ "So The Total Bill Is: "+total);
 	System.out.println("Thank YOu Visit Again");
 }
}
