package company;

import java.util.Scanner;

public class Cell {
	
	private static String companyname;
	private static String devicename;
	private static String ip;
	private static int price;
	private static	ElectronDevice electro=null;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("completed...insert!");
	}
	public static void MI() {
		System.out.println("=======> WELL COME TO MI...!<========");

		Scanner scstr=new Scanner(System.in);
		Scanner sclap=new Scanner(System.in);
		int chCELL=0;
		String conD;
		String ch;
		do {
			System.out.println("1.MI");
			System.out.println("CELL Name : MI");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.MI");
			System.out.println("CELL Name : MI");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.MI");
			System.out.println("CELL Name : MI");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.MI");
			System.out.println("CELL Name : MI");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.MI");
			System.out.println("CELL Name : MI");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chCELL=sclap.nextInt();
			
		
			switch(chCELL) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("1.MI");
				System.out.println("CELL Name : MI");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="MI";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.MI");
				System.out.println("CELL Name : MI");
				System.out.println("CELL IP :");
				System.out.println("price :60000");
				
				companyname="MI";
				devicename="inspiron 15 30000";
				ip="anil1234";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.MI");
				System.out.println("CELL Name : MI");
				System.out.println("CELL IP :");
				System.out.println("price :80000");
				
				companyname="MI";
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
				
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.MI");
				System.out.println("CELL Name : MI");
				System.out.println("CELL IP :");
				System.out.println("price :10000");
				
				companyname="MI";
				devicename="inspiron 15 30000";
				ip="12345689";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.MI");
				System.out.println("CELL Name : MI");
				System.out.println("CELL IP :");
				System.out.println("price :120000");
				
				companyname="MI";
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
				
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			default:
				System.out.println("<===============================================================================>");
				//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}System.out.println("\nDO YOU WANT TO CONTINUEEE IN MI CELL PLS TYPE YES ......!!!");
			
			   conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));
	
		
	}
	public static void nOKIA() {
		// TODO Auto-generated method stub
		System.out.println("========> WELL COME TO NOKIA...!<==========");

		Scanner scstr=new Scanner(System.in);
		Scanner sclap=new Scanner(System.in);
		int chCELL=0;
		String ch;
		String conD;
		do {
			System.out.println("1.NOKIA");
			System.out.println("CELL Name : NOKIA");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.NOKIA");
			System.out.println("CELL Name : NOKIA");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.NOKIA");
			System.out.println("CELL Name : NOKIA");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.NOKIA");
			System.out.println("CELL Name : NOKIA");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.NOKIA");
			System.out.println("CELL Name : NOKIA");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chCELL=sclap.nextInt();
			
			
			switch(chCELL) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("1.NOKIA");
				System.out.println("CELL Name : NOKIA");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="NOKIA";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.NOKIA");
				System.out.println("CELL Name : NOKIA");
				System.out.println("CELL IP :");
				System.out.println("price :60000");
				
				companyname="NOKIA";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.NOKIA");
				System.out.println("CELL Name : NOKIA");
				System.out.println("CELL IP :");
				System.out.println("price :80000");
				
				companyname="NOKIA";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.NOKIA");
				System.out.println("CELL Name : NOKIA");
				System.out.println("CELL IP :");
				System.out.println("price :100000");
				
				companyname="NOKIA";
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
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.NOKIA");
				System.out.println("CELL Name : NOKIA");
				System.out.println("CELL IP :");
				System.out.println("price :120000");
				
				companyname="NOKIA";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
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
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN NAKIA CELL PLS TYPE YES ......!!!");
			
			   conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));
		
		
	}
	public static void apple() {
		// TODO Auto-generated method stub
		System.out.println("========> WELL COME TO APPLE...!<========");
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String conD;
		String ch;
		int chCELL=0;
		do {
			System.out.println("1.APPLE");
			System.out.println("CELL Name : APPLE");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.APPLE");
			System.out.println("CELL Name : APPLE");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.APPLE");
			System.out.println("CELL Name : APPLE");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.APPLE");
			System.out.println("CELL Name : APPLE");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.APPLE");
			System.out.println("CELL Name : APPLE");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chCELL=sclap.nextInt();
			
			
			switch(chCELL) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("1.APPLE");
				System.out.println("CELL Name : APPLE");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="APPLE";
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
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.APPLE");
				System.out.println("CELL Name : APPLE");
				System.out.println("CELL IP :");
				System.out.println("price :60000");
				
				companyname="APPLE";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.APPLE");
				System.out.println("CELL Name : APPLE");
				System.out.println("CELL IP :");
				System.out.println("price :80000");
				
				companyname="APPLE";
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
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.APPLE");
				System.out.println("CELL Name : APPLE");
				System.out.println("CELL IP :");
				System.out.println("price :100000");
				
				companyname="APPLE";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.APPLE");
				System.out.println("CELL Name : APPLE");
				System.out.println("CELL IP :");
				System.out.println("price :120000");
				
				companyname="APPLE";
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
			}
			else if(ch.equalsIgnoreCase("cancel")) {
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
	
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN APPLE CELL PLS TYPE YES ......!!!");
	
	       conD = scstr.nextLine();
	   
		}while(conD.equalsIgnoreCase("yes"));



	}
	public static void oPPO() {
		// TODO Auto-generated method stub
		System.out.println("=======>WELL COME TO OPPO...!<========");
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String conD;
		String ch;
		int chCELL=0;
		do {
			System.out.println("1.OPPO");
			System.out.println("CELL Name : OPPO");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.OPPO");
			System.out.println("CELL Name : OPPO");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.OPPO");
			System.out.println("CELL Name : OPPO");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.OPPO");
			System.out.println("CELL Name : OPPO");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.OPPO");
			System.out.println("CELL Name : OPPO");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chCELL=sclap.nextInt();
			
			
			switch(chCELL) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("1.OPPO");
				System.out.println("CELL Name : OPPO");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="OPPO";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.OPPO");
				System.out.println("CELL Name : OPPO");
				System.out.println("CELL IP :");
				System.out.println("price :60000");
				
				companyname="OPPO";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.OPPO");
				System.out.println("CELL Name : OPPO");
				System.out.println("CELL IP :");
				System.out.println("price :80000");
				
				companyname="OPPO";
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
				
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
			
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.OPPO");
				System.out.println("CELL Name : OPPO");
				System.out.println("CELL IP :");
				System.out.println("price :100000");
				
				companyname="OPPO";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.OPPO");
				System.out.println("CELL Name : OPPO");
				System.out.println("CELL IP :");
				System.out.println("price :120000");
				
				companyname="OPPO";
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
				
			}
			else if(ch.equalsIgnoreCase("cancel")) {
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
		
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN OPPO CELL PLS TYPE YES ......!!!");
		
		       conD = scstr.nextLine();
		   
			}while(conD.equalsIgnoreCase("yes"));



	}
	public static void lenovo() {
		// TODO Auto-generated method stub
		System.out.println("==========> WELL COME TO LENOVO...!<======");
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String conD;
		String ch;
		int chCELL=0;
		do {
			System.out.println("1.LENOVO");
			System.out.println("CELL Name : LENOVO");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.LENOVO");
			System.out.println("CELL Name : LENOVO");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.LENOVO");
			System.out.println("CELL Name : LENOVO");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.LENOVO");
			System.out.println("CELL Name : LENOVO");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.LENOVO");
			System.out.println("CELL Name : LENOVO");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chCELL=sclap.nextInt();
			
			
			switch(chCELL) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("1.LENOVO");
				System.out.println("CELL Name : LENOVO");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="LENOVO";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.LENOVO");
				System.out.println("CELL Name : LENOVO");
				System.out.println("CELL IP :");
				System.out.println("price :40000");
				
				companyname="LENOVO";
				devicename="inspiron 15 30000";
				ip="anil1234";
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
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.LENOVO");
				System.out.println("CELL Name : LENOVO");
				System.out.println("CELL IP :");
				System.out.println("price :80000");
				
				companyname="LENOVO";
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
				
				 electro=new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.LENOVO");
				System.out.println("CELL Name : LENOVO");
				System.out.println("CELL IP :");
				System.out.println("price :100000");
				
				companyname="LENOVO";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.LENOVO");
				System.out.println("CELL Name : LENOVO");
				System.out.println("CELL IP :");
				System.out.println("price :120000");
				
				companyname="LENOVO";
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
				}
				else if(ch.equalsIgnoreCase("cancel")) {
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
		
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN LENOVO CELL PLS TYPE YES ......!!!");
		
		       conD = scstr.nextLine();
		   
			}while(conD.equalsIgnoreCase("yes"));
	}

}
