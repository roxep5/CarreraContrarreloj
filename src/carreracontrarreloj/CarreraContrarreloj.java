/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Piña
 */
public class CarreraContrarreloj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
         int opcion=0;
        opcion=teclado.nextInt();
        ArrayList<Corredor> corredor=new ArrayList<Corredor>();
        ArrayList<Dorti> dorti=new ArrayList<Dorti>();
        Cordorti cordorti=new Cordorti();
        Menu menu=new Menu();
        //cordorti.ordenar();
        cordorti.meterdatos();
        switch(opcion){
            case 1:
                cordorti.mostrarclasificacion();
                System.out.println("hola");
                break;
            case 3:
               cordorti.llegadaCorredor();
                
        }
    }
    
}
