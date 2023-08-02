import javax.swing.JOptionPane;

public class convertirMonedas {

	public void pesoToDolar(Double cantidad) {
		double resultado = cantidad / 16.76;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " dolares.");
	}

	public void pesoToEuro(Double cantidad) {
		double resultado = cantidad / 18.56;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " euros.");
	}

	public void pesoToLibra(Double cantidad) {
		double resultado = cantidad / 21.58;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " libras.");
	}

	public void pesoToYen(Double cantidad) {
		double resultado = cantidad / 0.12;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " yen's.");
	}

	public void pesoToWon(Double cantidad) {
		double resultado = cantidad / 0.013;
		resultado = (double) Math.round(resultado * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes: " + resultado + " won's.");
	}

}
