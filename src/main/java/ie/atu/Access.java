package ie.atu;

import java.util.ArrayList;

import static java.lang.System.out;

public class Access extends Travel{

    private double price;
    public Access(String region, String arena, String details, double price){
        super(region, arena, details);
        this.price = price;
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

    public void Description() { //inherited
        super.Description();
        out.println("Price: " + price);
    }
}
