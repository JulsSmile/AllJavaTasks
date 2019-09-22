package EnumAndHashMapTask.EnumsTask;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String univerName;
    private List<Student> students;

    public University(String univerName, List<Student> students) {
        this.univerName = univerName;
        this.students = students;
    }

    @Override
    public String toString() {
        return "University{" +
                "univerName='" + univerName + '\'' +
                ", students=" + students +
                '}';
    }

    public List<Student> getStudentsList_(String faculty) {
        ArrayList<Student> listOfStudentsByFaculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty().equals(faculty)) {
                listOfStudentsByFaculty.add(student);
            }
        }
        return listOfStudentsByFaculty;
    }

    public List<Student> getStudentsListByFacultyAndGroup(String faculty, String group) {
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

    public List<Student> getStudentsListByGroup(Integer group) {
        ArrayList<Student> StudentsListByGroup = new ArrayList<>();
        for (Student student : students) {
            if (student.getGroup().equals(group)) {
                StudentsListByGroup.add(student);
            }
        }
        return StudentsListByGroup;
    }


    public List<Student> getStudentsListByBirsday(Integer birsday) {
        ArrayList<Student> StudentsListByBirsday = new ArrayList<>();
        for (Student student : students) {
            if (student.getBirsday() > birsday) {
                StudentsListByBirsday.add(student);
            }
        }
        return StudentsListByBirsday;
    }
}