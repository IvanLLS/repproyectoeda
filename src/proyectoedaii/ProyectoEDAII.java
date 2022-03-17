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
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());                 
        }
        
        
    }
    
}
