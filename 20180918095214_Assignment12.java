
package assignment12;

import java.util.Scanner;
public class Assignment12 {

   
    public static void main(String[] args) {
          int i,j,k;
        // TODO code application logic here
              Scanner console = new Scanner(System.in);
        System.out.print("how many lines are: ");
     
        int n=console.nextInt();
      
        
        for(i=n; i>0; i--)
        {
        for(j = 0; j < n - i ; j++){
            System.out.print(" ");
        }
        for(k=1; k <=2*i-1; k++)
        {
        System.out.print("*");
        }
        System.out.println();
        console.close();
    }
    
}}
