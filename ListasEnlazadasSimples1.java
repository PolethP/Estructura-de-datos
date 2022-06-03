/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadassimples1;

/**
 *
 * @author alumnos
 */
public class ListasEnlazadasSimples1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Lista enlazada simple");
        Lista les=new Lista();
        les.insertar(1, 10);
        les.insertar(2, 20);
        les.insertar(3, 40);
        les.insertar(4, 30);
        les.insertar(5, 15);
        les.mostrar();
        if(les.buscar(20)){
            System.out.println("El elemento, si existe en la lista ");
        }else{
            System.out.println("El elemento, no si existe en la lista ");
        }
        //System.out.println(les.posicionMayor());
       // les.posicionElemento();
        //les.borrar(1);
        //les.borrar(3);
        //les.mostrar();
        //les.intercambia(2, 5);
       // les.mostrar();
        les.ordena();
    }

    

  
    
}
