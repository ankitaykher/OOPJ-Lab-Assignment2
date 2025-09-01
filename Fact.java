import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args) {
        // /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. 
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();  
       int fact = 1;   

        for(int i = 1; i <= n; i++) {
            fact = fact * i;   
        }

        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close(); 
        
        
    }
}