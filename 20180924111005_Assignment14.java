
package assignment14;

import java.util.Scanner;

public class Assignment14 {

   
    public static void main(String[] args) {
        int studentCount;
        int subjectCount;
        int i,j;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("hello user");
          System.out.println("how many students(rows)?");
          studentCount = keyboard.nextInt();

        System.out.println("how many subjects(columns)?");
            subjectCount = keyboard.nextInt();
            
            int[][] marks = new int[studentCount][subjectCount];
        for(i=0;i<studentCount;i++){
        System.out.println("student" + (i+1));
        for(j=0; j<subjectCount; j++){
              System.out.print("marks" + (j+1) +": ");   
              marks[i][j] = keyboard.nextInt();
        
        }
    }
        for (i=0; i< studentCount;i++){
          for(j=0; j<subjectCount;j++)  {
          System.out.print("|----");
          }
          System.out.println("|");
          for(j=0; j<subjectCount;j++){
          System.out.print(String.format("| %3d", marks[i][j]));
          }
            System.out.println("|");
    }}}

