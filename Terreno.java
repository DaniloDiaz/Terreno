import javax.swing.JOptionPane;

public class terreno {
  private float largo;
  private float ancho;
	private float pxmts;
	private float area = 0;
	private float des = 0;
	private float ptotal = 0;
	private float precio = 0;

	private void captura() {
		String x, y;
		x = JOptionPane.showInputDialog("Cual es el largo del terreno:");
		largo = Float.parseFloat(x);
		x = JOptionPane.showInputDialog("Cual es el ancho del terreno:");
		ancho = Float.parseFloat(x);
		y = JOptionPane
				.showInputDialog("Cual es el precio por metro cuadrado:");
		pxmts = Float.parseFloat(y);

		area = largo * ancho;

		if (area > 400) {
			precio = area * pxmts;
			des = precio * 0.10F;
			ptotal = precio - des;
		} else {
			ptotal = area * pxmts;
		}
		JOptionPane.showMessageDialog(null, "Precio Total:" + ptotal,
				"valorterreno", JOptionPane.PLAIN_MESSAGE);
	}

	public static void main(String[] arg) {
		terreno objeto = new terreno();
		objeto.captura();
	}
}
