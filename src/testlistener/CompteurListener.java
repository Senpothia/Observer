
package testlistener;

import java.util.EventListener;


public interface CompteurListener extends EventListener{
    
    void compteurChanged(int valeur);
    
}
