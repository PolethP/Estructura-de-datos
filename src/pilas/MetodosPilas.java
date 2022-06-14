
package pilas;

/**
 *
 * @author Poleth_Puetate
 */
public class MetodosPilas {
    //Creacion de la clase
    class Nodo{
        int info;
        Nodo sig;
    }
    //Declaro
    private Nodo raiz;
    //Creacion del metodo constructor
    public MetodosPilas (){
        raiz=null;
        
    }
    public void apilar (int x){
        Nodo nuevo=new Nodo();
        nuevo.info=x;
        if (raiz==null){
            nuevo.sig=null;
            raiz=nuevo;
        }else{
            nuevo.sig=raiz;
            raiz=nuevo;
        }
    }
    public void mostrar(){
        Nodo recorrido=raiz;
        while (recorrido !=null){
            System.out.println(recorrido.info);
            recorrido=recorrido.sig;
        }
    }
    public int desapilar(){
        if (raiz !=null){
            int dato=raiz.info;
            raiz=raiz.sig;
            return dato;
        }
        return 0;
    }
    public boolean vacia(){
        if (raiz == null){
            return  true;
        }else 
            return false;
    }
     public int cantidadNodos(){
        int cant=0;
         Nodo recorrido=raiz;
        while (recorrido != null){
            recorrido=recorrido.sig;
            cant++;
        }
        return cant;
     }
     public void mayor(){
        int mayor=0;
        int posicion=1;
         Nodo recorrido=raiz;
        if (!vacia()) {
            while (recorrido!=null ) {  
                if (recorrido.info>mayor) {
                    mayor=recorrido.info; 
                    posicion+=1;
                   
                }
               recorrido=recorrido.sig;
            }
            //System.out.println("");
         }
        
        System.out.println("El elemento "+mayor+" es el mayor en la posicion: "+(posicion-1));
        }
     public boolean buscar(int nota){
        Nodo recorrido=raiz;
        while(recorrido!=null){
            if (recorrido.info==nota) {
                     return true;
        }
            recorrido=recorrido.sig;
    }
       return false;
    }
   
   //Impares 
       
   
}

