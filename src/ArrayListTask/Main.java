package ArrayListTask;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList();
        persons.add(new Person("Тимофей ", "Доронин ", 25));
        persons.add(new Person("Пётр ", "Соболев ", 50));
        persons.add(new Person("Бронислав ", "Шухевич ", 60));
        persons.add(new Person("Эдуард ", "Рожков ", 42));
        persons.add(new Person("Леонид  ", "Попов ", 28));
        persons.add(new Person("Рената ", "Шашкова ", 28));
        persons.add(new Person("Жанна ", "Овчаренко ", 25));
        persons.add(new Person("Полина ", "Гурьева ", 26));
        persons.add(new Person("Нонна ", "Линник ", 45));
        persons.add(new Person("Ольга ", "Пономарёва", 54));
        Company company = new Company("Looo", persons);
        int companySize = company.getCompanySize();
        System.out.println(companySize);

        boolean isEmployeeByName = company.isEmployeeExistsByName("Ольга");
        System.out.println(isEmployeeByName);

        boolean isEmployee = company.isEmployeeExistsByLastName("Линник");
        System.out.println(isEmployee);
    }
}
