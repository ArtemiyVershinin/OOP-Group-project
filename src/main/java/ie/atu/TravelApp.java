package ie.atu;

import java.util.Scanner;

public class TravelApp {

    public static void main(String args[]) {

        System.out.print("Welcome to the Travel App");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String confirmation = "y";

        while (confirmation.equalsIgnoreCase("y")) {
            System.out.print("Enter a region: ");
            String TravelCode = sc.nextLine();

            Travel t = TravelDB.getTravel(TravelCode);

            System.out.println();
            if (t != null) {
                System.out.println("Region" + t.toString());
                System.out.println("Arena " + t.toString());
                System.out.println("Details:  " +t.toString());
            } else {
                System.out.println("No region matches this name.");
            }

            confirmation = sc.nextLine();
            System.out.println();
        }
    }
}

