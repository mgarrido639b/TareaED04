/**clase main del programa donde se pregunta por la edad y se le repsonde con los años que le
 * quedan para jubilarse
 *  @author  Moises Garrido
 */
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * creo un try para manejar excepciones
		 */
		try {
			// creo un scanner para guardar los datos del usuario
			Scanner entrada = new Scanner(System.in);
			System.out.println("Dime tu edad");
			int edadAct = entrada.nextInt();
			
			/*
			 * accede al metodo de la clase persona y se devuelve el resultado en la variable edadJub
			 */
			Persona persona = new Persona(edadAct);
			int edadJub =persona.calcularTiempoHastaJubilacion();
			
			/*
			 *  ejecuta el if correspondiente dependiendo de la variable edadJub
			 */
			if (edadJub <= 0) { //si menor o igual a cero
				System.out.println("¡Jubilate!  Te has pasado " + Math.abs(edadJub) + " año/s" );
			}
			else if (edadJub>=10) { //si mayor o igual a 10
				System.out.println("Te quedan " + edadJub + " años. ¡A seguir trabajando gandúl!");
			}
			else if (edadJub <10){ // si menor a 10
				System.out.println ("Sólo te quedan " + edadJub + " años. ¡Vamos que ya queda poco!");
			}
		}
		/**
		 * si ocurre un fallo se proporciona un mensaje de error
		 * @exception si ocurre algun fallo lanza el mensaje
		 */
		catch (Exception ex) {
			System.out.println("Error. Algo ha pasado. ¿Has escrito un numero en tu edad?");
		}
	} 
}
