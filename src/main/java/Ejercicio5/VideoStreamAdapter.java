package Ejercicio5;

public class VideoStreamAdapter extends Media {
	
	private VideoStream videoStream;
	
	public String play() {
		return super.play() + this.videoStream.reproduce();
	}
}
