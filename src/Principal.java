import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		function monedas = new function();
		Boolean ejecutar = true;
		while (ejecutar) {
			String opciones = JOptionPane
					.showInputDialog(null, "Elige una opción", "elige", JOptionPane.QUESTION_MESSAGE, null,
							new Object[] { "Conversor monedas", "Conversor temperatura" }, "Seleccion")
					.toString();
			switch (opciones) {
			case "Conversor monedas":
				String input = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
				if (ValidarNumero(input)) {
					double valor = Double.parseDouble(input);
					monedas.convertirMonedas(valor);
					int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas realizar otra conversión?");
					if (JOptionPane.OK_OPTION == respuesta) {
						
					} else {
						ejecutar = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Valor inválido");
				}
				break;
			case "Conversor temperatura":
				break;
			}
		}
	}

	public static boolean ValidarNumero(String input) {
		try {
			double x = Double.parseDouble(input);
			if (x >= 0 || x < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
