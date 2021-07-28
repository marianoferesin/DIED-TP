package died;

import java.time.LocalDate;
import java.util.ArrayList;

public class Boleto {
	Integer numero;
	String emailCliente, nombreCliente;
	LocalDate fechaVenta;
	String nombreEstacionOrigen, nombreEstacionDestino;
	ArrayList <Estacion> camino;
	Double costo;

}
