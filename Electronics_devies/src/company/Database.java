package company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Database {

	
		// TODO Auto-generated method stub
		

	private	static String url="jdbc:mysql://localhost:3306/anil";
	private	static	String uname="root";
	private	static	String pass="root";
		
	private	static	final String INSERT_USER="INSERT INTO `anil`.`electronic` (`companyname`, `devicename`, `ip`, `personName`, `aaderno`, `phone`, `price`) VALUES (?,?,?,?,?,?,?)";
	private	static	final String SELECT_ID_USER="select id,name,email,country from electronic  where id=?;";
	private	static	final String SELECT_USER="SELECT * FROM electronic";
	private	static	final String DELETE_USER="delete from electronic where aaderno=?;";
	//private	static	final String UPDATE_USER="update electronic set name=?, email=?, country=? where id=?;";
	//DELETE FROM `anil`.`electronic` WHERE (`aaderno` = 'nmm');
	
	private Connection getConnection() {
		// TODO Auto-generated method stub
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection( url,uname,pass);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
		
		
	}
	
//	public void insertuser(List<Properties> pro) throws SQLException {
//		// TODO Auto-generated method stub
//		Connection connection =getConnection();
//		
//		PreparedStatement ps= connection.prepareStatement(INSERT_USER);
//	//	List <Properties> propertic=new ArrayList<Properties>();
//		
//		ps.setString(1,(pro.get(0).getDevicename()));
//		ps.setString(2,((pro.get(0).getDevicename())));
//		ps.setString(3,((pro.get(0).getIp())));
//		ps.setString(4,((pro.get(0).getPersonName())));
//		ps.setInt(5,(pro.get(0).getAaderno()));
//		ps.setInt(6,(pro.get(0).getPhone()));
//		ps.setInt(7,(pro.get(0).getPrice()));
//		
////		ps.setInt(7,propertice.getPrice());
//		
//		int i =ps.executeUpdate();
//		
//		if(i>0) {
//			System.out.println(" INSERT DATA .....!");
//		}else {
//			System.out.println(" NOT INSERT DATA......!");
//		}
//
//	}




	public List <Properties> selectAlluser() throws SQLException {
		// TODO Auto-generated method stub
		List <Properties> user= new ArrayList<>();
		
		Connection connection =getConnection();
		
		PreparedStatement ps= connection.prepareStatement(SELECT_USER);
		
		System.out.println(ps);
		
		ResultSet rs=ps.executeQuery();
		
		while(rs.next()) {
			//int id=rs.getInt("id");
			String companyname=rs.getString("companyname");
			String devicename=rs.getString("devicename");
			String ip=rs.getString("ip");
			String personName=rs.getString("personName");
			String aaderno=rs.getString("aaderno");
			String phone=rs.getString("phone");
			String price=rs.getString("price");
			user.add(new Properties());
			//System.out.println("DATA RETRIVE ...!");
		}
		return user;
	}
	
	public  void deleteuser(long aadher) throws SQLException {
		
	//	boolean rowdeleted = false;
		
		Connection connection =getConnection();
		
		PreparedStatement ps= connection.prepareStatement(DELETE_USER);
		ps.setLong(1, aadher);
	//	rowdeleted =ps.executeUpdate()>0;
		int i =ps.executeUpdate();
		if(i>0) {
			System.out.println(" DELETE DATA .....!");
		}else {
			System.out.println(" NOT DELETE DATA......!");
		}
		//return rowdeleted;
		

}

	public void insertuser(String companyname, String devicename, String ip, String name, long aader, long phoneno,
			int price) throws SQLException {
		
		Connection connection =getConnection();
		PreparedStatement ps= connection.prepareStatement(INSERT_USER);
		
		ps.setString(1,companyname);
		ps.setString(2,devicename);
		ps.setString(3,ip);
		ps.setString(4,name);
		ps.setLong(5,aader);
		ps.setLong(6,phoneno);
		ps.setInt(7,price);
		
		int i =ps.executeUpdate();
		if(i>0) {
			System.out.println(" INSERT DATA .....!");
		}else {
			System.out.println(" NOT INSERT DATA......!");
		}
	}

	

}
