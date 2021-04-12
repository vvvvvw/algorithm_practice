package designmodel.structure;

public class AdaptorMode {

    public interface MediaPlayer{
        public void play(String audioType,String fileName);
    }

    public interface ConcretMediaPlayer {
        public void play(String audioType,String fileName);
    }
    
    public interface AdvancedMediaPlayer{
        public void playMp4(String fileName);
    }
    
    
    public class MediaPlayerAdaptor implements AdvancedMediaPlayer{
        MediaPlayer MediaPlayer;
        
        @Override
        public void playMp4(String fileName) {
            MediaPlayer.play("mp4",fileName);
        }
    }
}
