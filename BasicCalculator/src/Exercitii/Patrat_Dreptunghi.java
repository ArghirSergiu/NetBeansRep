
package Exercitii;
import java.util.Scanner;
public class Patrat_Dreptunghi{
	public static void main(String [] args){
       System.out.println("Introduceti latura patratului : ");
       Scanner x= new Scanner(System.in);
       int lat=x.nextInt();
       System.out.println("Perimentrul patratul este : "+4*lat);
       System.out.println("Aria  patratul este : "+lat*lat);
       System.out.println();
       System.out.println("Introduceti prima latura  a dreptungiului : ");
       Scanner prima=new Scanner(System.in);
       int a=prima.nextInt();
       System.out.println("Introduceti a doua latura  a dreptungiului : ");
       Scanner doua=new Scanner(System.in);
       int b=doua.nextInt();
       System.out.println("Perimentrul dreptunghiului este : "+2*(a+b));
       System.out.println();
       System.out.println("Aria dreptunghiului este : "+a*b);

	}
}
