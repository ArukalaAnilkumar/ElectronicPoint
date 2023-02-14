package company;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ElectronDevice extends Laptop implements ElectronSystem {

	private static final Database database = new Database();
	private static final Properties properties = new Properties();
	private static String name = "";
	private static  long aader = 0;
	private static  long phoneno = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ElectroAdd(String companyname, String devicename, String ip, int price) {
		// TODO Auto-generated method stub
		List <Properties> propertic=new ArrayList<Properties>();
		Properties pro=new Properties();
		Scanner sc=new Scanner(System.in);
		Scanner scnum=new Scanner(System.in);
		String okone;
		do {
		System.out.println("ENTER THE YOUR NAME :");
		name=sc.nextLine();
		System.out.println("ENTER YOUR AADER NUMBER :");
		aader=scnum.nextLong();
		System.out.println("MOBLIE NUMBER :");
		phoneno=scnum.nextLong();
		
		System.out.println("Enter the Details Completed..!  Enter YES...!");
		okone=sc.nextLine();
		
		}while(okone.equalsIgnoreCase("NO"));
		propertic.add(new Properties(companyname,devicename,ip,name,aader,phoneno,price));
		
		//   da=new Database();
		     try {
				database.insertuser(companyname,devicename,ip,name,aader,phoneno,price);
				database.selectAlluser();
				for(int i=0; i<propertic.size(); i++) {
					
					if(name.equalsIgnoreCase(propertic.get(i).getPersonName())) {
						
				System.out.println("NAME :"+propertic.get(i).getPersonName());
				System.out.println("PHONE NUMBER :"+propertic.get(i).getPhone());
				System.out.println("COMPANY NAME :"+propertic.get(i).getCompanyname());
				System.out.println("DEVICE NAME :"+propertic.get(i).getDevicename());
				System.out.println("PRICE :"+propertic.get(i).getPrice());
				System.out.println(" SUCCESSFULLY BOOKING NOW...!");
					}
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("SQL EXCEPTION..INSERT DATA..!");
				System.out.println(" NOT BOOKING SUCCESSFULLY...! ");
				System.out.println(" TRY AGAIN ...!");
			}
		
	
	}

	@Override
	public void Electroremove(String companyname, String devicename, String ip, int price) {
		// TODO Auto-generated method stub
		List <Properties> propertic=new ArrayList<Properties>();
		Scanner sc=new Scanner(System.in);
		Scanner scnum=new Scanner(System.in);
		System.out.println("Enter the name :");
		 name=sc.nextLine();
		System.out.println("Enter the Aadher No :");
		aader=scnum.nextLong();
		
		
				   try {
					//database.deleteuser(propertic.get(i).getAaderno());
					   database.deleteuser(aader);
					   for(int i=0; i<propertic.size(); i++) {
							
							if(name.equalsIgnoreCase(propertic.get(i).getPersonName())) {
							
					   System.out.println("CANCEL BOOKING :"+propertic.get(i).getPersonName());
					   System.out.println(propertic.get(i).getDevicename());
					   propertic.remove(new Properties(propertic.get(i).getCompanyname(),propertic.get(i).getDevicename(),propertic.get(i).getIp(),propertic.get(i).getPersonName(),propertic.get(i).getAaderno(),propertic.get(i).getPhone(),propertic.get(i).getPrice()));
						
							}
					   }
					System.out.println("SQL EXCEPTION..DELETE DATA..!");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					System.out.println(" NOT CANCEL BOOKING...! ");
					System.out.println(" TRY AGAIN ...!");
				
				}
		}
	
	}
