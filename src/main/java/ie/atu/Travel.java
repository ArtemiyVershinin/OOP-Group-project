package ie.atu;

import static java.lang.System.out;

public class Travel {
    private String region;
    private String arena;
    private String details;

    public Travel(String region, String arena, String details){
        this.region = region;
        this.arena = arena;
        this.details = details;
    }
    public String getRegion(){
        return region;
    }
    public String getArena(){
        return arena;
    }
    public String getDetails(){
        return details;
    }

    /*
    public void setRegion(String region) {
        this.region = region;
    }
    public void setArena(String arena) {
        this.arena = arena;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    /*
    public String toString() {
        return details;
    }

     */

    public void Description() {
        out.println("Region: " + this.region + "Arena: " + this.arena + "Details: " + this.details);
    }


}

