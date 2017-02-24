/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemat;

/**
 *
 * @author Juan Camilo
 */
public class Juego1 implements Juego{
    
    boolean lectura;
    
    
    public void promedio(){
        lectura = false;
    }

    public boolean isLectura() {
        return lectura;
    }

    public void setLectura(boolean lectura) {
        this.lectura = lectura;
    }
    
    
}
