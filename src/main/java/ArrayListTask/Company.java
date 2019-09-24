package ArrayListTask;

import java.util.List;

public class Company{
    String companyName;

    public String getCompanyName() {
        return companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public List<Person> getPersons() {
        return persons;
    }
    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    private List<Person> persons;

    public Company(String companyName, List<Person> persons) {
        this.companyName = companyName;
        this.persons = persons;
    }

    public int getCompanySize() {
        return persons.size();
    }

    public boolean isEmployeeExistsByName(String firstName) {
        for (Person person : persons) {
            if (person.getFirstName().contains(firstName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmployeeExistsByLastName(String lastName) {
        for (Person person : persons) {
            if (person.getLastName().contains(lastName)) {
                return true;
            }
        }
        return false;
    }
}
