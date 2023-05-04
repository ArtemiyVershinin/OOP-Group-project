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
                t = new Travel(travelCode, "O2", "London", "250 Euro", "https://www.google.com/maps/place/The+O2/@51.5029726,-0.0009397,16z/data=!3m1!4b1!4m6!3m5!1s0x47d8a81c5507b387:0x981ded0cf3b9dadf!8m2!3d51.503038!4d0.0031543!16s%2Fm%2F047t9qn");
            }
            else if(travelCode.equalsIgnoreCase("Netherlands"))
            {
                t = new Travel(travelCode, "Defqon1", "Amsterdam","300 Euro", "https://www.google.com/maps/place/Biddinghuizen,+Netherlands/@52.4175313,5.6075762,11z/data=!4m6!3m5!1s0x47c62cc98c771947:0xfe5d67503366ecc7!8m2!3d52.4552356!4d5.692693!16zL20vMDZxcGxn?hl=en");
            }
            else if(travelCode.equalsIgnoreCase("Russia"))
            {
                t = new Travel(travelCode, "Adrenaline Stadium", "Moscow | Lennon-grad ","25 Euro", "https://www.google.com/maps/place/Leningradsky+Ave,+%D0%B4.80,+Of.44,+Moskva,+Russia,+125315/@55.807903,37.5087849,17z/data=!4m6!3m5!1s0x46b548350c4e30e1:0xf2522d289821f3d!8m2!3d55.808108!4d37.510818!16s%2Fg%2F11n0dmy52s");
            }
            else if(travelCode.equalsIgnoreCase("Belgium"))
            {
                t = new Travel(travelCode, "Ancienne Belgique", "Brussels","45 Euro", "https://www.google.com/maps/place/Ancienne+Belgique/@50.8571815,4.3058863,12z/data=!4m10!1m2!2m1!1smusic+arenas+in+belgium+naantali+location!3m6!1s0x47c3c478637e0603:0x5b8708526b74dab1!8m2!3d50.8472409!4d4.3488349!15sCiltdXNpYyBhcmVuYXMgaW4gYmVsZ2l1bSBuYWFudGFsaSBsb2NhdGlvbloiIiBtdXNpYyBhcmVuYXMgaW4gYmVsZ2l1bSBuYWFudGFsaZIBDGNvbmNlcnRfaGFsbJoBI0NoWkRTVWhOTUc5blMwVkpRMEZuU1VORkxUWnBkbVozRUFF4AEA!16zL20vMGNmd3N6");
            }
            else if(travelCode.equalsIgnoreCase("Poland"))
            {
                t = new Travel(travelCode, "Krakow Arena", "Krakow","20 Euro", "https://www.google.com/maps/place/TAURON+Arena+Krakow/@50.0677147,19.9888118,17z/data=!4m7!3m6!1s0x47165b2aaa8854c5:0xfdfeadc1a58cb0b0!4b1!8m2!3d50.0677147!4d19.9913921!16s%2Fm%2F0gvqs_k");
            }
            else if(travelCode.equalsIgnoreCase("France"))
            {
                t = new Travel(travelCode, "South of France Arena", "Montpellier","15 Euro", "https://www.google.com/maps/place/South+of+France+Arena/@43.5734375,3.9489097,17z/data=!3m1!4b1!4m6!3m5!1s0x12b6a4d5fc7a3bf7:0x7409bb29f43e093a!8m2!3d43.5734375!4d3.95149!16s%2Fm%2F0cmb_pg");
            }
            else if(travelCode.equalsIgnoreCase("Brazil"))
            {
             t = new Travel(travelCode, "Chevrolet Hall", "Belo Horizonte","100 Euro", "https://www.google.com/maps/place/KM+de+Vantagens+Hall/@-19.9899885,-43.9785015,12z/data=!4m6!3m5!1s0xa699cfdd8fc2db:0x5a4052aa9ea3eed3!8m2!3d-19.9420997!4d-43.9342128!16zL20vMDIycXJr");
            }
            else if(travelCode.equalsIgnoreCase("Australlia"))
            {
                t = new Travel(travelCode, "John Cain Arena", "Melbourne","90 Euro", "https://www.google.com/maps/place/John+Cain+Arena/@-37.8228398,144.9792882,17z/data=!3m1!4b1!4m6!3m5!1s0x6ad642be136568a7:0x38c0a17f8edfa003!8m2!3d-37.8228398!4d144.9818685!16zL20vMGIzMTd5");
            }
            else if(travelCode.equalsIgnoreCase("New Zealand"))
            {
                t = new Travel(travelCode, "Valhalla", "Wellington","69 Euro", "https://www.google.com/maps/place/Valhalla/@-41.2948018,174.7727601,17z/data=!3m1!4b1!4m6!3m5!1s0x6d38afd8501c761f:0x84e374c82a6801b0!8m2!3d-41.2948018!4d174.7753404!16s%2Fg%2F11cm0cr_jl");
            }

            return t;
        }
}
