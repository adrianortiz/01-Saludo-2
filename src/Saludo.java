import javax.swing.JOptionPane;

/**
 * 
 * @author Adrian
 *
 */
public class Saludo {
	
	/**
	 * Progrma que muetra un mensaje de saludo.
	 * @param args
	 */
	public static void main(String[] args) {
		
		String nombre = "Adrian";
		String edad = "36";
		
		// System.out.println("Hola: " + nombre);
		// System.out.printf("Hola: %s", nombre);
		
		JOptionPane.showMessageDialog(null, String.format("Hola %s tu edad es %s años de edad.", nombre, edad));
	}
}
