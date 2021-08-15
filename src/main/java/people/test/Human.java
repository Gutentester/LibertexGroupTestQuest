package people.test;

import java.util.Calendar;
import java.util.Scanner;

public class Human {

    public static void main(String[] args) {
        Human Anton = new Human();
        Anton.CheckAdult();
    }

    public void CheckAdult () {

        Calendar calendar = Calendar.getInstance();
        Scanner scan = new Scanner(System.in);

        //Забираем у пользователя его ДР
        System.out.println("Введите день вашего рождения:");
        int dayBirth = scan.nextInt();
        System.out.println("Введите месяц вашего рождения:");
        int monthBirth = scan.nextInt();
        System.out.println("Введите год вашего рождения:");
        int yearBirth = scan.nextInt();

        // Получаем отдельно текущие год, месяц и день.
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        // Проверка на совершеннолетие
        if ((yearBirth <= (year - 18)) && (monthBirth <= month) && (dayBirth <= day)) {
            System.out.println("Вы совершеннолетний");
        } else {
            System.out.println("Вам нет 18-ти");
        }
    }
}

