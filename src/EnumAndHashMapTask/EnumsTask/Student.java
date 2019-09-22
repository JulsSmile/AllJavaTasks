package EnumAndHashMapTask.EnumsTask;

public class Student extends Person{
    private Integer id;
    private String faculty;
    private Integer course;
    private Integer group;

    public Student(String firstName, String lastName, String middleName, Integer birsday, String address, Integer phoneNumber, Integer id, String faculty, Integer course, Integer group) {
        super(firstName, lastName, middleName, birsday, address, phoneNumber);
        this.id = id;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", faculty='" + faculty + '\'' +
                ", course=" + course +
                ", group=" + group +
                "} " + super.toString();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Integer getGroup() {
        return group;
    }

    public void setGroup(Integer group) {
        this.group = group;
    }
}