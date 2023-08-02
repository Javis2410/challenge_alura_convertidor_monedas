import javax.swing.JOptionPane;

public class convertirMonedasAPesos {

	public void dolarToPeso(Double cantidad) {
		double resultado = cantidad * 16.76;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " pesos.");
	}

	public void euroToPeso(Double cantidad) {
		double resultado = cantidad * 18.56;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " pesos.");
	}

	public void libraToPeso(Double cantidad) {
		double resultado = cantidad * 21.58;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " pesos.");
	}

	public void yenToPeso(Double cantidad) {
		double resultado = cantidad * 0.12;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " pesos.");
	}

	public void wonToPeso(Double cantidad) {
		double resultado = cantidad * 0.013;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " pesos.");
	}

}
