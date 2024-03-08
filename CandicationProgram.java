import java.util.Scanner;
class CandicationProgram
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("enter the num1: ");
  	int num1 = sc.nextInt();
  	System.out.print("enter the num2: ");
  	int num2 = sc.nextInt();
  	int main = (num1>num2)?num2:num1;
  	System.out.println(num1+ ","+num2+ "smollest among the 2 number");
  }
}
//write a java progem if the charactre between 