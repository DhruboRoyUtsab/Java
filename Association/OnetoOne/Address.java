
public class Address {
    private String place;
    private int housenumber;
    private String postoffice;
    private int gpo;
    public Address(){}

    public Address(String place, int housenumber, String postoffice, int gpo){
        this.place = place;
        this.housenumber = housenumber;
        this.postoffice = postoffice;
        this.gpo = gpo;
    }

    public void setPlace(String place){
        this.place = place;
    }
    public void setHousenumber(int housenumber){
        this.housenumber = housenumber;
    }
    public void setPostoffice(String postoffice){
        this.postoffice = postoffice;
    }

    public void setGpo(int gpo){
        this.gpo = gpo;
    }
    public String getPlace(){
        return place;
    }
    public int getHousenumber(){
        return housenumber;
    }
    public String getPostoffice(){
        return postoffice;
    }
    public int getGpo(){
        return gpo;
    }

    public void Display(){
        System.out.println("Place: " + place);
        System.out.println("House Number: " + housenumber);
        System.out.println("Post Office: " + postoffice);
        System.out.println("Gpo: " + gpo);
    }


    }

