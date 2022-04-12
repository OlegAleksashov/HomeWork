package home_work_2.Loops;

public class task_1_2 {
    public static void main(String[] args) {
        System.out.println(is(args));
    }

    public static String is(String[] args) {
        int i = 0;
        String si = " ";
        long result = 1;
        String target = args[0];

        for (char character : target.toCharArray()){
            if (('.' == character) ||(',' == character)){
                si = " Не целое число ";
                break;
            } else if (isNotDig(character)) {
                si = " Не число ";
            } else {
                long sum = Long.parseLong(String.valueOf(character));
                result *= sum;
                if (i < target.length() - 1 ){
                    si += String.format("%d*" , sum);
                    i++;
                } else if (i == target.length() - 1){
                    si += String.format("%d=%d", sum, result);
                }
            }
        }
        return si;
    }
    public static boolean isNotDig(char character) {

        switch (character) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return false;
            default:
                return true;
        }
    }

}





