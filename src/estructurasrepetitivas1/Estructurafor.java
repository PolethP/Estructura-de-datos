/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepetitivas1;

/**
 *
 * @author alumnos
 */
import java.util.Scanner;
public class Estructurafor {
    public void forpara (){
     int n;
     int serie=3;
     Scanner entrada=new Scanner(System.in);
        System.out.println("Cuantos numeros de la serie desea:");
        n=entrada.nextInt();
        for (int i=0;i<n;i++){
            System.out.println(serie+", ");
            serie+=3;
    }
  System.out.println(" ");
}
    
}
