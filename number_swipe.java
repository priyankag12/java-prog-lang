package javapractice;
import java.util.*;

class number_swipe {  
    public static void main(String[] args) {  
       int x, y, t;// x and y are to swap   
       Scanner sc = new Scanner(System.in); 
       
       //Scanner: This is a class in the java.util package that is used to read input of various types.
       //sc: This is the name of the Scanner object.
       //new Scanner(System.in): This creates a new Scanner object that reads input from System.in,
       //which is the standard input stream (usually the keyboard).
       
       System.out.println("Enter the value of X and Y");  
       x = sc.nextInt();  
       y = sc.nextInt();  
       System.out.println("before swapping numbers: "+x +"  "+ y);  
       /*swapping */  
       t = x;  
       x = y;  
       y = t;  
       System.out.println("After swapping: "+x +"   " + y);  
       System.out.println( );  
    }    
} 
