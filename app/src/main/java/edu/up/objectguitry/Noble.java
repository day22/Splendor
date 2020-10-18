package edu.up.objectguitry;

public class Noble {
    private int rPrice;
    private int bPrice;
    private int gPrice;
    private int wPrice;
    private int brPrice;

    private int prestigePoints;

    public Noble(int rPrice, int bPrice, int gPrice, int wPrice, int brPrice, int prestigePoints){
        this.rPrice = rPrice;
        this.bPrice = bPrice;
        this.gPrice = gPrice;
        this.wPrice = wPrice;
        this.brPrice = brPrice;
        this.prestigePoints = prestigePoints;
    }

    //COPY CONSTRUCTOR
    public Noble(Noble nobelToCopy){
        this.rPrice = nobelToCopy.rPrice;
        this.bPrice = nobelToCopy.bPrice;
        this.gPrice = nobelToCopy.gPrice;
        this.wPrice = nobelToCopy.wPrice;
        this.brPrice = nobelToCopy.brPrice;
        this.prestigePoints = nobelToCopy.prestigePoints;
    }


    public int getrPrice() {
        return rPrice;
    }

    public void setrPrice(int rPrice) {
        this.rPrice = rPrice;
    }

    public int getbPrice() {
        return bPrice;
    }

    public void setbPrice(int bPrice) {
        this.bPrice = bPrice;
    }

    public int getgPrice() {
        return gPrice;
    }

    public void setgPrice(int gPrice) {
        this.gPrice = gPrice;
    }

    public int getwPrice() {
        return wPrice;
    }

    public void setwPrice(int wPrice) {
        this.wPrice = wPrice;
    }

    public int getBrPrice() {
        return brPrice;
    }

    public void setBrPrice(int brPrice) {
        this.brPrice = brPrice;
    }

    public int getPrestigePoints() {
        return prestigePoints;
    }

    public void setPrestigePoints(int prestigePoints) {
        this.prestigePoints = prestigePoints;
    }
}
