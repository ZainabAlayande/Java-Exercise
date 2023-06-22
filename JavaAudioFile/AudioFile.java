package JavaAudioFile;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class AudioFile {

    public static void main(String[] args) {

        try {
            File file = new File("asake.mp3");
            AudioInputStream stream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();

            // sleep to allow enough time for the clip to play
            Thread.sleep(500);

            stream.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
