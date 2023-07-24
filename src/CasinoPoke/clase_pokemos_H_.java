/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CasinoPoke;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Corella
 */
public class clase_pokemos_H_ extends Thread {

    private String nombre, pokiSelect;
    private JLabel label;
    private Random randi = new Random();
    private static boolean flag = false;

    public clase_pokemos_H_(String nombre, JLabel label) {
        this.nombre = nombre;
        this.label = label;
    }

    
    public String getpokiSelect (){
        return pokiSelect;
    }
    //Este metodo es el que elige entre las imagenes,de 1 a 6
    public void random() {

        int n = randi.nextInt(6) + 1;

        switch (n) {
            case 1:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/charizar.png")));
                pokiSelect = "charizar";
                break;

            case 2:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/eevee.png")));
                pokiSelect = "evee";
                break;

            case 3:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/meowth.png")));
                pokiSelect = "meowth";
                break;

            case 4:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/pikachu.png")));
                pokiSelect = "pikachu";
                break;

            case 5:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/psyduck.png")));
                pokiSelect = "psyduck";
                break;

            case 6:
                label.setIcon(new ImageIcon(getClass().getResource("/Imagenes/snorlax.png")));
                pokiSelect = "snorlax";
                break;
        }

    }

    public void run() {

        do {
            try {

                Thread.sleep(50);
                random();

            } catch (InterruptedException ex) {
                Logger.getLogger(clase_pokemos_H_.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (flag != true);
    }
    
    
}
