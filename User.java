public class User {

    private String firstName;
    private String lastName;
    private int id;
    private Address add;

    public User(String firstName, String lastName, int id, Address add) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.add= add;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAdd() {
        return add;
    }

    public void setAdd(Address add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                ", add=" + add +
                '}';
    }
}
