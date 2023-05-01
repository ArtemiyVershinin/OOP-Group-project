package ie.atu;

public class TravelDB {

    public static Travel getTravel(String region) {


        Travel myTravel = null;
        if (region.equalsIgnoreCase("Ireland")) {
            myTravel = new Travel();
            myTravel.setRegion(region);
            myTravel.setDetails("");
            myTravel.setArena("");
            myTravel.setLocationlink("");

        } else if(region.equalsIgnoreCase("England")) {
            myTravel = new Travel();
            myTravel.setRegion(region);
            myTravel.setDetails("");
            myTravel.setArena("");
            myTravel.setLocationlink("");

            } else if(region.equalsIgnoreCase("Amsterdam")){
            myTravel = new Travel();
            myTravel.setRegion(region);
            myTravel.setDetails("");
            myTravel.setArena("");
            myTravel.setLocationlink("");
            }
            return myTravel;
        }
}
