package company;

import java.util.Scanner;

public class Tab {
	
	private static String companyname;
	private static String devicename;
	private static String ip;
	private static int price;
	private static	ElectronDevice electro;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void rEALME() {
		// TODO Auto-generated method stub//1
		System.out.println("========> WELL COME TO REALME...!<======");
		
		Scanner sclap=new Scanner(System.in);

		Scanner scstr=new Scanner(System.in);
		String ch;
		String conD ;
		int chlap=0;
		do {
			System.out.println("1.REALME");
			System.out.println("Laptop Name :REALME");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.REALME");
			System.out.println("Laptop Name : REALME");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.REALME");
			System.out.println("Laptop Name :REALME");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.REALME");
			System.out.println("Laptop Name : REALME ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.REALME");
			System.out.println("Laptop Name : REALME ");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=sclap.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.REALME");
				System.out.println("Laptop Name : REALME");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="REALME";
				devicename="REALME";
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
					
					companyname="REALME";
					devicename="REALME";
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
				System.out.println("2.REALME");
				System.out.println("Laptop Name : REALME");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="REALME";
				devicename="REALME";
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
				System.out.println("3.REALME");
				System.out.println("Laptop Name : REALME");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="REALME";
				devicename="REALME";
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
					
					companyname="REALME";
					devicename="REALME";
					ip="123456789";
					price=80000;
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.REALME");
				System.out.println("Laptop Name : REALME");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="REALME";
				devicename="REALME";
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
					
					companyname="REALME";
					devicename="REALME";
					ip="123456789";
					price=100000;
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
				
				
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.REALME");
				System.out.println("Laptop Name :REALME");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="REALME";
				devicename="REALME";
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
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN REALME TAB PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
			
		}while(conD.equalsIgnoreCase("yes"));


	}
	public static void sUMSUNG() {
		// TODO Auto-generated method stub//2
		System.out.println("========> WELL COME TO SUMSUNG...!<==========");
		
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String ch;
		String conD ;
		int chlap=0;
		do {
			System.out.println("1.SUMSUNG");
			System.out.println("Laptop Name :SUMSUNG");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.SUMSUNG");
			System.out.println("Laptop Name : SUMSUNG");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.SUMSUNG");
			System.out.println("Laptop Name :SUMSUNG");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.SUMSUNG");
			System.out.println("Laptop Name : SUMSUNG ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.SUMSUNG");
			System.out.println("Laptop Name : SUMSUNG ");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=sclap.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.SUMSUNG");
				System.out.println("Laptop Name : SUMSUNG");
				System.out.println("LAPTOP IP :");
				System.out.println("price :40000");
				
				companyname="SUMSUNG";
				devicename="SUMSUNG";
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
				System.out.println("2.SUMSUNG");
				System.out.println("Laptop Name : SUMSUNG");
				System.out.println("LAPTOP IP :");
				System.out.println("price :60000");
				
				companyname="SUMSUNG";
				devicename="SUMSUNG";
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
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.SUMSUNG");
				System.out.println("Laptop Name : SUMSUNG");
				System.out.println("LAPTOP IP :");
				System.out.println("price :80000");
				
				companyname="SUMSUNG";
				devicename="SUMSUNG";
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
				System.out.println("4.SUMSUNG");
				System.out.println("Laptop Name : SUMSUNG");
				System.out.println("LAPTOP IP :");
				System.out.println("price :100000");
				
				companyname="SUMSUNG";
				devicename="SUMSUNG";
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
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.SUMSUNG");
				System.out.println("Laptop Name :SUMSUNG");
				System.out.println("LAPTOP IP :");
				System.out.println("price :120000");
				
				companyname="SUMSUNG";
				devicename="SUMSUNG";
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
				//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
			}
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN SUMSUNG TAB PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));


	}

	public static void Appile() {
		// TODO Auto-generated method stub//3
		
	System.out.println("========> WELL COME TO APPLE TABLETS...!<========");
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String conD;
		String ch;
		int chCELL=0;
		do {
			System.out.println("1.APPLE TABLETS");
			System.out.println("TABLETS Name : APPLE");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.APPLE TABLETS");
			System.out.println("TABLETS Name : APPLE TABLETS");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.APPLE TABLETS");
			System.out.println("TABLETS Name : APPLE TABLETS");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.APPLE TABLETS");
			System.out.println("TABLETS Name : APPLE TABLETS");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.APPLE TABLETS");
			System.out.println("TABLETS Name : APPLE TABLETS");
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
				System.out.println("1.APPLE TABLETS");
				System.out.println("TABLETS Name : APPLE TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :40000");
				
				companyname="APPLE TABLETS";
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
				System.out.println("2.APPLE TABLETS");
				System.out.println("TABLETS Name : APPLE TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :60000");
				
				companyname="APPLE TABLETS";
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
				System.out.println("3.APPLE TABLETS");
				System.out.println("TABLETS Name : APPLE TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :80000");
				
				companyname="APPLE TABLETS";
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
				System.out.println("4.APPLE TABLETS");
				System.out.println("TABLETS Name : APPLE TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :100000");
				
				companyname="APPLE TABLETS";
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
				System.out.println("5.APPLE TABLETS");
				System.out.println("TABLETS Name : APPLE TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :120000");
				
				companyname="APPLE TABLETS";
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
	
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN APPLE TAP PLS TYPE YES ......!!!");
	
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
			System.out.println("1.LENOVO TABLETS");
			System.out.println("TABLETS Name : LENOVO TABLETS");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.LENOVO TABLETS");
			System.out.println("TABLETS Name : LENOVO TABLETS");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.LENOVO TABLETS");
			System.out.println("TABLETS Name : LENOVO TABLETS");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.LENOVO TABLETS");
			System.out.println("TABLETS Name : LENOVO TABLETS");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.LENOVO TABLETS");
			System.out.println("TABLETS Name : LENOVO TABLETS");
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
				System.out.println("1.LENOVO TABLETS");
				System.out.println("TABLETS Name : LENOVO TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :40000");
				
				companyname="LENOVO TABLETS";
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
				System.out.println("2.LENOVO TABLETS");
				System.out.println("TABLETS Name : LENOVO TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :60000");
				
				companyname="LENOVO TABLETS";
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
				System.out.println("3.LENOVO TABLETS");
				System.out.println("TABLETS Name : LENOVO TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :80000");
				
				companyname="LENOVO TABLETS";
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
				System.out.println("4.LENOVO TABLETS");
				System.out.println("TABLETS Name : LENOVO TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :100000");
				
				companyname="LENOVO TABLETS";
				devicename="inspiron 15 30000";
				ip="anil1234";
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
				System.out.println("5.LENOVO TABLETS");
				System.out.println("TABLETS Name : LENOVO TABLETS");
				System.out.println("TABLETS IP :");
				System.out.println("price :120000");
				
				companyname="LENOVO TABLETS";
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
		
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN LENOVO TABLETS PLS TYPE YES ......!!!");
		
		       conD = scstr.nextLine();
		   
			}while(conD.equalsIgnoreCase("yes"));
	}
	
	public static void iNTEL() {
		// TODO Auto-generated method stub
		System.out.println("==========> WELL COME TO INTEL TABLETS...!<=========");
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		
		int chlapi=0;
		String conD ;
		String ch;
		do {
			System.out.println("1.INTEL TABLETS");
			System.out.println("TABLETS Name : inspiron 15 3000");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.INTEL TABLETS");
			System.out.println("TABLETS Name : inspiron 15 3000");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.INTEL TABLETS");
			System.out.println("TABLETS Name : inspiron 15 3000");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.INTEL TABLETS");
			System.out.println("TABLETS Name : inspiron 15 3000");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.INTEL TABLETS");
			System.out.println("TABLETS Name : inspiron 15 3000");
			System.out.println("price :120000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlapi=sclap.nextInt();
			
			
			switch(chlapi) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.INTEL TABLETS");
				System.out.println("TABLETS Name : inspiron 15 3000");
				System.out.println("TABLETS IP :");
				System.out.println("price :40000");
				
				companyname="INTEL TABLETS";
				devicename="inspiron 15 30000";
				ip="123456789";
				price=40000;
				
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
			case 2:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("2.INTEL TABLETS");
				System.out.println("TABLETS Name : inspiron 15 3000");
				System.out.println("TABLETS IP :");
				System.out.println("price :60000");
				
				companyname="INTEL TABLETS";
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
				System.out.println("3.INTEL TABLETS");
				System.out.println("TABLETS Name : inspiron 15 3000");
				System.out.println("TABLETS IP :");
				System.out.println("price :80000");
				
				companyname="INTEL TABLETS";
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
				System.out.println("4.INTEL TABLETS");
				System.out.println("TABLETS Name : inspiron 15 3000");
				System.out.println("TABLETS IP :");
				System.out.println("price :100000");
				
				companyname="INTEL TABLETS";
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
				System.out.println("5.INTEL TABLETS");
				System.out.println("TABLETS Name : inspiron 15 3000");
				System.out.println("TABLETS IP :");
				System.out.println("price :120000");
				
				companyname="INTEL TABLETS";
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
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN INTEL TABLETS PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));

	}
}
