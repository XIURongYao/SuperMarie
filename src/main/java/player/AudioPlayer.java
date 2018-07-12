package player;

import javazoom.jl.decoder.JavaLayerError;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;
import jdk.nashorn.internal.runtime.linker.JavaAdapterFactory;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 */
public class AudioPlayer {

    Player player;
    File music;
    //构造方法， 参数是一个.mp3文件
    public AudioPlayer(File file){
        this.music = file;
    }

    //播放方法
    public void play() throws FileNotFoundException,JavaLayerException{
        BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(music));
        player = new Player(buffer);
        player.play();
    }
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
        File file = new File("src/main/resources/Mp3/FunnyRabbit.mp3");
        new AudioPlayer(file).play();
    }
}
