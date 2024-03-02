/**
 clase donde se crea el objeto persona.
 */
public class Persona {

    /**
     * Constructor de la clase Persona.
     * 
     * @param edadAct La edad actual de la persona.
     */
	int edadAct;
	// metodo construcctor
	public Persona(int edadAct)  {
		this.edadAct=edadAct;
	}
	/**
	 declaracion del metodo para calcular la diferencia de años con la jubilacion
	 * @return
	 */
    public  int calcularTiempoHastaJubilacion() {
        return 67 - edadAct;
    }		
}