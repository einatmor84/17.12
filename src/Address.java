public class Address {
    private String city;
    private String street;
    private int number;
    private String postalCode;

    public Address(String city, String street, int number, String postalCode){
        this.city = city;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
    }
    public String getCity(){
        return city;
    }
    public String getStreet(){
        return street;
    }
    public int getNumber(){
        return number;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public void display(){
        System.out.println("Address: " + number +  ", " + street + ", " + city + ", " + postalCode);
    }
}
