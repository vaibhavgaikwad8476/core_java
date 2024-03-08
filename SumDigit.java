import java.util.Scanner;
class SumDigit
{
 public static void main(String[] args) {
 	Scanner sc = new canner(System.in);
 	System.out.print("Enter The Number: ");
 	int num = sc.nextInt();
 	int dup = num;
 	int sum = 0;
 	sum = sum + num %10;
 	num = num/10;
 	sum = sum + num%10;
 	num = num/10;
 	sum = sum + num%10;
 	System.out.println("Sum Of Digit Number: "+sum+ "And The Number Is: "+);
 }
}