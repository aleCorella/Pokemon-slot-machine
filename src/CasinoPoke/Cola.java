/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasinoPoke;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;

/**
 *
 * @author Corella
 */
public class Cola {

    static Queue<Listas> colaData = new LinkedList();
    static Queue<Listas> colaCash = new LinkedList();
    public void addList(String nombre, String apellido, int id) {
        colaData.add(new Listas(nombre, apellido, id));
    }

    public Listas seeList() {
        return colaData.peek();
    }

    public void mostrarParticipantes() {
        String participantes = "";
        for (Listas lista : colaData) {
            participantes += "Name: " + lista.getNombre() + "\nLastname: " + lista.getApellido() + "\nID: " + lista.getID() + "\n\n";
        }
        JOptionPane.showMessageDialog(null, participantes);
    }
    
    

}
