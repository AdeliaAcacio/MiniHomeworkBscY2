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
public class MiniHomeworkBscY2 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("***Welcome to the program!***");//Output to screen
       
        String userName; //To store user name
        
        Scanner myKB = new Scanner(System.in); //Prompt
        
        System.out.println("What is your name?"); //Output to screen
        userName = myKB.nextLine(); //Read from the screen and store in userName
        
        System.out.println("Hello, " + userName + ". We glad to have you here!"); //Output to screen
        
        
    }
    
}
