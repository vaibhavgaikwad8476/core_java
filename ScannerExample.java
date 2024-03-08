import java.util.Scanner
class ScaneerExample {
public static void main (String [] args)
{
Scanner sc =new Scanner(System.in);
System.out.print("Enter First String: ");
String a = sc.next();
sc,nextLine();
System.out.print("Enter Second String: ");
String b = sc.nextLine();
System.out.print("Enter Char: ");
char ch = sc.next().charAt(3);
System.out.println("a: "+a);
System.out.println("b: "+b);
System.out.println("ch: "+ch);
}

}

