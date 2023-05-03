package ie.atu;

public class TravelDB {

    public static Travel getTravel(String travelCode) {


        Travel t = null;

        if (travelCode.equalsIgnoreCase("Ireland"))
        {
            Travel myTravel = new Travel();
            myTravel.setRegion(travelCode);
            myTravel.setDetails("Details pending");
            myTravel.setArena("Arena pending");

            t = myTravel;

        }
            else if(travelCode.equalsIgnoreCase("England"))
            {
                Travel myTravel = new Travel();
                myTravel.setRegion(travelCode);
                myTravel.setDetails("Hello");
                myTravel.setArena("Yo");

                t = myTravel;

            }
            else if(travelCode.equalsIgnoreCase("Amsterdam"))
            {
                Travel myTravel = new Travel();
                myTravel.setRegion(travelCode);
                myTravel.setDetails("8pm - 3rd Avenue");
                myTravel.setArena("Pier's Club");

                t = myTravel;

            }

            return t;
        }
}
