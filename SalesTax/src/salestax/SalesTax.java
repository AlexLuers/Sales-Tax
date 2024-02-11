/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salestax;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SalesTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
  final double itemPrice = 23.00, taxRate = .05;
  double newPrice, salesTax;   //declaring variables
  
   
   salesTax = itemPrice * taxRate;    //calculations
   newPrice = itemPrice + salesTax;
   System.out.println("Original price is: " + String.format("%.2f",itemPrice));
   System.out.println("Salestax is: " + String.format("%.2f",salesTax));     //outputs
   System.out.println("New price is: " + String.format("%.2f",newPrice));
    }
}

        // TODO code application logic here
    