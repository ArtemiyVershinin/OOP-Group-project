package ie.atu;

import java.util.Scanner;


import javax.swing.plaf.synth.Region;

public class TravelApp {

    public static void main(String args[]) {

        System.out.print("Welcome to the Travel App");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String confirmation = "y";

        while (confirmation.equalsIgnoreCase("y")){
            System.out.print("Enter region: ");
            String region = sc.nextLine();

            Travel p = TravelDB.getTravel((region));
        }
        String region = sc.nextLine();

        Travel yourTravel = TravelDB.getTravel(region);

        System.out.println();
        if (p !=null) {
            System.out.println("Region" + p.toString());
            System.out.println("Arena " + p.regionCode());
            System.out.println("Details:   " + yourTravel.getDetails());
        }else {
            System.out.println("No region matches this name.");
        }

        System.out.println("Keep Searching ? (y/n: ");
        confirmation = sc.nextLine();
        System.out.println();
    }
    sc.close();
}
