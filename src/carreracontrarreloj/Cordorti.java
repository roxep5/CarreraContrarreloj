/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Piña
 */
 public class Cordorti  {
     ArrayList<Corredor> corredor=new ArrayList<Corredor>();
        //ArrayList<Dortia> dorti=new ArrayList<Dortia>();

    public Cordorti(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
        //this.dorti = dorti;
    }
    public Cordorti(){
        
    }

    public void ordenar(){
        Collections.sort(corredor);
           //ArrayList<Corredor> corredor2=new ArrayList<Corredor>();
        //ArrayList<Dortia> dorti2=new ArrayList<Dortia>();
        /* corredor.add(null);
         dorti.add(null);
       int t = dorti.size();
       for (int i = 2; i < t; i++) {
           for (int k = i- 1; k >= i; k--) {
               if(dorti.get(k).getTiempo() < dorti.get(k-1).getTiempo()){
                   dorti2.set(0, dorti.get(k));
                   corredor.set(0, corredor.get(k));
                   dorti.set(k, dorti.get(k-1));
                   corredor.set(k, corredor.get(k-1));
                   dorti.set(k-1, dorti.get(0));
                   corredor.set(k-1, corredor.get(0));
               }//fin if
           }// fin 2 for
       }//fin 1 for*/
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
    public void anotarCorredor(){
        
    }
    public void llegadaCorredor(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public ArrayList<Corredor> getCorredor() {
        return corredor;
    }

    public void setCorredor(ArrayList<Corredor> corredor) {
        this.corredor = corredor;
    }


    


    
}
