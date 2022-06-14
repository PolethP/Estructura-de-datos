
package pilas;

import java.util.Scanner;

/**
 *
 * @author Poleth_Puetate
 */
public class Pilas {

    
    public static void main(String[] args) {
        Scanner ingreso=new Scanner(System.in);
        int dato;
        MetodosPilas ms=new MetodosPilas();
        if (ms.vacia()){
            System.out.println("La pila esta vacia");
        }else{
            System.out.println("La pila tiene elementos");
        }
        ms.apilar(23);
        ms.apilar(89);
        ms.apilar(10);
        ms.apilar(6);
        ms.apilar(110);
        ms.mostrar();
        ms.mayor();
        System.out.println("............Desencolar..........");
        System.out.println("Se borra el elemento "+ms.desapilar());
        //System.out.println("Se borra el elemento "+ms.desapilar());
        ms.mostrar();
        System.out.println("La pila tiene "+ms.cantidadNodos()+" nodos");
        System.out.println(" ");
        System.out.println("...........Existe-No existe...........");
        System.out.print("Ingrese el numero que desea buscar: ");
        dato=ingreso.nextInt();
        if (ms.buscar(dato)){
            System.out.println(" Si Existe en la pila");
        }else{
            System.out.println("No existe en la pila");
        }
    }
    
}
