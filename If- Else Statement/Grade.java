import java.util.Scanner;
class Grade
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your percentage: ");
    double per = sc.nextDouble();

    if(per<35)
    {
      System.out.println("you are failed in your life");
    }
    else if(per<60)
    {
      System.out.println("you have cleared exam any how");
      System.out.println("Grade B Second Class "+per);
    }
    
    else if(per<75)
      {
        System.out.println("you done a little hard work");
        System.out.println("Grade A+ Distication "+per);
      }
      else if(per<=100)
      {
        System.out.println("Miracle");
      
        System.out.println("Grade O First Class with Distication "+per);
      }
    else 
    {
      System.out.println("Invalid percentage u dont belongs to this planet");
    }
  }

}