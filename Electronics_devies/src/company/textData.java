package company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class textData {

	public static void main(String[] args) throws SQLException {
		
		String com="name";
		String dev="name";
		String ip="name";
		String person="name";
		
	     int aader=709507564;
	     int phone=23123;
	     int price=143;
	     
//	     Properties obj=new Properties();
//	     obj.setCompanyname(com);
//	     obj.setDevicename(dev);
//	     obj.setIp(ip);
//	     obj.setPersonName(person);
//	     obj.setAaderno(aader);
//	     obj.setPhone(phone);
//	     obj.setPrice(price);
//	     
//	     Database da=new Database();
//	     da.insertuser(obj);
//	     da.selectAlluser();
//	     da.deleteuser(233);
	     
	     
	     
	     // second process run not passible
	     
//	     List <Properties> pro =new ArrayList();
//	     Properties obj=new Properties();
//	     pro.add(new Properties(com,dev,ip,person,aader,phone,price));
//	     
//	     Database da=new Database();
//	     da.insertuser(obj);
	     
	     List <Properties> pro =new ArrayList();
	     pro.add(new Properties(com,dev,ip,person,aader,phone,price));
	     Database da=new Database();
	   //  da.insertuser(com,dev,ip,person,aader,phone,price);
	     da.deleteuser(aader);

	}
}
