public class Main {
    public static void main(String[] args) {

        Address address1 = new Address("Haifa", "Rashi", 80, "AF508914");
        address1.display();
        System.out.println("-----------------------------");
        Address address2 = new Address("TelAviv", "BenYehuda", 71, "879E3");

        Person p1 = new Person("Yossi", "Boblil", address1);
        System.out.println("Before Address change:");
        p1.display();

        p1.changeAddress(address2);
        System.out.println("-----------------------------");
        System.out.println("After Address change:");
        p1.display();

    }
}