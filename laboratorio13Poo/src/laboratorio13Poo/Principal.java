package laboratorio13Poo;

import javax.swing.JOptionPane;

public class Principal {

	Flecha flecha1, flecha2, flecha3, flecha4;
	int n;
	
	public static void main(String[] args) {

		Principal miPrincipal = new Principal();
	}


	public Principal() {
		
		flecha1 = new Flecha();
		flecha1.construirFlecha();
		flecha1.imprimirEspacio();
		
		flecha2 = new Flecha();
		flecha2.longuitud = 34;
		flecha2.color = "rojo";
		flecha2.construirFlecha();
		flecha2.imprimirEspacio();
		
		flecha3 = new Flecha(12, "negro");
		flecha3.construirFlecha();
		flecha3.imprimirEspacio();
		

		n = Integer.parseInt(JOptionPane.showInputDialog("longuitud flecha"));
		flecha4 = new Flecha(n, "rojo");
		flecha4.construirFlecha();
		flecha4.imprimirEspacio();
	}

}
