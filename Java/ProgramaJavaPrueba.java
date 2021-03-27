/**
 * 
 */
package ProyectoGit;

import javax.swing.JOptionPane;

/**
 * @author Marianakel
 * @version 1.3 (versiones 1.1 y 1.2 son los documentos index.html y estilos.css)
 */
public class ProgramaJavaPrueba {

	/**
	 * @param int resp representa el valor del cuadro de dialogo a introducir por pantalla.
	 * @param if representa la condicion que introduce el usuario por consola.
	 * @param String nombre representa el valor a asignar a la variable nombre.
	 * @return muestra en pantalla mediante cuadro de diálogo la cadena de texto "Bienvenido " concatenada con la 
	 * variable "nombre".
	 * @param String texto representa el valor que va a acumular en esa variable.
	 * @return devuelve un mensaje por pantalla mediante cuadro de diálogo la cadena de texto "Perfecto. Comencemos
	 *  con la primera lección de GIT para empezar a resolver tus dudas sobre " concatenada con la variable "texto".
	 * @throws else if representa el caso contrario al if y muestra en pantalla mediante cuadro de 
	 *  diálogo "Perfecto!  Hasta pronto.".
	 */
	public static void main(String[] args) {
		/**En esta parte del proyecto se ha querido implementar un programa en el que el usuario solicita ayuda 
		 * en la página web creada y a través de un menu de diálogo interactivo pueda resolver los problemas del
		 *  usuario.*/
		        
		
			int resp = JOptionPane.showConfirmDialog(null, "Hola! , ¿puedo ayudarte?");
                
		    if (resp==JOptionPane.YES_OPTION) {
					
			String nombre = JOptionPane.showInputDialog("Genial, dime tu nombre: ");

   	        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre );

	        String texto = JOptionPane.showInputDialog("Por favor cuéntame en dos palabras por qué quieres aprender a usar GIT: ");

		    JOptionPane.showMessageDialog(null, "Perfecto. Comencemos con la primera lección de GIT para empezar a resolver tus dudas sobre "+ texto );
		        
		       

			    }
			    else if(resp==JOptionPane.NO_OPTION) {
			    	JOptionPane.showMessageDialog(null,"Perfecto!  Hasta pronto.");
			    }
			    
		    }
		
	}


