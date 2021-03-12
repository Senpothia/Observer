
 package testlistener;

import java.util.EventListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.EventListenerList;


public class Compteur {
    
    private int valeur = 0;
    private final EventListenerList listenersList = new EventListenerList();

    public Compteur() {
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }
    
    
    public void compter(){
    
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Compteur.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        valeur++;
    
    }
    
    
    public void addCompteurListener(CompteurListener listener) {
    listenersList.add(CompteurListener.class, listener);
    }
    
    
    public void removeCompteurListener(CompteurListener listener) {
    listenersList.remove(CompteurListener.class, listener);
    }

    public EventListenerList getCompteurListeners() {
        return listenersList;
    }
    
    protected void fireCompteurChanged(int valeur) {
        
        Object[] listeners = listenersList.getListenerList();
        for(int i=0; i<listeners.length; i++) { 
      // (CompteurListener)listeners[i].compteurChanged(valeur);

    }


}
    
  
}
