/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testlistener;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author michel
 */
public class Compteur2 implements Runnable {
    
    private String news;

    private PropertyChangeSupport support;

    public Compteur2() {
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {
        support.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {
        support.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        support.firePropertyChange("news", this.news, value);
        this.news = value;
    }
    
    
   

    @Override
    public void run() {
        
        int valeur = 0;
        while(valeur < 1000){
            
               
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Compteur2.class.getName()).log(Level.SEVERE, null, ex);
            }
            valeur++;
            setNews(String.valueOf(valeur));
            System.out.println("news: " + this.news);
        
        
    }
       
            
     
    }
    
    
    
}
