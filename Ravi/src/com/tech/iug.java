package com.tech;

public class iug {
	
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pyramid

        for (int i = 1; i <= n; i++) {
            // Print spaces for alignment
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars for this row
            for (int k = 1; k <= 1* i - 1; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


