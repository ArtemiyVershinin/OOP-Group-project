package ie.atu;

import static java.lang.System.out;

public class Access extends Travel{

    private double price;
    private String link;
    public Access(String region, String arena, String details, double price, String link){
        super(region, arena, details, "Price", "Link");
        this.price = price;
        this.link = link;
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
