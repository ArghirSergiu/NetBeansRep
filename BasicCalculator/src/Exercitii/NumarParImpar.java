
package Exercitii;
import java.util.Scanner;
public class NumarParImpar{
	public static void main (String [] args){
        int b=0;
		Scanner par = new Scanner(System.in);
		System.out.println("Cite cifre Pare doriti sa afisati ? ");
		int num = par.nextInt();	
		  for(int i = 1; b < num; i++){
		    if(i % 2 == 0){
		    b++;
		System.out.print(i +"  "); 
     }
   }
        System.out.println();
        int q=0;
		Scanner imp = new Scanner(System.in);
		System.out.println("Cite cifre Impare doriti sa afisati ? ");
		int n = imp.nextInt();	
		  for(int i = 1; q < n; i++){
		    if(i % 2 == 1){
		    q++;
		System.out.print(i +"  "); 
   }
 }
 }
}