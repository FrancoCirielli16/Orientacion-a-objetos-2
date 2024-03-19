package Ejercicio1;

public class main {

	public static void main(String[] args) {
		
		Twitter t = new Twitter();
		
		Usuario f = t.darDeAltaUsuario("FRANCO");
		Usuario m = t.darDeAltaUsuario("MELMAN");
		
		Tweet t1 = f.twittear("AGUANTE LA JODA");
		Tweet t2 = m.twittear("AGUANTE EL LOL");
		
		ReTweet rt1 = f.reTwittear(t2);
		ReTweet rt2 = m.reTwittear(t1);
		
		ReTweet rtrt = f.reTwittear(rt2);
		
		for (int i=0; i<3; i++) {
			System.out.println(f.tweets.get(i).toString()); 
		}
		t.eliminarUsuario(m);
	
		
		for (int i=0; i<f.tweets.size(); i++) {
			System.out.println(f.tweets.get(i).toString()); 
		}
	}

}
