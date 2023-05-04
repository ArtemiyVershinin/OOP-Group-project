package ie.atu;

public class TravelDB {

    public static Travel getTravel(String travelCode) {

        Travel t = null;

        if (travelCode.equalsIgnoreCase("Ireland"))
        {
            t = new Travel(travelCode, "Aviva", "Dublin");
        }
            else if(travelCode.equalsIgnoreCase("England"))
            {
                t = new Travel(travelCode, "O2", "London");
            }
            else if(travelCode.equalsIgnoreCase("Amsterdam"))
            {
                t = new Travel(travelCode, "Defqon1", "Rotterdam");
            }

            return t;
        }
}
