package javaapplication15;

import java.util.Random;
import java.util.Scanner;

public class JavaApplication15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          Scanner keyboard = new Scanner(System.in);
        int elementCount;
        int RandomNumber;
        int searchNo;
        
        int j;
        int location = -1;

        System.out.print("how many elements:  ");
        elementCount = sc.nextInt();
        int[] array = new int[elementCount];

        System.out.println("RandomNumbers are:   ");
        for (j = 0; j < elementCount; j++) {
            Random randomObj = new Random();
            RandomNumber = randomObj.nextInt(999);
            array[j] = RandomNumber;
           
        }
    for (j = 0; j < elementCount; j++) {
        
        System.out.println( j+1+":  " +array[j]);
    }
       System.out.print("which number to search :  " );
        searchNo=keyboard.nextInt();
         for(j=0;j<elementCount;j++){
        if (array[j] == searchNo){
        location = j+1;
        }
    }
    if(location == -1){
    System.out.println("element not found");
    }
    else{
    System.out.println("element found at index : " +location);
    }
    System.out.println("End of this assignment");

}}
    
    


