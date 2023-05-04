package ie.atu;

public class TravelDB {

    public static Travel getTravel(String travelCode) {

        Travel t = null;

        if (travelCode.equalsIgnoreCase("Ireland"))
        {
            t = new Travel(travelCode, "Aviva", "Dublin", "15 Euro", "https://www.google.com/maps/d/viewer?mid=1rghJWmmQOeHBo3ixgwZSSHt7sh4&hl=en&ll=53.3353445609301%2C-6.228518560852052&z=16");
        }
            else if(travelCode.equalsIgnoreCase("England"))
            {
                t = new Travel(travelCode, "O2", "London", "15 Euro", "https://www.google.com/maps/place/The+O2/@51.5029726,-0.0009397,16z/data=!3m1!4b1!4m6!3m5!1s0x47d8a81c5507b387:0x981ded0cf3b9dadf!8m2!3d51.503038!4d0.0031543!16s%2Fm%2F047t9qn");
            }
            else if(travelCode.equalsIgnoreCase("Netherlands"))
            {
                t = new Travel(travelCode, "Defqon1", "Rotterdam","15 Euro", "https://www.google.com/maps/place/Biddinghuizen,+Netherlands/@52.4175313,5.6075762,11z/data=!4m6!3m5!1s0x47c62cc98c771947:0xfe5d67503366ecc7!8m2!3d52.4552356!4d5.692693!16zL20vMDZxcGxn?hl=en");
            }
            else if(travelCode.equalsIgnoreCase("Russia"))
            {
                t = new Travel(travelCode, "Lennon-grad Adrenaline Stadium", "Moscow","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("Belgium"))
            {
                t = new Travel(travelCode, "Belgish", "Waffle","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("Poland"))
            {
                t = new Travel(travelCode, "", "War-Saw","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("France"))
            {
                t = new Travel(travelCode, "", "Paris","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("Brazil"))
            {
             t = new Travel(travelCode, "", "Rio De Janero","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("Australlia"))
            {
                t = new Travel(travelCode, "", "Moscow","15 Euro", "");
            }
            else if(travelCode.equalsIgnoreCase("NewZealand"))
            {
            t = new Travel(travelCode, "", "Not Green Land","15 Euro", "");
            }



            return t;
        }
}
