package task2;

import java.util.Date;

public class Student implements Person {
    private String firstName;
    private String lastName;
    private Date birthday;

    public Student(String firstName, String lastName, Date birthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
    }

    @Override
    public Date getBirthday() {
        return birthday;
    }

    @Override
    public void showInformation() {
        System.out.println("Имя: " + firstName);
        System.out.println("Фамилия: " + lastName);
        System.out.printf("%1$s %2$td %2$tB %2$tY", "Дата рождения: ", birthday);
        System.out.println();
    }
}