import java.util.Scanner;

class BloodDonation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 20) {
            System.out.print("You cannot donate blood. Try after " + (20 - age) + " years.");
        } else {
            System.out.print("Do you consume cigarette or alcohol in the last 24 hours? (yes/no): ");
            String nasha = sc.next().toLowerCase();

            if (nasha.equals("no")) {
                System.out.print("Enter your weight: ");
                double weight = sc.nextDouble();

                if (weight >= 50) {
                    System.out.print("We can pump your blood.");
                } else {
                    System.out.print("Go and have some food and increase your weight.");
                }
            } else {
                System.out.print("You cannot donate blood because you have consumed cigarette or alcohol.");
            }
        }
    }
}
