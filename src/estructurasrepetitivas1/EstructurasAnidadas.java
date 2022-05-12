/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructurasrepetitivas1;

/**
 *
 * @author alumnos
 */
public class EstructurasAnidadas {
    public void anidado (){
        System.out.println("Tabla de multiplcar del 1 al 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println("Tabla del"+i);
            for (int j = 1 ;j <= 10; j++) {
                System.out.println(i+"*"+j+"="+i*j);
            }
        }
    }
}
