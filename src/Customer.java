public class Customer {
    // class attributes
    private int ID;
    private String name;
    private char gender;

    // constructor without parameters

    public Customer() {
        super();
    }

    // constructor with parameters

    public Customer(int ID, String name, char gender) {
        super();
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }

    // getters and setters

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // class methods

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + getID() +
                ", name='" + getName() + '\'' +
                ", gender=" + getGender() +
                '}';
    }
}
