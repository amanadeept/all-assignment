package randomno;

import java.util.Random;
import java.util.Scanner;

public class Randomno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, i, j;
        int var;
        System.out.println("How many lines ?");
        num = sc.nextInt();
        for (i = 0; i < num; i++) {
            Random randomObj = new Random();
            var = randomObj.nextInt(10);
            for (j = 0; j <10; j++) {
                if (j == var) {
                    System.out.print("*");
                } else {

                    System.out.print("-");
                }
            }
             System.out.println(" ");
        }
    System.out.println("End of our Program ");
    }

}
