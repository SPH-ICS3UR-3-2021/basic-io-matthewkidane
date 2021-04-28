/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import java.util.Scanner;

/**
 *
 * @author k_zeb
 */
public class Main {
    public static void main(String[] args){
       
        Scanner console = new Scanner(System.in);
        System.out.print("Hello, what is your name?");
        String name=console.nextLine();
        System.out.println("Okay buddy, what is your age?");
        
      
        int age = console.nextInt();
        System.out.println("Hello " + name + " who is " + age + " years old ");
        
        
        
    }
    
}
