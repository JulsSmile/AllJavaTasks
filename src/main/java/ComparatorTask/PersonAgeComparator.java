package ComparatorTask;

import java.util.Comparator;

class PersonAgeComparator implements Comparator<Person> {
    PersonAgeComparator() {
    }

    public int compare(Person a, Person b) {
        if (a.getAge() > b.getAge()) {
            return 1;
        } else {
            return a.getAge() < b.getAge() ? -1 : 0;
        }
    }
}