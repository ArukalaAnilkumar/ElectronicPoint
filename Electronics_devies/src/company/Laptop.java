package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Laptop {
	
	
	  private List <Properties> propertices=new ArrayList<Properties>();
	public static  ElectronDevice electro = null;
	private static String companyname;
	private static String devicename;
	private static String ip;
	private static int price;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("completed...! inserting data");
	}
	public static void dELL() {
		// TODO Auto-generated method stub
		
		System.out.println("=======> WELL COME TO DELL...!<========");
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		int chlapd=0;
		String conD;
		String ch;
		do {
			System.out.println("1.DELL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.DELL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.DELL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.DELL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.DELL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlapd=sclap.nextInt();
			
			switch(chlapd) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.DELL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="Dell";
				devicename="inspiron 15 30000";
				ip="anil1234";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="Dell";
					devicename="inspiron 15 30000";
					ip="123456789";
					price=40000;
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.DELL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="Dell ";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=60000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.DELL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="Dell";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=80000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.DELL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="Dell";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=100000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
			  electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.DELL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="Dell";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=120000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			default:
				System.out.println("<===============================================================================>");
				//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN DELL LAPTOP PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
			
		}while(conD.equalsIgnoreCase("yes"));
	

	}
	public static void iNTEL() {
		// TODO Auto-generated method stub
		System.out.println("==========> WELL COME TO INTEL...!<=========");
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		
		int chlapi=0;
		String conD ;
		String ch;
		do {
			System.out.println("1.INTEL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.INTEL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.INTEL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.INTEL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.INTEL");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlapi=sclap.nextInt();
			
			
			switch(chlapi) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.INTEL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="INTEL";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");

				}else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="INTEL";
					devicename="inspiron 15 30000";
					ip="123456789";
					price=40000;
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.INTEL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="INTEL";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=60000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.INTEL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="INTEL";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=80000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
				
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.INTEL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="INTEL";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=100000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
			}else if(ch.equalsIgnoreCase("cancel")) {
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
			
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.INTEL");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="INTEL";
				devicename="inspiron 15 30000";
				ip="12345679";
				price=120000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
			break;
			
			default:
				System.out.println("<===============================================================================>");
			//	System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN INTEL LAPTOP PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	public static void gIGABYTE() {
		// TODO Auto-generated method stub
		System.out.println("=============> WELL COME TO GIGABYTE...!<===========");
	
		Scanner scstr=new Scanner(System.in);
		
		String conD ;
		String ch;
		Scanner scintel=new Scanner(System.in);
		int chlap=0;
		do {
			System.out.println("1.GIGABYTE");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.GIGABYTE");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.GIGABYTE");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.GIGABYTE");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.GIGABYTE");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=scintel.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.GIGABYTE");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="GIGABYTE";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.GIGABYTE");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="GIGABYTE";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=60000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {	
				// electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="GIGABYTE";
					devicename="inspiron 15 30000";
					ip="123456789";
					price=60000;
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.GIGABYTE");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="GIGABYTE";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=80000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
			    electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
			}else if(ch.equalsIgnoreCase("cancel")) {
				
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
			
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.GIGABYTE");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="GIGABYTE";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=100000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				//electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.GIGABYTE");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="GIGABYTE";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=120000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {		
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
			}else if(ch.equalsIgnoreCase("cancel")) {
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				
				break;
			default:
				System.out.println("<===============================================================================>");
				//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN GIGABYTE LAPTOP PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	public static void aCER() {
		// TODO Auto-generated method stub
		System.out.println("===========> WELL COME TO ACER...!<==========");
		
		Scanner scintel=new Scanner(System.in);

		Scanner scstr=new Scanner(System.in);
		String ch;
		String conD ;
		int chlap=0;
		do {
			System.out.println("1.ACER");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.ACER");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.ACER");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.ACER");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.ACER");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=scintel.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.ACER");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="ACER";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.ACER");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="ACER";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=60000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
	
			}else if(ch.equalsIgnoreCase("cancel")) {
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.ACER");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="ACER";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=80000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.ACER");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="ACER";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=10000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
			}else if(ch.equalsIgnoreCase("cancel")) {
				 electro =new ElectronDevice();	
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.ACER");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="ACER";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=120000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
			  electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			default:
				System.out.println("<===============================================================================>");
			//	System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN ACER LAPTOP PLS TYPE YES ......!!!");
			
			   conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	public static void iBM() {
		// TODO Auto-generated method stub
		System.out.println("===========> WELL COME TO IBM...!<==========");
		Scanner scstr=new Scanner(System.in);
		String conD ;
		String ch;
		Scanner scintel=new Scanner(System.in);
		int chlap=0;
		do {
			System.out.println("1.IBM");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.IBM");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.IBM");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.IBM");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.IBM");
			System.out.println("Laptop Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=scintel.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.IBM");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="IBM";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.IBM");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="IBM";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=60000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");

				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.IBM");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="IBM";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=80000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
			    electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
			}else if(ch.equalsIgnoreCase("cancel")) {
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				
				
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.IBM");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="IBM";
				devicename="inspiron 15 30000";
				ip="1234";
				price=40000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
			    electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.IBM");
				System.out.println("Laptop Name : inspiron 15 3000");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="IBM";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=120000;
				System.out.println();
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println();
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println();
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}else if(ch.equalsIgnoreCase("cancel")) {
					 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			default:
				System.out.println("<===============================================================================>");
				
				//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN IBM LAPTOP PLS TYPE YES ......!!!");
			
			   conD = scstr.nextLine();
			
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	

}
