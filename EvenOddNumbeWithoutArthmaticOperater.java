import java.util.Scanner;
class EvenOddNumbeWithoutArthmaticOperater
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(Systen.in);
  	System.out.print("Enter A Number: ");
  	int num = sc.nextInt();
  	// int num = 77;
  	System.out.println(((num/2.0)==(num/2))?"even":"odd");
  }
}