package EnumAndInterfacesTask.TaskEnum;

import java.util.ArrayList;
import java.util.List;

import static EnumAndInterfacesTask.TaskEnum.University.Course.*;
import static EnumAndInterfacesTask.TaskEnum.University.Faculty.*;
import static EnumAndInterfacesTask.TaskEnum.University.Group.*;

public class Main{

    public static void main(String[] args) {


        Student student1 = new Student("Тимофей ", "Доронин ", "Иванович ", 1986, " Дворцовая 10, кв.3 ", 8989239, 455, JAVALOGY, second,  J2);
        Student student2 = new Student("Марфа ", "Васильева ", "Петровна ", 1786, " Пушкина, кв.4 ", 8298939, 456, POLITOLOGY, third, PO3);
        Student student3 = new Student("Ivan ", "Ivanov ", "Ivanych ", 986, " Блока 6, кв.4 ", 89448939, 457, SOCIOLOGY, first, SO1);

        List<Student> students = new ArrayList<>(666);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        University university = new University("КНТУ", students);

        System.out.println("Students List By Faculty: " + university.getStudentsList_(JAVALOGY));

        System.out.println("Students List By Faculty and Group: " + (university.getStudentsListByFacultyAndGroup(JAVALOGY, J2)));
        System.out.println("Students List By Group: " + (university.getStudentsListByGroup(J2)));
    }
}