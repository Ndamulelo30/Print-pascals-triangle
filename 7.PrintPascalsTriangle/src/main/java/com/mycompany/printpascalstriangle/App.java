/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.printpascalstriangle;

/**
 *
 * @author Sanele
 */

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of rows for Pascal's triangle:");
        int numRows = scanner.nextInt();
        
        // Print Pascal's triangle
        printPascalsTriangle(numRows);
        
        scanner.close();
    }
    
    public static void printPascalsTriangle(int numRows) {
        for (int i = 0; i < numRows; i++) {
            // Print spaces for alignment
            for (int j = 0; j < numRows - i; j++) {
                System.out.print(" ");
            }
            
            // Calculate and print values for current row
            int num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            
            System.out.println();
        }
    
    }
}
