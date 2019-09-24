package EnumAndInterfacesTask.TaskEnum;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected Integer birsday;
    protected String address;
    protected Integer phoneNumber;

    public Person(String firstName, String lastName, String middleName, Integer birsday, String address, Integer phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birsday = birsday;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return firstName
                + "\n" + lastName
                + "\n" + middleName
                + "\n" + birsday
                + "\n" + address
                + "\n" + phoneNumber;
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

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Integer getBirsday() {
        return birsday;
    }

    public void setBirsday(Integer birsday) {
        this.birsday = birsday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}