/*
 * @author BlondelA
 * Musique en boucle
 */

package Musiques;


import javax.sound.sampled.Clip;
import tetris.Main;

public class Boucle implements Runnable{
    
    @Override
    public void run() {
        while(true){
            Main.music.getClip().loop(Clip.LOOP_CONTINUOUSLY);
            try{
                Thread.sleep(10000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
}
