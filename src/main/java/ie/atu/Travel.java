package ie.atu;

import static java.lang.System.out;

public class Travel {
    private String region;
    private String arena;
    private String details;
    private String price;
    private String link;

    public Travel(String region, String arena, String details, String price,String link){
        this.region = region;
        this.arena = arena;
        this.details = details;
        this.price = price;
        this.link = link;
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
    public String getPrice(){
        return price;
    }
    public String getLink() {
        return link;
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
        out.println("Region: " + this.region + "Arena: " + this.arena + "Details: " + this.details + this.price +"Price" + this.link +"Link");
    }


}

