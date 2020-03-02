package bai5;

import java.util.Scanner;

public class bai5 {
	public static void printStars(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; ++j) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
	public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}
