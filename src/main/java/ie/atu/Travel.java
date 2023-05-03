package ie.atu;

public class Travel {

    private String region;
    private String arena;
    private String details;

    public Travel(String region, String arena, String details) {
        this.region = region;
        this.arena = arena;
        this.details = details;
    }

    public Travel() {

    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }
    public void setDetails(String details) {
        this.details = details;
    }

    public String toString() {
        return details;
    }

    public void Description() {
        double price = 15.00;
        System.out.println("Region is: " + this.region + "Arena is: " + this.arena + "Details: " + this.details + price);
    }

/*
    public String getRegion() {
        return region;
    }


    public String getArena() {
        return arena;
    }
    public String getDetails() {
        return details;
    }
    */
}

