
package Exercitii;
import java.util.Scanner;

public class Fibonacci{
  public static void main (String [] args){
  	 System.out.println("Introduceti cite numere Fibonacci doriti a generati : ");
  	 Scanner num= new Scanner(System.in);
     int count=num.nextInt(); 
     int  n1 = 0 ,n2 = 1;
     System.out.print("Numerele Fibonacci de " + count + " ori  : ");
        for (int i = 0; i <= count; ++i){
          System.out.println(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
  }
}
}
