package aspectExample;

public class TraditionalPlane {

	public void reserveSeat(int row, int number) {
		// ... chequear autorización
		// ... chequear que está libre
		// ... bloquear asiento 
		// ... Iniciar transacción
		// ... Log inicio de operación
		// ... Realizar reserva
		// ... Log fin de operación
		// ... Ejecutar o deshacer transacción
		// ... Desbloquear
	}
	
	void reserveRow(int fila) {
		// ... chequear autorización
				// ... chequear que está libre
				// ... bloquear fila
				// ... Iniciar transacción
				// ... Log inicio de operación
				// ... Reserva de fila
				// ... Log fin de operación
				// ... Ejecutar o deshacer transacción
				// ... Desbloquear
	}
	
	
}
