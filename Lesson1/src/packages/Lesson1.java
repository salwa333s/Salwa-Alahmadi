package packages; 

import java.util.Scanner;
public class Lesson1{
  
    public static void main(String[] args)
    {
       
        double num1, num2;
  
       
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the first num");
  
               num1 = sc.nextDouble();
               System.out.println("Enter the second num");
               num2 = sc.nextDouble();
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
  
        // add 
        case '+':
  
            o = num1 + num2;
  
            break;
  
        // subtract 
        case '-':
  
            o = num1 - num2;
  
            break;
  
        // multiply 
        case '*':
  
            o = num1 * num2;
  
            break;
  
        // divide
        case '/':
  
            o = num1 / num2;
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
  
        System.out.println("The final result:");
  
        System.out.println();
  
               System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    }
}