import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class function {
	convertirMonedas pesos = new convertirMonedas();
	convertirMonedasAPesos monedas = new convertirMonedasAPesos();

	public void convertirMonedas(double input) {

		String moneda = JOptionPane.showInputDialog(null, "Elige la moneda a la que deseas convertir", "elige",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Pesos a Dólar", "Pesos a Euros", "Pesos a Libras", "Peso a Yen", "Peso a Won Coreano",
						"Dólar a Pesos", "Euros a Pesos", "Libras a Pesos", "Yen a Pesos", "Won Coreano a Pesos" },
				"Seleccion").toString();

		switch (moneda) {
		case "Pesos a Dólar":
			pesos.pesoToDolar(input);
			break;
		case "Pesos a Euros":
			pesos.pesoToEuro(input);
			break;
		case "Pesos a Libras":
			pesos.pesoToLibra(input);
			break;
		case "Peso a Yen":
			pesos.pesoToYen(input);
			break;
		case "Peso a Won Coreano":
			pesos.pesoToWon(input);
			break;
		case "Dólar a Pesos":
			monedas.dolarToPeso(input);
			break;
		case "Euros a Pesos":
			monedas.euroToPeso(input);
			break;
		case "Libras a Pesos":
			monedas.libraToPeso(input);
			break;
		case "Yen a Pesos":
			monedas.yenToPeso(input);
			break;
		case "Won Coreano a Pesos":
			monedas.wonToPeso(input);
		}

	}
}
