
package assignment13;

import java.util.Scanner;
public class Assignment13 {

    
    public static void main(String[] args) {
      Scanner keyboard= new Scanner(System.in);
    int markcount;
    float avg = 0;
        int i,j;
    System.out.print("how many marks for the students...??");
    markcount = keyboard.nextInt();
    int[] marks=new int[markcount];

    for(i=0; i < markcount; i++){
   System.out.print("please enter marks..." +(i+1) + ": ");
   marks[i] = keyboard.nextInt();
    }
     for(j=0; j < markcount; j++){
         avg=(avg + marks[j]);
   System.out.println("Marks" +(j+1) + ": " + marks[j]);}
   System.out.println("Average of marks : " + (avg/markcount) );
    
}}
