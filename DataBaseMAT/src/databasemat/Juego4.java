/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databasemat;

public class Juego4 implements Juego{

    int descomposicion;
    
    public void promedio() {
        descomposicion = 0;
    }
    
    //Descomposicion
    public int getDescomposicion() {
        return descomposicion;
    }
    
    public void setDescomposicion(int descomposicion) {
        this.descomposicion = descomposicion;
    }
    
}
