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
    
    int lectura;
    int discriminacion;
    int conteo;
    int descomposicion;
    
    
    public void promedio(){
        lectura = 0;
        discriminacion = 0;
        conteo = 0;
        descomposicion = 0;
    }
    //Lectura
    public int getLectura() {
        return lectura;
    }

    public void setLectura(int lectura) {
        this.lectura = lectura;
    }
    
    //Discriminación
    public int getDiscriminacion() {
        return discriminacion;
    }
    
    public void setDiscriminacion(int discriminacion) {
        this.discriminacion = discriminacion;
    }
    
    //Conteo
    public int getConteo() {
        return conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    
    //Descomposición
    public int getDescomposicion() {
        return descomposicion;
    }

    public void setDescomposicion(int descomposicion) {
        this.descomposicion = descomposicion;
    }
}
