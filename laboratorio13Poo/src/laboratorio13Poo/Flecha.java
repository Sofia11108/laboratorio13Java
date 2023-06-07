package laboratorio13Poo;

public class Flecha {

	int longuitud;
	String color;
	
	public Flecha() {  //constructor implícito
		longuitud = 18;
		color = "negro";
		
	}
	
	public Flecha(int longuitud, String color) {  //constructor explícito
		this.longuitud = longuitud;
		this.color = color;
	}
	
	
	public void imprimirEspacio() {
		System.out.println( );
	}
	
	public void construirFlecha() {
		for (int i = 0; i < longuitud; i++) {
			imprime("-");
		}
		imprime(">");
	}

	private void imprime(String simbolo) {
		if (color.equals("negro")) {
			System.out.print(simbolo);
		} else {
			System.err.print(simbolo);
		}
		
	}
	
	//los metodos de encapsulamiento y el constructor son públicos
}
