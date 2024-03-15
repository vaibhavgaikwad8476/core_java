import java.util.Scanner;

class Election {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Do you have a voter ID? (yes/no): ");
            String voterId = sc.next().toLowerCase();
            if (voterId.equals("yes")) {
                System.out.println("******Welcome*****");
                System.out.println("1. BJP");
                System.out.println("2. Congress");
                System.out.println("3. AAP");
                System.out.println("4. MNS");
                System.out.println("5. ShivSena");
                System.out.println("6. NCP");
                System.out.println("7. NOTA");
                System.out.println("Enter your Party: ");
                String vote = sc.next().toUpperCase();

                if (vote.equals("BJP")) {
                    System.out.println("You have voted for BJP");
                } else if (vote.equals("CONGRESS")) {
                    System.out.println("You have voted for Congress");
                } else if (vote.equals("AAP")) {
                    System.out.println("You have voted for AAP");
                } else if (vote.equals("MNS")) {
                    System.out.println("You have voted for MNS");
                } else if (vote.equals("SHIVSENA")) {
                    System.out.println("You have voted for ShivSena");
                } else if (vote.equals("NCP")) {
                    System.out.println("You have voted for NCP");
                } else if (vote.equals("NOTA")) {
                    System.out.println("Thank you for wasting your vote");
                } else {
                    System.out.println("Invalid input");
                }
            } else {
                System.out.println("You must have a voter ID to vote.");
            }
        } else {
            System.out.println("You are not mature enough to vote yet. Wait for " + (18 - age) + " more years.");
        }
    }
}
