
package Exercitii;
import java.util.Scanner;
public class Litera{
  public static void main ( String  []  args) {
    final String a ="A",b="B",c="C",d="D",e="E",f="F",g="G",h="H",i="I",j="J",k="K",l="L",m="M",n="N",o="O",p="P",q="Q",r="R",s="S",t="T",u="U",v="V",w="W",x="X",y="Y",z="Z";
      System.out.println("Introduceti o litera: ");
      Scanner lit =new Scanner(System.in);
      String litera=lit.nextLine();
      switch (litera){
        case a:
        case e:
        case i:
        case o:
        case u:
        System.out.println("Litera introdusa este o vocala" );
        break;
        default:
        System.out.println("Litera introdusa este o consoana");
      }
    }}