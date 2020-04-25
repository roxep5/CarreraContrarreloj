/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreracontrarreloj;

import java.util.ArrayList;

/**
 *
 * @author Piña
 */
public class Cordorti {
     ArrayList<Corredor> corredor=new ArrayList<Corredor>();
        ArrayList<Dorti> dorti=new ArrayList<Dorti>();

    public Cordorti(ArrayList<Corredor> corredor, ArrayList<Dorti> dorti) {
        this.corredor = corredor;
        this.dorti = dorti;
    }
    public Cordorti(){
        
    }

    public void ordenar(){
           ArrayList<Corredor> corredor2=new ArrayList<Corredor>();
        ArrayList<Dorti> dorti2=new ArrayList<Dorti>();
         corredor.add(null);
         dorti.add(null);
       int t = dorti.size();
       for (int i = 1; i < t; i++) {
           for (int k = t- 1; k >= i; k--) {
               if(dorti.get(k).getTiempo() < dorti.get(k-1).getTiempo()){
                   dorti2.set(0, dorti.get(k));
                   corredor.set(0, corredor.get(k));
                   dorti.set(k, dorti.get(k-1));
                   corredor.set(k, corredor.get(k-1));
                   dorti.set(k-1, dorti.get(0));
                   corredor.set(k-1, corredor.get(0));
               }//fin if
           }// fin 2 for
       }//fin 1 for
    }
    public void meterdatos(){
        corredor.add(new Corredor(7,"Jose","España"));
        dorti.add(new Dorti(7,300));
        corredor.add(new Corredor(58,"Manuel","Portugal"));
        dorti.add(new Dorti(58,350));
        corredor.add(new Corredor(68,"Paco","Francia"));
        dorti.add(new Dorti(68,345));
        corredor.add(new Corredor(9,"JoseMaria","España"));
        dorti.add(new Dorti(9,250));
        corredor.add(new Corredor(1,"Pepe","Portugal"));
        dorti.add(new Dorti(1,325));
        corredor.add(new Corredor(4,"Fernando","Italia"));
        dorti.add(new Dorti(4,256));
    }
    public void mostrarclasificacion(){
        for(int i=0;i<dorti.size();i++){
            System.out.println("posicion "+i);
            System.out.println("dorsal dorti:"+dorti.get(i).getDorsal());
            System.out.println("dorsal corredor:"+corredor.get(i).getDorsal());
            System.out.println("nombre: "+corredor.get(i).getNombre());
            System.out.println("Pais :"+corredor.get(i).getNacionalidad());
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

    public ArrayList<Dorti> getDorti() {
        return dorti;
    }

    public void setDorti(ArrayList<Dorti> dorti) {
        this.dorti = dorti;
    }
    
}
