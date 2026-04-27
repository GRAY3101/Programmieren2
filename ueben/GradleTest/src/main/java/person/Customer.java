package person;

public class Customer extends Person {
    private final String address;

    public Customer(String id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    @Override
    public String getRole() {
        return "person.Customer";
    }

    public String getAddress() {
        return address;
    }
}
