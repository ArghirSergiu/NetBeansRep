
package Exercitii;
//import java.util.Scanner;

public class Fibonacci{
  public int fibo(int num){
     int  n1 = 0 ,n2 = 1;
     System.out.print("Numerele Fibonacci de " + num + " ori  : ");
        for (int i = 0; i < num; ++i){
          System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
  }
      return n1;
}
}
