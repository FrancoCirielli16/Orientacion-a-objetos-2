package Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class MediaPlayer {
	
	private List<Media> media;
	
	
	public MediaPlayer() {
		this.media = new ArrayList<Media>();
	}
	
	public void play() {
		this.media.forEach(m -> m.play());
	}
	
	public Boolean guardarMedia(Media media) {
		if(media!=null) {
			return this.media.add(media);
		}
		return false;
	}
}
