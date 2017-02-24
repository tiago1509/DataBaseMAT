/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemat;

public class Juego3 implements Juego{
    int conteo;
    
    public void promedio() {
        conteo = 0;
    }
    
    //Conteo
    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
}
