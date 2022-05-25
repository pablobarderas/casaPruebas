package casita;
/**
 * @author ramita
 * @version 1.0
 */

public class Ramita {
	private String nombre;
	
	//Constructores
	public Ramita() {
		
	}
	
	/**
	 * @param nombre Recibe el nombre de la clase
	 */
	public Ramita(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return nombre Devuelve el nombre del atributo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre Nombre que va a ser sustituido
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
