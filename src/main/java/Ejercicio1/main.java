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
		
		System.out.println(f.verPublicacion());
		
		t.eliminarUsuario(m);
	
		
		System.out.println(f.verPublicacion());
		
		Usuario felipao = t.darDeAltaUsuario("Felipao");
		Usuario lalo = t.darDeAltaUsuario("Lalo");
		
		Tweet t3 = felipao.twittear("Hola");
		
		ReTweet rt3 = lalo.reTwittear(t3);
		
		t.eliminarUsuario(felipao);
		
		System.out.println(lalo.verPublicacion());
		
		
	}

}
