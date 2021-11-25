import java.io.File;
import javax.sound.sampled.*;
public class MusicQB {
    private Clip clip;
    public MusicQB(String filename) {
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(new File(filename));
            AudioFormat format = ais.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format, ((int) ais.getFrameLength() * format.getFrameSize()));
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(ais);
            FloatControl gainControl = (FloatControl) clip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(1.0F);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void play() {
        clip.start();
    }
    public void stop() {
        clip.stop();
    }
}
