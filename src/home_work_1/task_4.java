package home_work_1;

public class task_4 {
    public static void main(String[] args) {
       boolean weekday = true;
       boolean vocation = false;

       boolean sleep = sleepIn(weekday, vocation);

       if (sleep){
           System.out.println("Можно спать");
       } else {
           System.out.println("Пора вставать");
           System.out.println("Идти на работу");
       }
    }

    public static boolean sleepIn(boolean weekday, boolean vocation){
        if (weekday){
            if (vocation){
                return true;
            } else {
                return false;

            }
        } else {
            return true;
        }
    }



}
