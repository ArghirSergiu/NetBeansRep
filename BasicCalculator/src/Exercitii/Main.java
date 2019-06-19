package Exercitii;
import java.util.Scanner;

public class Main {
    public static void main (String []args){
        System.out.println("_____Alegeti o optiune de jos :_____ ");
        System.out.println("1.Suma a doua numere");
        System.out.println("2.Numar par/impar");
        System.out.println("3.Sir de numere Fibonacci");
        System.out.println("4.Consoana sau Vocala");
        System.out.println("5.Perimetru si aria patratului ");
        System.out.println("6.Perimetru si aria dretpunghiului ");
        Scanner scanner=new Scanner(System.in);
        int option =scanner.nextInt();
        switch(option){
                case 1:
                    System.out.println("Introdu primul numar : ");
                    int x=scanner.nextInt();
                    System.out.println("Introdu al doilea numar : ");
                    int y = scanner.nextInt();
                    SumaNumere calc = new SumaNumere();
                    int sum= calc.suma(x,y);
                    System.out.println("Suma este :" + sum );
                break;
                case 2:
                    System.out.println("Cite numere pare doriti sa afisati : ");
                    int b= scanner.nextInt();
                    NumarParImpar par= new NumarParImpar();
                    int numerePare= par.numarPar( b);
                   
                break;
                case 3:
                     System.out.println("Cite numere Fibonacci doriti sa afisati : ");
                     int sir= scanner.nextInt();
                     Fibonacci fi=new Fibonacci();
                     int fib=fi.fibo(sir);
                break;
                case 4:
                    System.out.println("Introdu o litera : ");
                    String lit=scanner.next();
                    Litera l= new Litera();
                    String lita= l.litera(lit);
                    System.out.println(lit);
                break;
                case 5:
                    System.out.println("Introduceti latura patratului: ");
                    int lat =scanner.nextInt();
                    Patrat_Dreptunghi per =new Patrat_Dreptunghi();
                    int perim= per.perimetruPat(lat);
                    System.out.println("Perimetrul patratului este :" +perim);
                    
                    Patrat_Dreptunghi ar =new Patrat_Dreptunghi();
                    int aria= ar.ariaPat(lat);
                    System.out.println("Aria patratului este :" +aria);
                    break;
                case 6:
                     System.out.println("Introdu prima latura : ");
                    int a=scanner.nextInt();
                    System.out.println("Introdu a doua latura : ");
                    int c = scanner.nextInt();
                    Patrat_Dreptunghi adrep =new Patrat_Dreptunghi();
                    int ariaD= adrep.ariaDrep(a,c);
                    System.out.println("Aria dreptungiului este : " + ariaD );
                    
                    Patrat_Dreptunghi perd=new Patrat_Dreptunghi();
                    int perD= perd.perimetruDrep(a,c);
                    System.out.println("Perimetru dreptungiului este : " + perD );
                    
                break;
                default:
                    System.out.println("Nu exista asa optiune !!");
        }
                    
                    
        
    
    }
    
}
