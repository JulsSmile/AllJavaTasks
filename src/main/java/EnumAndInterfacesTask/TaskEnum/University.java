package EnumAndInterfacesTask.TaskEnum;

import java.util.ArrayList;
import java.util.List;

public class University{
    private String univerName;
    private List<Student> students;

    public enum Faculty{
        PSYCHOLOGY,
        JAVALOGY ,
        SOCIOLOGY ,
        POLITOLOGY
    }

    public enum Group{
        PS1 , PS2 ,
        J1 , J2 , J3 ,
        SO1 , SO2 , SO3 ,
        PO1 , PO3 ;


    }

    public enum Course{
        first("1-й курс "),
        second("2-й курс "),
        third("3-й курс "),
        fourth("4-й курс ");
        private String course;

        Course(String course) {
            this.course = course;
        }

        public String getCourse() {
            String course = "";
            return course;
        }
        @Override
        public String toString() {
            return course;
        }
    }

    public University(String univerName, List<Student> students) {
        this.univerName = univerName;
        this.students = students;
    }
    public List<Student> getStudentsList_(Faculty faculty) {
        ArrayList<Student> listOfStudentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                listOfStudentsByFaculty.add(student);
            }
        }
        return listOfStudentsByFaculty;
    }

    public List<Student> getStudentsListByFacultyAndGroup(Faculty faculty, Group group) {
        ArrayList<Student> StudentsListByFacultyAndGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                if (student.getGroup().equals(group)) {
                    StudentsListByFacultyAndGroup.add(student);
                }
            }
        }
        return StudentsListByFacultyAndGroup;
    }

    public List<Student> getStudentsListByGroup(Group group) {
        ArrayList<Student> StudentsListByGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                StudentsListByGroup.add(student);
            }
        }
        return StudentsListByGroup;
    }
}