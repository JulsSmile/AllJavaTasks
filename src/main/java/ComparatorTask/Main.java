package ComparatorTask;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Comparator<Person> pcompare = (new PersonNameComparator()).thenComparing((new PersonAgeComparator()).reversed());
        TreeSet<Person> person = new TreeSet(pcompare);
        person.add(new Person(14, "Ivasyk"));
        person.add(new Person(64, "Les"));
        person.add(new Person(24, "Ivan"));
        person.add(new Person(24, "Avan"));
        person.add(new Person(24, "Bolvan"));
        person.add(new Person(4, "Ivan"));
        person.add(new Person(74, "Ivan"));
        person.add(new Person(44, "Vasyl"));
        person.add(new Person(44, "QVasyl"));
        person.add(new Person(34, "Mykola"));
        person.add(new Person(33, "Mykola"));
        person.add(new Person(32, "Mykola"));
        person.add(new Person(24, "Mykola"));
        Iterator iter = person.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

    }
}