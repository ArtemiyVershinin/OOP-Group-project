package ie.atu;

import

public class Travel {

    private String region;
    private String arena;
    private String details;
    private String locationlink;

    protected static int count =0;

    public Travel(){
        region ="";
        arena="";
        details="";
        locationlink="";
        count++;
    }
    public void setRegion(String region){this.region = region; }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getLocationlink() {
        return locationlink;
    }

    public void setLocationlink(String locationlink) {
        this.locationlink = locationlink;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Travel.count = count;
    }
    public String toString() {return details + "located"+ locationlink;}

    public static int getCount(){return count; }
}
