package task2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StudentBase implements InputInformation, AverageAge {
    private Person[] studentList;

    @Override
    public void makeStudentBase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество студентов: ");
        int amount = scanner.nextInt();
        scanner.nextLine();
        studentList = new Person[amount];
        String firstName;
        String lastName;
        String date;
        int num = 1;
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        for (int i = 0; i < studentList.length; i++) {
            System.out.println("Введите данные студента №" + num + ":");
            System.out.println("Введите имя:");
            firstName = scanner.nextLine();
            System.out.println("Введите фамилию:");
            lastName = scanner.nextLine();
            System.out.println("Введите дату рождения (yyyy-MM-dd): ");
            date = scanner.nextLine();
            try {
                studentList[i] = new Student(firstName, lastName, sdf.parse(date));
            } catch (ParseException e) {
                e.printStackTrace();
            }
            num++;
        }
    }

    @Override
    public void getAge() {
        Date currentDate = new Date();
        long sum = 0;
        for (int i = 0; i < studentList.length; i++) {
            sum += studentList[i].getBirthday().getTime();
        }
        sum = sum / studentList.length;
        long delta = currentDate.getTime() - sum;
        long allMinutes = delta / (60 * 1000);
        long years = allMinutes / (365 * 24 * 60);
        long month = allMinutes % (365 * 24 * 60) / (30 * 24 * 60);
        long days = allMinutes % (365 * 24 * 60) % (30 * 24 * 60) / (24 * 60);
        long hours = allMinutes % (365 * 24 * 60) % (30 * 24 * 60) % (24 * 60) / 60;
        long minutes = allMinutes % (365 * 24 * 60) % (30 * 24 * 60) % (24 * 60) % 60;
        System.out.println("Средний возраст равен: " + years + " лет " + month + " месяцев " + days + " дней " + hours + " часов " + minutes + " минут.");
    }

    public void showAllInformation() {
        System.out.println("Студенты:");
        for (int i = 0; i < studentList.length; i++) {
            studentList[i].showInformation();
        }
    }
}
