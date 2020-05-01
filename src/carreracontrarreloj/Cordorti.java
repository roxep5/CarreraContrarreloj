/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Piña
 */
 public class Cordorti  {
     private ArrayList<Corredor> corredor=new ArrayList<Corredor>();
     private ArrayList<Corredor> corredorordenadotiempo=new ArrayList<Corredor>();
     private ArrayList<Corredor>  corredorordenadodorsal=new ArrayList<Corredor>();
     private String Equipos[][]={{"Force India","FEC"},{"Renault","Ren"},{"camiseta amarilla","cam"},{"celta","Cel"},{"equipo2","e2"}};
      Scanner teclado=new Scanner(System.in);
        //ArrayList<Dortia> dorti=new ArrayList<Dortia>();

    public Cordorti(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
        //this.dorti = dorti;
    }
    public Cordorti(){
        
    }

    public void ordenarTiempo(){
        Collections.sort(corredor);
           
    }
    public void meterdatos(){
        corredor.add(new Corredor(7,"Jose","España",Equipos[4][0],300));
        
        corredor.add(new Corredor(58,"Manuel","Portugal",Equipos[0][0],500));
        corredor.add(new Corredor(68,"Paco","Francia",Equipos[3][0],250));
        corredor.add(new Corredor(9,"JoseMaria","España",Equipos[2][0],325));
        corredor.add(new Corredor(1,"Pepe","Portugal",Equipos[0][0],200));
        corredor.add(new Corredor(4,"Fernando","Italia",Equipos[3][0],499));
        corredor.add(new Corredor(6,"Fernando","Italia",Equipos[2][0]));
        corredor.add(new Corredor(54,"Fernando","Italia",Equipos[4][0]));
    }
    public void mostrarclasificacion(){//mostramos la clasificacion
        for(int i=0;i<corredor.size();i++){
            System.out.println("posicion "+i);
            //System.out.println("dorsal dorti:"+dorti.get(i).getDorsal());
            System.out.println("dorsal corredor:"+corredor.get(i).getDorsal());
            System.out.println("nombre: "+corredor.get(i).getNombre());
            System.out.println("equipo: "+corredor.get(i).getEquipo());
            System.out.println("Pais :"+corredor.get(i).getNacionalidad());
            System.out.println("Tiempo: "+corredor.get(i).getTiempo());
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("");
        }
    }
    public void mostrardorsales(){
        for(int i=0;i<corredorordenadodorsal.size();i++){
            mostrardorsales2(i);
        }
    }
    public void mostrardorsales2(int i){
        System.out.println("posicion "+i);
            //System.out.println("dorsal dorti:"+dorti.get(i).getDorsal());
            System.out.println("dorsal corredor:"+corredorordenadodorsal.get(i).getDorsal());
            System.out.println("nombre: "+corredorordenadodorsal.get(i).getNombre());
            System.out.println("Pais :"+corredorordenadodorsal.get(i).getNacionalidad());
            System.out.println("Tiempo: "+corredorordenadodorsal.get(i).getTiempo());
            System.out.println("Equipo: "+corredorordenadodorsal.get(i).getEquipo());
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("");
    }
    public void datosenordenadodorsal(){
         corredorordenadodorsal.clear();//borramos todos los datos
        for(int j=0;j<corredor.size();j++){

                corredorordenadodorsal.add(corredor.get(j));//ingresamos los datos
                

          
        }
    }
    public int dorsalmaximo(){
        int maxdorsal=0;
       
        for(int i=1;i<corredor.size();i++){
           // System.out.println(" maximo dorsal "+maxdorsal);
        if(corredor.get(i).getDorsal()>maxdorsal){
            maxdorsal=corredor.get(i).getDorsal();
        }
        
    }
        return maxdorsal;
    }
    public void mostraruncorredor(){
       datosenordenadodorsal();
       System.out.println("por favor introduzca dorsal");
        int opcion=teclado.nextInt();//pedimos el dorsal:
        int i;
        boolean comprobar=false;//comprueba si el dorsal esta en el araylist
        for(i=0;i<corredor.size();i++){
            if(corredor.get(i).getDorsal()==opcion){
                comprobar=true;
                break;
            }
            
        }
        if(comprobar){
            mostrardorsales2(i);
        }else{
            System.out.println("Lo sentimos ese drosal no esta asociado a ningun corredor");
        }
        
    }
    public void ordendorsal(){

        
        int ultimo=0;// para controlar cual fue el ultimo dorsal. lo incializamos a 0 porque no puede haber menos de 1
        
             for(int i=0;i<(corredor.size()-1);i++){
      for(int k=0;k<(corredor.size()-1);k++){
                

        if(corredorordenadodorsal.get(k).getDorsal()>corredorordenadodorsal.get(k+1).getDorsal()){
                Corredor aux=corredorordenadodorsal.get(k+1);
                corredorordenadodorsal.set(k+1,corredorordenadodorsal.get(k));
                corredorordenadodorsal.set(k, aux);
            }
 }
        }
       
    }
    public void anotarCorredor(){
        
    }
    public void llegadaCorredor(){
        //int maxdorsal=dorsalmaximo();
        Scanner teclado=new Scanner(System.in);
        int dorsalx=0;
        int i;
        boolean comprobar=false;//comprueba si esta el numero
        
        boolean comprobartiempo=false;//comprueba si tiene tiempoo no
        do{
            System.out.println("Introduzca dorsal por favor,");
        dorsalx=teclado.nextInt();
            
        corredor.indexOf(dorsalx);
        for(i=0;i<corredor.size();i++){
        if(corredor.get(i).getDorsal()==dorsalx){
            if(corredor.get(i).getTiempo()==-1){
                comprobar=true;
                comprobartiempo=true;
                break;
            }else if(corredor.get(i).getTiempo()!=-1){
                comprobar=true;
                comprobartiempo=false;
                break;
            }
            
        }
        
    }
        }while(comprobar==false);
        if(comprobartiempo){
        //System.out.println("Introduzca tiempo por favor,");
        int tiempox;
        do{
            System.out.println("Introduzca tiempo por favor,");
        tiempox=teclado.nextInt();
        }while(tiempox<0);
        corredor.get(i).setTiempo(tiempox);
        }else if(comprobartiempo==false){
            System.out.println("esta personas ya llegó");
        }
    }
    public void mostrarequipos(){
        for(int i=0;i<Equipos.length;i++){
            
                System.out.println(" Equipo "+Equipos[i][0]+" nombre acortado \""+Equipos[i][1]+"\"");
            
        }
    }
    public void mostrarinfoequipo(){
        System.out.println("introduzca equipo: ");
        String equipod=teclado.nextLine();
        for(int i=0;i<corredor.size();i++){
            if(equipod.equals(corredor.get(i).getEquipo())){
               mostrardorsales2(i);
            } 
        }
    }
    
    public ArrayList<Corredor> getCorredor() {
        return corredor;
    }
    
    public void setCorredor(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
    }


    


    
}
