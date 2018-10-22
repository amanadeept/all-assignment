package guessinggame;

import java.util.Random;
import java.util.Scanner;

public class Guessinggame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random ranObj = new Random();
        int ran;
        int i = 1;
        int RandomNumber;
        int ScanNumber = -1;
        int ScanCount=1;
        System.out.println("****************************");
        System.out.println("Welcome to the Guessing Game");
        System.out.println("****************************");

        RandomNumber = ranObj.nextInt(10)+1;

      

       while (ScanNumber != RandomNumber) {
            System.out.println("Enter the number from 1 to 10: ");
            ScanNumber= sc.nextInt();
             
            if (ScanNumber == RandomNumber) {
                System.out.println("You won! The number was " + ScanNumber);
            } else {
                ScanCount++;
                System.out.println(" Try again... ");
            }
        }
        System.out.println(" it took " + ScanCount + " guesses to win");
    }

}
