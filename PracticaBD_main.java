package proys;


public class PracticaBD_main {

	public static void main(String[] args) {
		PracticaInterface db = new PracticaBD();
		boolean check = db.conectar();
		
		if (check)
			System.out.println("conectado");
		else 
			System.out.println("no conectado");

		boolean insertado = db.executeQuery1();
		
		if (insertado)
			System.out.println("insertado");
		else 
			System.out.println("no insertado");

		
		
	}

}
