package EnumAndInterfacesTask.TaskEnum;

public class Student extends Person {
    private Integer id;
    private Enum faculty;
    private Enum course;
    private Enum group;

    public Student(String firstName, String lastName, String middleName, Integer birsday, String address, Integer phoneNumber, Integer id, Enum faculty, Enum course, Enum group) {
        super(firstName, lastName, middleName, birsday, address, phoneNumber);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return firstName + lastName + id + faculty + course + group + address;
    }

    public Integer getId() {
        return id;
    }

    public Enum getFaculty() {
        return faculty;
    }

    public Enum getCourse() {
        return course;
    }

    public Enum getGroup() {
        return group;
    }

}