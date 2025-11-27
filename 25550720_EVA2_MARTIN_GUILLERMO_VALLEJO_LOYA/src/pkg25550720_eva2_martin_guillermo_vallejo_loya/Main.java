
package pkg25550720_eva2_martin_guillermo_vallejo_loya;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
     int noprimo,noprimo2;
    int quequieres;
    while(true){
              
       
    System.out.print("que quieres imprimir 1=numeros primos,  2=numeros no primos  ");
    quequieres= captu.nextInt();
  
     int primos, primos2;
     switch (quequieres) {
            case 1:
             System.out.print("cual sera tu numero a elegir "); //numeros primos
               primos= captu.nextInt(); 
             primos2=primos%3;
              for (int i = 0; i <= primos; i++) {                            
            for (int j = 1; j <= primos2; j++) {
                System.out.print(j + "*");
            }
            System.out.println();
        }
                break;
            case 2:
               
               System.out.print("cual sera tu numero a elegir "); //numeros  no primos
              
             noprimo= captu.nextInt();   
              
            for (int i = 0; i <= noprimo; i++) {                            
            for (int j = 1; j <= i; j++) {
                System.out.print("*" +j );
            }
            System.out.println("");
        }
                break;
            case 3:
               
                break;
        

    }
}
}
}