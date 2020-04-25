/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

import java.util.Scanner;

/**
 *
 * @author Piña
 */
public class Menu {
    static Scanner teclado=new Scanner(System.in);
    
    public static void mostrar(){
        System.out.println("Elige una opcion, 99 para salir:");
        System.out.println("--------------------------------");
        System.out.println("");
        System.out.println("1 - Mostrar la clasificación");
        System.out.println("3 - Llegada de un corredor");
        System.out.println("5 – Mostrar información de un corredor ");
        System.out.println("7 - Mostrar la lista de corredores");
        System.out.println("8 – Mostrar los equipos participantes");
        System.out.println("9- Mostrar información de un equipo");
        System.out.println("99- Salir del programa");
        System.out.println("");
            
        
        
        }
    /*private static int elegiropcion(){
        int opcionpedida=teclado.nextInt();
        return opcionpedida;
    }
    public static void todoElMenu(){
        mostrar();
        opcion=elegiropcion();
        switch(opcion){
            case 0:
        }
    }*/
}
