

package clases;


/**
 * Clase principal donde se establecen las instancias y llamados a metodos
 * del aplicativo
 * @author chenao
 *
 */
public class Principal {


    public static void main(String[] args) {
    	
    	Principal miPrincipal = new Principal();
    	System.out.println("\n******************Motor Comun*********************");
    	miPrincipal.usarMotorComun();
    	System.out.println("**************************************************\n");
    	System.out.println("*****************Motor Economico******************");
    	miPrincipal.usarMotorEconomico();
    	System.out.println("**************************************************\n");
    	System.out.println("*****************Motor Electrico******************");
    	miPrincipal.usarMotorElectrico();
    	System.out.println("**************************************************\n");
    }
//Defino los métodos usar para cada uno de los motores, esto es lo que más me gusta de la programación orientada a objetos.
	private void usarMotorComun() {
	    Motor motor = new MotorEconomico();
        motor = new MotorComun();
        motor.encender();
        motor.acelerar();
        motor.apagar();
	}

	private void usarMotorElectrico() {
		Motor motor = new MotorElectricoAdapter() ;
        motor.encender();
        motor.acelerar();
        motor.apagar();		
	}

	private void usarMotorEconomico() {
        Motor motor = new MotorEconomico();
        motor.encender();
        motor.acelerar();
        motor.apagar();		
	}

}
