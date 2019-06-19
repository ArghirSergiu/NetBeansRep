
package Exercitii;
import java.util.Scanner;
public class SumaNumere{
	public static void main(String [] args){
     System.out.println("Introduceti prima cifra : ");
     Scanner prim=new Scanner(System.in);
     double a=prim.nextDouble();
     System.out.println("Introduceti a doua cifra : ");
     Scanner dub=new Scanner(System.in);
     double b=dub.nextDouble();
     System.out.println("Suma numerelor "+a+" si "+b+"  este = "+(a+b));

	}
        public int suma (int x,int y){
            return x+y;
        }
}

