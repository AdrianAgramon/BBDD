package proys;

public interface PracticaInterface {

	/**
	 * M�todo para realizar la conexi�n a la base de datos.
	 * 
	 * @return boolean (si se ha podido conectar).
	 */
	public boolean conectar();

	/**
	 * Ejercicio 1:
	 * 
	 * Se debe realizar una transacci�n que comprenda las siguientes operaciones:
	 * 
	 * OP1. Insertar una nueva cuenta bancaria:
	 * 
	 * - N�mero de cuenta: Elegido por el alumno.
	 * - Entidad bancaria asociada: Banco Sabadell.
	 * - Balance: 100
	 * - Fecha de apertura: Fecha actual del sistema.
	 * 
	 * OP2. Hacer que esa cuenta sea del usuario de nombre Roberto.
	 * OP3. Insertar un nuevo producto:
	 * 
	 * - ID: 41 - Nombre: Cereales
	 * - Precio: 0.6
	 * - Tipo: "Rebajado"
	 * 
	 * @return booleano (indica si se ha podido completar toda la transacci�n)
	 */
	public boolean executeQuery1();

	/**
	 * Ejercicio 2:
	 * 
	 * Realizar una consulta que devuelva el n�mero de cuentas que tiene el usuario con menos cuentas asociadas.

	 * @return int (valor requerido)
	 */
	public int executeQuery2();

	/**
	 * 
	 * Ejercicio 3:
	 * 
	 * Realizar una consulta que obtenga el nombre de la localidad en la que se han producido m�s movimientos en base a los datos de geolocalizaci�n disponibles.
	 * 
	 * @return String (valor requerido)
	 */
	public String executeQuery3();

	/**
	 * Ejercicio 4:
	 * Realizar una operaci�n donde se asigne al movimiento con ID 3 la etiqueta con ID 7 mediante una inserci�n en la tabla correspondiente.
	 * 
	 * @return booleano (indica si se ha podido realizar la inserci�n)
	 */
	public boolean executeQuery4();

	/**
	 * Ejercicio 5:
	 * 
	 * Actualizar el c�digo postal de Leon a "24080".
	 * 
	 * @return booleano (indica si se ha podido realizar la actualizaci�n)
	 */
	public boolean executeQuery5();

	/**
	 * Ejercicio 6:
	 * 
	 * Realizar una operaci�n mediante la cual se borren todos los movimientos de la cuenta n�mero "0985734967" con un importe mayor a 200.
	 * 
	 * Nota: Ser� necesaria la actualizaci�n de algunas tablas para que se permita el borrado. La alteraci�n de las tablas debe realizarse a nivel de c�digo tambi�n.
	 * 
	 * @return int (n�mero de registros borrados)
	 */
	public int executeQuery6();

	/**
	 * Ejercicio 7:
	 * 
	 * Realizar una opci�n que permita obtener la foto del usuario de nombre "Alberto".
	 * 
	 * @return byte[] (Array de bytes del fichero)
	 */
	public byte[] executeQuery7();

	/**
	 * Ejercicio 8:
	 * 
	 * Se debe insertar el procedimiento almacenado ADD_ETIQUETA_TO_MOV en la base de datos a trav�s de c�digo. El c�digo de dicho procedimiento est� disponible en el fichero ADD_ETIQUETA_TO_MOV.sql.
	 * 
	 * Una vez insertado el procedimiento, debe ejecutarse para que a�ada una etiqueta a un movimiento. Los datos del movimiento y la etiqueta son:
	 * 
	 * - Movimiento: ID 3
	 * - Etiqueta: ID 2
	 * 
	 * @return boolean (si se ha ejecutado correctamente)
	 */
	public boolean executeQuery8();

}
