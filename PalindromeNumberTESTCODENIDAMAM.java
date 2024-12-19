//Check for Palindrome Number: Write a program to check if a number is a palindrome (e.g., 121).

package palindrome;

import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in) ;
        	  
        	  System.out.print("please the number provide"); //INPUT
        	  int number= sc.nextInt();
        	  
        	  
        	  int oriNum=number;
        	  int revNum=0;
        	  
        	  //reverse process
        	  
        	  while(number !=0) {
        		  int d= number % 10; //last digit
        		  revNum=revNum * 10 + d; //reverse
        		  number /= 10;   //remove last digit
        	  }
        	  
        	  if (oriNum==revNum) {
        		  
        		  System.out.println("palindrome");
        	  }
        	  
        	  else {
        		  
        		  System.out.println("not palindrome");
        	  }
          }
}



/*
 
 please the number provide121
palindrome


*/
