 
package CasinoPoke;
import javax.sound.sampled.*;

public class PrincipalCasinoPokemo {
    public static void main(String[] args) {
        Menu menu = new Menu();
        try {
            // Cargar el archivo de audio
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(
                    PrincipalCasinoPokemo.class.getResourceAsStream("songPokeW.wav"));
            
            // Crear el clip y reproducirlo
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            menu.setVisible(true);
            
            clip.start();
            
            
            
            // Esperar a que termine de reproducirse
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.err.println("Error al reproducir el archivo de audio: " + e.getMessage());
        }
        
        
        
    }
}


