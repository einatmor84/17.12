import java.util.Calendar;

public class Person {
    private String name;
    private String surname;
    private static final int YEAR_OF_BIRTH = 2000;
    private Address address;

    public Person(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge(){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        return currentYear - YEAR_OF_BIRTH;
    }

    public void changeAddress(Address newAddress){
        this.address = newAddress;
    }

    public void display(){
        System.out.println("Name:" + name );
        System.out.println("surName:" + surname );
        System.out.println("Year of Birth:" + YEAR_OF_BIRTH );
        address.display();
    }
}
