package ComparatorTask;

import java.util.Comparator;

class PersonNameComparator implements Comparator<Person> {
    PersonNameComparator() {
    }

    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
}