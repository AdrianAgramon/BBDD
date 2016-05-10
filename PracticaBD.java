package proys;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;



public class PracticaBD implements PracticaInterface{

	private Connection conn;
	
	@Override
	public boolean conectar()  {

		try {
			String drv = "com.mysql.jdbc.Driver";
			Class.forName(drv);
			String serverAddress = "localhost:3306";
			String db = "practica_bbdd";
			String user = "bd";
			String pass = "bdupm";
			String url = "jdbc:mysql://" + serverAddress + "/" + db;
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/practica_bbdd?useSSL=false", user, pass);
			System.out.println("Conectado a la base de datos!");
			return true;
		} catch(SQLException se) {
			//se.printStackTrace();
			System.out.println("Mensaje errorr : "+se.getMessage());
			System.out.println("Codigo error : "+se.getErrorCode());
			System.out.println("Estado SQL : "+se.getSQLState());
		}
		catch (ClassNotFoundException e) { 
			e.printStackTrace(); //No se encuentra el driver// 
		} 
		catch(Exception e) { 
			System.out.println("Se produjo un error inesperado: "+e.getMessage()); 
		}
		return false;
	}
	

	@Override
	public boolean executeQuery1() {
		try {
			
			
			
			String query = "INSERT INTO cuenta (num_cuenta, balance, fecha_apertura, Banco_CIF) VALUES (?,?,?,?);";
			
			PreparedStatement pst1 = conn.prepareStatement(query);
			pst1.setString(1, "0123456789");
			pst1.setFloat(2, 100);
			pst1.setDate(3, new Date(new java.util.Date().getTime()));
			pst1.setString(4, "Banco Sabadell");
//			
			
			
			int result1 = pst1.executeUpdate();

			Statement st2 = conn.createStatement();
			ResultSet rs2 = st2.executeQuery("SELECT * from cuenta where num_cuenta = '0123456789'");
			while (rs2.next()) {
				String id = rs2.getString("num_cuenta");
				String cif = rs2.getString("Banco_CIF");
				String balance = rs2.getString("float");
				Date fecha = rs2.getDate("fecha_apertura");
				
				System.out.println("Actor:");
				System.out.println("\tID: " + id);
				System.out.println("\tName: " + cif);
				System.out.println("\tLast name: " + balance);
				System.out.println("\fecha apertura: " + fecha.toString());
			}
			
			
		return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
		
		return false;
	}

	@Override
	public int executeQuery2() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String executeQuery3() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean executeQuery4() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean executeQuery5() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int executeQuery6() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public byte[] executeQuery7() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean executeQuery8() {
		// TODO Auto-generated method stub
		return false;
	}

}
