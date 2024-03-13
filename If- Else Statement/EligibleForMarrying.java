import java.util.Scanner;
class EligibleForMarrying
{
  public static void main(String[] args) {
  	Scanner sc = new Scanner(System.in);
    System.out.print("enter your age: ");
    int age = sc.nextInt();
    System.out.print("enter Your Property: ");
    double property = sc.nextDouble();
    System.out.print("enter your surname: ");
    String surName = sc.next().toUpperCase();


  	if((age>=21 && property>= 10000000) || (surName.equals("AMBANI")) )
  	{
     System.out.println("you are eligibal");  
  	}
     else{
     System.out.println("not eligibal");
     }
  }
}
