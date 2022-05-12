
package matrices;
import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class metodosMatrices {
    int filas,columnas;
    Scanner entrada = new Scanner(System.in);
    int f, c, mayor, menor;
    int filaMayor, filaMenor, colMayor, colMenor;
    int[][] matriz; //definir tamaño matriz
    
    public void ingresarMatrriz(){
        System.out.println("Igrese el numero de filas ");
        filas=entrada.nextInt();
         System.out.println("Igrese el numero de columnas ");
        columnas=entrada.nextInt();
        matriz= new int[filas][columnas];
       if (filas==columnas){
         System.out.println("Ingrese los elemntos de la matriz");
                for(f=0;f<filas;f++){
                    for(c=0;c<columnas;c++){
                    System.out.print("matriz ["+f+"]["+c+"] = ");
                     matriz[f][c]=entrada.nextInt();
                    }
                }
        mostrarMatriz();
        System.out.println(sumamatriz());
           System.out.println(matrizidentidad());
        }else
            System.out.println("No es una matriz cuadrada");
   }

   public void mostrarMatriz(){
      System.out.println("La matriz ingresada es:");
        for (f = 0; f < filas; f++) { 
            for (c = 0; c < columnas; c++) {
                System.out.print(matriz[f][c] + " ");
            }
            System.out.println();
        }
    
   }
    public int sumamatriz(){
        int suma=0;
        System.out.println("La suma de los elementos de la matriz");
        for (f = 0; f < filas; f++) {
            for ( c = 0; c < columnas; c++) {
                
                suma= suma+matriz[f][c];  
            }
        }
        return suma;
    }
    public int matrizidentidad (){
       int sumad=0;
       System.out.println("La suma de la diagonal principal");
       
        for (f = 0; f < filas; f++) {
            for ( c = 0; c < columnas; c++) {
                if (f==c){
                sumad= sumad+matriz[f][c];  
                }
            }   
        }
        return sumad;
    }
    
}

