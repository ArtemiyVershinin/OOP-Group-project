package ie.atu;

public class TravelDB {

    public static Travel getTravel(String travelCode) {


        Travel t = null;

        if (travelCode.equalsIgnoreCase("Ireland"))
        {
            Travel myTravel = new Travel();
            myTravel.setRegion(travelCode);
            myTravel.setDetails("Details pending\n");
            myTravel.setArena("Arena pending\n");
            myTravel.setLocationlink("Location pending\n");
            t =myTravel;

        } else if(travelCode.equalsIgnoreCase("England")) {
            Travel myTravel = new Travel();
            myTravel.setRegion(travelCode);
            myTravel.setDetails("Hello\n");
            myTravel.setArena("Yo\n");
            myTravel.setLocationlink("Yo\n");

            } else if(travelCode.equalsIgnoreCase("Amsterdam")){
            Travel myTravel = new Travel();
            myTravel.setRegion(travelCode);
            myTravel.setDetails("Well\n");
            myTravel.setArena("Here\n");
            myTravel.setLocationlink("locate\n");
            t = myTravel;
            }
            return t;
        }
}
