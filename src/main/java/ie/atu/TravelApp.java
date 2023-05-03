package ie.atu;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;

public class TravelApp extends Travel{

    public static void main(String[] args) {

        out.print("Welcome to the Travel App");
        out.println();

        Scanner sc = new Scanner(in);
        String confirmation = "y";

        while (confirmation.equalsIgnoreCase("y")) {
            out.print("Enter a region: ");
            String TravelCode = sc.nextLine();

            Travel t = TravelDB.getTravel(TravelCode);



            Travel Amsterdam = new Travel("\n", "8pm - 3rd Avenue\n", "Pier's Club\n" );
            Amsterdam.Description();


            out.println();
            if (t != null) {
                for (String s : Arrays.asList("Region: ", "Arena: ", "Details: ")) {
                    out.println(s);
                }
            } else {
                out.println("No region matches this name.");
            }

            out.println("\nWould you like to retry or continue searching\n");
            out.println("Please type `y/n` to retry or continue searching:  ");

            confirmation = sc.nextLine();
            out.println();

        }




    }

}

