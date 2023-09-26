package pkg5.precios.y.total.a.pagar;
import java.util.Scanner;
public class PreciosYTotalAPagar {
    public static void main(String[] args)
    {
       Scanner leer=new Scanner(System.in);
       float n1, n2, n3, n4, n5, r;
       System.out.println("Ingresa primer precio: ");
       n1=leer.nextFloat();
       System.out.println("Ingresa segundo precio: ");
       n2=leer.nextFloat(); 
       System.out.println("Ingresa tercer precio: ");
       n3=leer.nextFloat();
       System.out.println("Ingresa cuarto precio: ");
       n4=leer.nextFloat();
       System.out.println("Ingresa quinto precio: ");
       n5=leer.nextFloat();
       r=(n1+n2+n3+n4+n5);
       System.out.print("La suma total es: "+r);
    }  
}
