package EnumAndHashMapTask.EnumsTask;

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {

        Person person = new Person("Тимофей ", "Доронин ", "Иванович", 1986, "Блока 6, кв.4", 898939);
//        System.out.println("Persons:" + person);

        Student student1 = new Student("Тимофей ", "Доронин ", "Иванович", 1986, "Дворцовая 10, кв.3", 8989239, 455, "джавология", 2, 2);
        Student student2 = new Student("Кырлы ", "Мырлы ", "Иgzdhhч", 1786, "Пушкина, кв.4", 8298939, 456, "физика", 2, 2);
        Student student3 = new Student("Ivan ", "Ivanov ", "Ivanych ", 986, "Блока 6, кв.4", 89448939, 457, "джавология", 5, 5);
//        System.out.println("Student 1" + student1);
//        System.out.println("Student 2" + student2);

        List<Student> students = new ArrayList<>(666);
        students.add(student1);
        students.add(student2);
        students.add(student3);

        University university = new University("КНТУ", students);


        System.out.println(university.getStudentsList_("физика"));

//        System.out.println("Students List By Faculty and Group: " + (university..getStudentsListByFacultyAndGroup("джавология", 2)));
//        System.out.println("Students List By Group: " + (university.getStudentsListByGroup(5)));
//        System.out.println("Students List By Birsday: " + (university.getStudentsListByBirsday(10)));

    }

}