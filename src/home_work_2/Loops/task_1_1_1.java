package home_work_2.Loops;


public class task_1_1_1 {
    public static void main(String[] args) {
       long number;
       long result;
       double check;
       String strNumber;

       result = 1;
       strNumber = args[0];

       check = Double.parseDouble(strNumber);

       if (check % 1 != 0) {
          System.out.println("Не целое число");
       } else if(check < 0){
          System.out.println("Отрицательное число");
       } else {
          number = Long.parseLong(strNumber);

          for (long i = 1; i <= number; i++) {
             result *= i;
          }
          if (result < number) {
             System.out.println("Переполнение");
          } else {
          System.out.print(forPrintResult (number));
          System.out.println(" = " + result);
          }
       }
    }

   public static String forPrintResult(long number) {
      String forPrint = null;

      for (long i = 1; i <= number; i++) {
         if (i < number) {
            forPrint = i + " * ";
            System.out.print(forPrint);
         } else if (i == number) {
            forPrint = String.valueOf(i);
         }
      }
      return forPrint;

   }
}
