package home_work_1;

import java.util.Objects;
import java.util.Scanner;

public class task_5_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя:");
        String nameConsole = in.next();
        String nameVasia = "Вася";
        String nameAnastasia = "Анастасия";
        if (Objects.equals(nameConsole, nameVasia)) {
            System.out.println("Привет! \n" + "Я тебя так долго ждал");
        } else if (Objects.equals(nameConsole, nameAnastasia)) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
