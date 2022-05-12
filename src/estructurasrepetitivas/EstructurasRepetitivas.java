
package estructurasrepetitivas;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class EstructurasRepetitivas {

  
    public static void main(String[] args) {
       int contador =0;
       int acumulador=0;
       int n;
       Scanner entrada=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros naturales a sumar:");
        n =entrada.nextInt();
        do{
            ++contador;
            acumulador+=contador;
        } while (contador<n) ;            
        System.out.println("El numero de numeros sumados es "+contador);
        System.out.println("la suma es :"+acumulador );
        
        }
    
}

