/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch9challenge7;

import java.util.*;

/**
 *
 * @author snance
 */
public class Ch9Challenge7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name, address, phone;
        int temp;
        Scanner keyboard = new Scanner(System.in);

        
        System.out.print("Please enter your first and last name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your address: ");
        address = keyboard.nextLine();

        System.out.print("Please enter your phone number: ");
        phone = keyboard.nextLine();

        Customer customer1 = new Customer(name, address, phone);
        
        System.out.print("Please enter your first and last name: ");
        name = keyboard.nextLine();

        System.out.print("Please enter your address: ");
        address = keyboard.nextLine();

        System.out.print("Please enter your phone number: ");
        phone = keyboard.nextLine();

        Customer customer2 = new Customer(name, address, phone);
        
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());
        
        
        }
    }


