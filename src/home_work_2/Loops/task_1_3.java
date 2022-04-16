package home_work_2.Loops;

import java.util.Scanner;

public class task_1_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("First num");
        int i = scan.nextInt();

        System.out.println("Second num");

        if (!scan.hasNextInt()){
            System.out.println("Enter a positive integer");

        } int a = scan.nextInt();
        if (a < 0) {
            System.out.println("Enter a positive integer");
        } else
            System.out.println(i +" ^ " + a + " = " + stepen(i, a));
      }
          public static int stepen(int i, int a){
              int b = 1;

              for (int j = 0; j < a; j++) {
                  b *= i;
              }
              return b;
          }





    }











