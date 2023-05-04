package ie.atu;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class TravelApp {

    public static void main(String[] args) {

        out.print("Welcome to the Travel App");
        out.println();

        Scanner sc = new Scanner(in);
        String confirmation = "y";

        while (confirmation.equalsIgnoreCase("y")) {
            out.print("Enter a region: ");
            String TravelCode = sc.nextLine();

            Travel t = TravelDB.getTravel(TravelCode);
            out.println();
            /*
            if (t != null) {
                for (String s : Arrays.asList("Region: ", "Arena: ", "Details: ")) {
                    out.println(s);
                    String

                }
            }

             */

            if (t != null) {
                out.println("Region: " + t.getRegion());
                out.println("Arena: " + t.getArena());
                out.println("Details: " + t.getDetails());
                out.println("Price: "+ t.getPrice());
                out.println("Link: "+ t.getLink());
            }
                else {
                    out.println("No region matches this name.");
                }

                out.println("\nWould you like to retry or continue searching\n");
                out.println("Please type `y/n` to retry or continue searching:  ");

                confirmation = sc.nextLine();
                out.println();


        }
        /*
        Access Event = new Access(" \n", "Pier\n", "\n");
        Event.Description();


         */
    }

}

