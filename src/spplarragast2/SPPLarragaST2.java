/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spplarragast2;
import java.util.Scanner;
/**
 *
 * @author AALS
 */
public class SPPLarragaST2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Alfredo Alejandro Lárraga Sosa A01410278 LMC 
         
        double sue;// comentario
        int he, cate;
        Scanner kb= new Scanner(System.in); 
        
        System.out.println("¿En qué categoría está el empleado que desea evaluar? (1-4)");
        cate= kb.nextInt();
        
        switch (cate){
            case 1:
                pago(30);
                break;
            case 2:
                pago(38);
                break;
            case 3:
                pago(50);
                break;
            case 4:
                pago(70);
                break;
            default:
                System.out.println("Introduzca una categoría entre 1 y 4");
                      
                
        }
     
    }
    
    static void pago(double ex){
        Scanner kb= new Scanner (System.in);
        double sue, he, sueldo; 
        
        System.out.println("Su sueldo base es de");
        sue=kb.nextDouble();
        System.out.println("¿Cuantas horas extra trabajó?");
        he=kb.nextDouble();
        
        sueldo = sue+ (ex*he);
        System.out.println("El sueldo final del empleado es"+sueldo);
    }
}
