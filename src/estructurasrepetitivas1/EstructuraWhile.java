/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepetitivas1;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class EstructuraWhile {
    public void mientras (){
        int cont=1;
        float total=0;
        float sueldo;
        float prom;
        Scanner entrada=new Scanner(System.in);
        while (cont<=10){
            System.out.print("Ingrese el sueldo del trabajador"+cont+": ");
            sueldo=entrada.nextInt();
            total+=sueldo;
            ++cont;
        }
        System.out.println("El total de sueldos es: "+total);
        prom=total/10;
        System.out.println("El promedio de sueldo es:"+prom);
    }
}
