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
        
       // ArrayList<Corredor> corredor=new ArrayList<Corredor>();
 
        Cordorti cordorti=new Cordorti();
        cordorti.meterdatos();
        do{
        Menu menu=new Menu();
        Menu.mostrar();
        opcion=teclado.nextInt();
        
       
        switch(opcion){
            case 1:
                cordorti.ordenarTiempo();
                cordorti.mostrarclasificacion();
                System.out.println("hola");
                break;
            case 3:
               cordorti.llegadaCorredor();
               break;
            case 5:
                cordorti.mostraruncorredor();
                break;
            case 7:
               cordorti.datosenordenadodorsal();
               cordorti.ordendorsal();
               cordorti.mostrardorsales();
               break;
            case 8:
                cordorti.mostrarequipos();
                break;
            case 9:
                cordorti.mostrarinfoequipo();
                break;
        }
        }while(opcion!=99);
    }
    
}
