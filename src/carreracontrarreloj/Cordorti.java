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
     private String Equipos[]={"Ford","Renault","camiseta amarilla", "celta","equipo2"};
        //ArrayList<Dortia> dorti=new ArrayList<Dortia>();

    public Cordorti(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
        //this.dorti = dorti;
    }
    public Cordorti(){
        
    }

    public void ordenarTiempo(){
        Collections.sort(corredorordenadotiempo);
           
    }
    public void meterdatos(){
        corredor.add(new Corredor(7,"Jose","España","Equipo1",300));
        //dorti.add(new Dortia(7,300));
        corredor.add(new Corredor(58,"Manuel","Portugal","Equipo1",500));
        //dorti.add(new Dortia(58,350));
        corredor.add(new Corredor(68,"Paco","Francia","Equipo1",250));
        //dorti.add(new Dortia(68,345));
        corredor.add(new Corredor(9,"JoseMaria","España","Equipo1",325));
        //dorti.add(new Dortia(9,250));
        corredor.add(new Corredor(1,"Pepe","Portugal","Equipo1",200));
       // dorti.add(new Dortia(1,325));
        corredor.add(new Corredor(4,"Fernando","Italia","Equipo1",499));
        //dorti.add(new Dortia(4,256));
         corredor.add(new Corredor(6,"Fernando","Italia","Equipo1"));
          corredor.add(new Corredor(54,"Fernando","Italia","Equipo1"));
    }
    public void mostrarclasificacion(){
        for(int i=0;i<corredor.size();i++){
            System.out.println("posicion "+i);
            //System.out.println("dorsal dorti:"+dorti.get(i).getDorsal());
            System.out.println("dorsal corredor:"+corredor.get(i).getDorsal());
            System.out.println("nombre: "+corredor.get(i).getNombre());
            System.out.println("Pais :"+corredor.get(i).getNacionalidad());
            System.out.println("Tiempo: "+corredor.get(i).getTiempo());
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("");
        }
    }
    public void mostrardorsales(){
        for(int i=0;i<corredorordenadodorsal.size();i++){
            System.out.println("posicion "+i);
            //System.out.println("dorsal dorti:"+dorti.get(i).getDorsal());
            System.out.println("dorsal corredor:"+corredorordenadodorsal.get(i).getDorsal());
            System.out.println("nombre: "+corredorordenadodorsal.get(i).getNombre());
            System.out.println("Pais :"+corredorordenadodorsal.get(i).getNacionalidad());
            System.out.println("Tiempo: "+corredorordenadodorsal.get(i).getTiempo());
            System.out.println("");
            System.out.println("------------------------");
            System.out.println("");
        }
    }
    public void datosenordenadodorsal(){
         
        for(int j=0;j<corredor.size();j++){

                corredorordenadodorsal.add(corredor.get(j));
                

          
        }
    }
    public void ordendorsal(){
        /*int maxdorsal=0;
       
        /*for(int i=1;i<corredor.size();i++){
           // System.out.println(" maximo dorsal "+maxdorsal);
        if(corredor.get(i).getDorsal()>maxdorsal){
            maxdorsal=corredor.get(i).getDorsal();
        }
    
        }
        System.out.println(" maximo dorsal "+maxdorsal);*/
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
        Scanner teclado=new Scanner(System.in);
        int dorsalx=0;
        int i;
        boolean comprobar=false;
        do{
            System.out.println("Introduzca dorsal por favor,");
        dorsalx=teclado.nextInt();
            
        corredor.indexOf(dorsalx);
        for(i=0;i<corredor.size();i++){
        if(corredor.get(i).getDorsal()==dorsalx){
            comprobar=true;
            break;
        }
        
    }
        }while(comprobar==false);
        System.out.println("Introduzca tiempo por favor,");
        int tiempox=teclado.nextInt();
        corredor.get(i).setTiempo(tiempox);
    }
    
    
    public ArrayList<Corredor> getCorredor() {
        return corredor;
    }

    public void setCorredor(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
    }


    


    
}
