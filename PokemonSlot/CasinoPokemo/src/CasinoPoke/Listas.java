/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasinoPoke;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Corella
 */
public class Listas {

    String nombre;
    String apellido;
    int ID;

    public Listas(String nombre, String apellido, int ID) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    

}
