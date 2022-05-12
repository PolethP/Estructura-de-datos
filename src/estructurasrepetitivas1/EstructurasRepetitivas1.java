/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructurasrepetitivas1;

import java.util.Scanner;

/**
 *
 * @author alumnos
 */
public class EstructurasRepetitivas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner entrada=new Scanner(System.in);
        System.out.println(".........MENU...........");
         System.out.println("1.Estructuras Do-While");
         System.out.println("2.Estructuras While");
         System.out.println("3.Estructuras For");
         System.out.println("4.Estructuras Anidadas");
         System.out.print("Elija una opcion:");
         n=entrada.nextInt();
         switch (n) {
            case 1:
                 System.out.println(".......Estructuras Do-While.......");
                 EstructuraDoWhile doWhile=new EstructuraDoWhile();
                 doWhile.DoWhile();
                break;
            case 2:
                 System.out.println("........Estructuras While.......");
                 EstructuraWhile em=new EstructuraWhile();
                 em.mientras();
                 break;
            case 3:
                System.out.println(".........Estructuras For..........");
                Estructurafor fp=new Estructurafor();
                fp.forpara();
                break;
            case 4:
                System.out.println("........Estructuras Anidadas.......");
                EstructurasAnidadas ea=new EstructurasAnidadas();
                ea.anidado();
            default:
                System.out.println("Ingrese una opcion del menu");
        }  
    }
    
}
