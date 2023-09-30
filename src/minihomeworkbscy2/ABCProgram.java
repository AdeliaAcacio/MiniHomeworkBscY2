/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minihomeworkbscy2;

import java.util.Scanner;

/**
 *
 * @author Adelia Acacio 2022203
 */
public class ABCProgram {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       System.out.println("          ****** WELCOME TO THE AWESOME BOOK CLUB PROGRAM!!! ******");//Output to screen
       System.out.println("          (This program will check if you are awesome enough to join our club)\n " );
       
        String userName; //To store user name
        int userAnswer1, userAnswer2; //To store user answers
        
        
            
        
        Scanner myKB = new Scanner(System.in); //Prompt
        
        System.out.println("What is your name?"); //Output to screen
        userName = myKB.nextLine(); //Read from the screen and store in userName
        
        try{
        //Converting user name characters to upper case using .toUpperCase()
        System.out.println("\n               *** HELLO, " + userName.toUpperCase() +  "***\n Let's see how awesome you really are!"); //Output to screen
        System.out.println("\nHow many books have you read last year? Numbers only");//possible error  - catch the error
        userAnswer1 = myKB.nextInt(); //Reads the integer from the screen and store in userAnswer1
        
        System.out.println("How many books have you read this year? Numbers only");
        userAnswer2 = myKB.nextInt();//Reads the integer from the screen and store in userAnswer1
       
        //To catch if the user type letters instead numbers
        }catch(Exception e){
            System.out.println("Error - You need to enter a number!");
        }
    }
    
}
