/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectoresmatricesparalelos;

import java.util.Scanner;


/**
 *
 * @author alumnos
 */
public class Metodos {
     private Scanner entrada;
     private String[] estudiantes;
     private int [][] notas;
     public void cargar (){
         entrada =new Scanner(System.in);
         estudiantes=new String [2];
         notas=new int [2][3];
         for (int f = 0; f <estudiantes.length; f++) {
             System.out.println("ingrese el nombre del estudiante");
             estudiantes[f]= entrada.next();
             for (int c = 0; c < notas[f].length; c++) {
                 System.out.println("Ingrese la nota de la asignatura:"+(c+1));
                 notas[f][c]=entrada.nextInt();
             }
         }
         
     }
     public void mostrar (){
         System.out.println("......Notas de los Estudiantes......");
         System.out.println("Estudiante\tEd\t\tPoo\t\tisc");
         for (int f = 0; f < estudiantes.length; f++) {
                System.out.print("\n"+estudiantes [f]);
             for (int c = 0; c < notas[f].length; c++) {
                 System.out.print("\t\t"+notas[f][c]);
             }
             
         }
     }
      public void promedio(){
        promedionotas=new double[2];
        for (int f = 0; f < notas.length; f++) {
            int suma=0;
            for (int c = 0; c <notas [f].length; c++) {
                suma=suma+notas [f][c];
             
            }
            promedionotas [f]=suma/notas[f].length;
        }
    }
    public void imprimirPromedio (){
        System.out.println(".........El promedio de cada estudiante es............");
        for (int i = 0; i < promedionotas.length; i++) {
            System.out.println(estudiantes[i]+" \t"+promedionotas[i]);
        }
    }  
     public void promedioAsignatura (){
        System.out.println("........ Promedio de la Asignatura..........");
        for (int c = 0; c < 3; c++) {
            double suma=0;
            System.out.println("");
            for (int f = 0; f < 2; f++) {
               suma=suma+notas [f][c];
            }
            System.out.println(suma/notas.length);
            
        }
         System.out.println(" ");
            
        }
    public void notamayor (){
        int mayor=0;
        String nombre=estudiantes [0];
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c <notas [f].length; c++) {
                if (notas[f][c]>mayor){
                    mayor=notas[f][c];
                    nombre=estudiantes [f];
                }
            }
 
        }
        System.out.println("El estudiante con mayor nota es "+nombre);
    }
}
