/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoedaii;

/**
 *
 * @author Mateo
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ProyectoEDAII {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) throws FileNotFoundException{
        File documento= new File("C:\\Users\\Mateo\\Music\\POO\\ProyectoPOO\\POO.txt");
        Scanner sc=new Scanner(documento);
        Scanner scan=new Scanner(System.in);
        while(sc.hasNextLine())
        System.out.println(sc.nextLine());  
        System.out.println("Ingrese la opcion a la que desea acceder:");
        System.out.println("1...Archivo nombres");
        System.out.println("2...Archivo números");
        int selec=scan.nextInt();
        switch(selec){
            case 1:
            System.out.println("Seleccione el metodo con el que desea ordenar los elementos");
            System.out.println("1...Polifase");
            System.out.println("2...Mezcla equilibrada");
            int selecc=scan.nextInt();
            switch(selecc){
                case 1: System.out.println();
                break;
                case 2: System.out.println();
                break;
                default: System.out.println("Opcion incorrecta");
                break;
                
            }
            break;
            case 2:
            System.out.println("Elija el metodo con el que desea ordenar los elementos");
            System.out.println("1...Polifase");
            System.out.println("2...Mezcla equilibrada");
            System.out.println("3...RadixSort");
            int selecci=scan.nextInt();
                switch(selecci){
                case 1: System.out.println();
                break;
                case 2: System.out.println();
                break;
                case 3: System.out.println();
                break;
                default: System.out.println("Opcion incorrecta");
                break;
            }
            break;
        }
        
        //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
    }
}