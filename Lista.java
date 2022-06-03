/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listasenlazadassimples1;

/**
 *
 * @author alumnos
 */
public class Lista {
   class Nodo{
        int info;
        //String nombre;
        Nodo sig;
    }
    
    private Nodo raiz;
    
    public Lista(){ // constructor
        raiz=null;
    }
    
    public int cantidadNodos(){
        int cantidad=0;
        Nodo recorrido=raiz;
        while(recorrido!=null){
            recorrido=recorrido.sig;
            cantidad++;
        }
        return cantidad;
    }
    
    public void insertar(int pos, int informacion){
        if(pos<=cantidadNodos()+1){
            Nodo nuevo = new Nodo();
            nuevo.info=informacion;
            if(pos==1){
                nuevo.sig=raiz;
                raiz=nuevo;
            }else{
                if(pos==cantidadNodos()+1){
                    Nodo recorrido=raiz;
                    while(recorrido.sig!=null){
                        recorrido=recorrido.sig;
                    }
                    recorrido.sig=nuevo;
                    nuevo.sig=null;
                }else{
                    Nodo recorrido=raiz;
                    for(int i=1;i<pos-2;i++)
                        recorrido=recorrido.sig;
                    Nodo siguiente=recorrido.sig;
                    recorrido.sig=nuevo;
                    nuevo.sig=siguiente;
                }       
            }
        }
    }
    
    public void mostrar(){
        Nodo recorrido=raiz;
        while(recorrido!=null){
            System.out.print(recorrido.info+"->");
            recorrido=recorrido.sig;
        }
        System.out.println();
    } 
    
    public boolean vacia(){
        if(raiz==null){
          return true;
        }else{
            return false;
        }
    
    }
    
    public boolean buscar(int elemento){
        Nodo recorrido=raiz;
        while (recorrido!=null){
            if(recorrido.info==elemento){
                return true;
            }
            recorrido=recorrido.sig;        
        }
        return false;
    }
    
    
    public int posicionMayor(){
        int mayor=raiz.info;
         int posicion=1; 
        Nodo recorrido=raiz;
        if (!vacia()){
            while(recorrido!=null){
                if(recorrido.info>mayor){
                    mayor=recorrido.info;
                    posicion=posicion+1;
                    //posicionElemento();
                }
                recorrido=recorrido.sig;
            }
            return mayor;
        }else{
            return Integer.MAX_VALUE;
        } 
    }
    
    public void posicionElemento(){
        int mayor=0;
        int posicion=1; 
        Nodo recorrido=raiz;
        if (!vacia()){
            while(recorrido!=null){
                if(recorrido.info>mayor){
                    mayor=recorrido.info;
                    posicion=posicion+1;
                }
                recorrido=recorrido.sig;
            }
            System.out.println("El elemento mayoer es:"+mayor+" y su posicion es:"+(posicion-1));
        }
    }
    
    public void ordena(){
        int tmp=0;
        Nodo recorrido=raiz;
        if (!vacia()){
        for(int i=0;i<=recorrido.info;i++){
            tmp=recorrido.info;
            int j;
            for(j=i-1;j>=0 && recorrido.info>tmp;j--){
                Nodo nuevo= recorrido.sig;
            }
        recorrido.info=tmp;
        }
    }
    }
    
    public  void borrar(int posicion){
        if(posicion<=cantidadNodos()){
            if(posicion==1){
                raiz=raiz.sig;
            }else{
                Nodo recorrido=raiz;
                for(int i=1;i<=posicion-2;i++){
                    recorrido=recorrido.sig;
                }
                Nodo proximo=recorrido.sig;
                recorrido.sig=proximo.sig;
            }
        }else{
            System.out.println("Esa posicion no existe");
        }
    }
    
    public void intercambia(int pos1, int pos2){
        if(pos1<=cantidadNodos() && pos2<=cantidadNodos()){
            Nodo recorrido1=raiz;
            for(int i=1;i<pos1;i++){
                recorrido1=recorrido1.sig;
            }
            Nodo recorrido2=raiz;
            for(int i=1;i<pos2;i++){
                recorrido2=recorrido2.sig;
            }
            int aux=recorrido1.info;
            recorrido1.info=recorrido2.info;
            recorrido2.info=aux;
        }
    }
  }
    
    

