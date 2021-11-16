package HelloWorld2;

import java.util.Scanner;

public class Assignment{

     public static void main(String []args) {
    	 printMessage(5);
     }
     public static void printMessage(int times) {
    	 
    	    Scanner scan = new Scanner(System.in);
            System.out.println("Enter String:");
		    String word = scan.nextLine();
		    
		    for(int i = 0; i <= times; i++) {
		    	System.out.println(word);
        }
     }
}