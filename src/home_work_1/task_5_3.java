package home_work_1;

import java.util.Scanner;

public class task_5_3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите свое имя");
        String name = console.nextLine();

        switch (name){
            case "Вася" :
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия" :
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Привет, а ты кто?");
                break;

        }
    }
}
