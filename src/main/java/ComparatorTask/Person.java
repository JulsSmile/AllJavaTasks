package ComparatorTask;

import java.util.Comparator;

class Person implements Comparator<Person> {
    private String name;
    private int age;

    public Person(int a, String n) {
        this.name = n;
        this.age = a;
    }

    String getName() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }

    public int compare(Person p1, Person p2) {
        return 0;
    }
}
