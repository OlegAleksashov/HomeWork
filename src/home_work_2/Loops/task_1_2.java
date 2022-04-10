package home_work_2.Loops;

public class task_1_1_2 {
    public static void main(String[] args) {

        String begin = args[0];

        for (int i = 0; i < begin.length(); i++) {

        }

        int number = Integer.parseInt(args[0]);


        int result = 1;

        for (int i = 0; i < number; i++){
            result *= (i + 1);
        }
        System.out.println(result);

        }
    }








