/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author asus
 */
public interface Subject {
    //public void update();
    public void attach(Notificar notificar);
    public void dettach(Notificar notificar);  
    public void notificar( );
}
