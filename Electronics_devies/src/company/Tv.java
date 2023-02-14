package company;

import java.util.Scanner;

public class Tv {
	
	private static String companyname;
	private static String devicename;
	private static String ip;
	private static int price;
	private static	ElectronDevice electro;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void Lg() {
		// TODO Auto-generated method stub
		System.out.println(" WELL COME TO LG TV...!");
		
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String ch;
		String conD ;
		int chlap=0;
		do {
			System.out.println("1.LG");
			System.out.println("TV Name :LG");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.LG");
			System.out.println("TV Name : LG");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.LG");
			System.out.println("TV Name :LG");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.LG");
			System.out.println("TV Name : LG ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.LG");
			System.out.println("TV Name : LG ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=sclap.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.LG");
				System.out.println("TV Name : LG");
				System.out.println("TV IP :");
				System.out.println("price :40000");
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="LG";
					devicename="LG";
					ip="anil1234";
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
				System.out.println("2.LG");
				System.out.println("TV Name : LG");
				System.out.println("TV IP :");
				System.out.println("price :60000");
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
			
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				
			     electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.LG");
				System.out.println("TV Name : LG");
				System.out.println("TV IP :");
				System.out.println("price :80000");
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
		        electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="LG";
					devicename="LG";
					ip="anil1234";
					price=40000;
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.LG");
				System.out.println("TV Name : LG");
				System.out.println("TV IP :");
				System.out.println("price :100000");
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.LG");
				System.out.println("TV Name :LG");
				System.out.println("TV IP :");
				System.out.println("price :100000");
				
				companyname="LG";
				devicename="LG";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				
			     electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="LG";
					devicename="LG";
					ip="anil1234";
					price=40000;
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
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN LG TV PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	
	public static void oNEPLUS() {
		// TODO Auto-generated method stub

	System.out.println(" WELL COME TO onePLUS TV...!");
		
		
		Scanner sclap=new Scanner(System.in);
		Scanner scstr=new Scanner(System.in);
		String ch;
		String conD ;
		int chlap=0;
		do {
			System.out.println("1.onePLUS");
			System.out.println("TV Name :onePLUS");
			System.out.println("price :40000");
			
			System.out.println();
			System.out.println("2.onePLUS");
			System.out.println("TV Name : onePLUS");
			System.out.println("price :60000");

			System.out.println();
			System.out.println("3.onePLUS");
			System.out.println("TV Name :onePLUS");
			System.out.println("price :80000");
			
			System.out.println();
			System.out.println("4.onePLUS");
			System.out.println("TV Name : onePLUS ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("5.onePLUS");
			System.out.println("TV Name : onePLUS ");
			System.out.println("price :100000");
			
			System.out.println();
			System.out.println("6. GO BACK..!");
			
			System.out.println();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			chlap=sclap.nextInt();
			
			
			switch(chlap) {
			
			case 1:
				System.out.println("BOOKING NOW.....!");
				System.out.println("1.onePLUS");
				System.out.println("TV Name : onePLUS");
				System.out.println("TV IP :");
				System.out.println("price :40000");
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				 electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="onePLUS";
					devicename="onePLUS";
					ip="anil1234";
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
				System.out.println("2.onePLUS");
				System.out.println("TV Name : onePLUS");
				System.out.println("TV IP :");
				System.out.println("price :60000");
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
			
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
				
		        electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 3:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("3.onePLUS");
				System.out.println("TV Name : onePLUS");
				System.out.println("TV IP :");
				System.out.println("price :80000");
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
				
	              electro=new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="onePLUS";
					devicename="onePLUS";
					ip="anil1234";
					price=40000;
					 electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
				
				break;
			case 4:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("4.onePLUS");
				System.out.println("TV Name : onePLUS");
				System.out.println("TV IP :");
				System.out.println("price :100000");
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
			}
			else if(ch.equalsIgnoreCase("cancel")) {
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				 electro =new ElectronDevice();
				electro.Electroremove(companyname, devicename, ip, price);
			}
			else if(ch.equalsIgnoreCase("continues")) {
				
			}
				break;
			case 5:
				System.out.println("BOOKING NOW.....!");
				System.out.println();
				System.out.println("5.onePLUS");
				System.out.println("TV Name :onePLUS");
				System.out.println("TV IP :");
				System.out.println("price :100000");
				
				companyname="onePLUS";
				devicename="onePLUS";
				ip="anil1234";
				price=40000;
				
				System.out.println("BOOKING NOW ENTER YES :");
				System.out.println("BOOKING CANCEL ENTER CANCEL :");
				System.out.println(" ENTER CONTINUES :");
				 ch = scstr.nextLine();
				if(ch.equalsIgnoreCase("YES")) {
					
				
			     electro =new ElectronDevice();
				electro.ElectroAdd(companyname, devicename, ip, price);
				System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="onePLUS";
					devicename="onePLUS";
					ip="anil1234";
					price=40000;
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
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN onePLUS TV PLS TYPE YES ......!!!");
			
			  conD = scstr.nextLine();
			
		}while(conD.equalsIgnoreCase("yes"));

	}
	public static void GIGABYTE() {
		// TODO Auto-generated method stub


		System.out.println(" WELL COME TO GIGABYTE TV...!");
			
			
			Scanner sclap=new Scanner(System.in);
			Scanner scstr=new Scanner(System.in);
			String ch;
			String conD ;
			int chlap=0;
			do {
				System.out.println("1.GIGABYTE");
				System.out.println("TV Name :GIGABYTE");
				System.out.println("price :40000");
				
				System.out.println();
				System.out.println("2.GIGABYTE");
				System.out.println("TV Name : GIGABYTE");
				System.out.println("price :60000");

				System.out.println();
				System.out.println("3.GIGABYTE");
				System.out.println("TV Name :GIGABYTE");
				System.out.println("price :80000");
				
				System.out.println();
				System.out.println("4.GIGABYTE");
				System.out.println("TV Name : GIGABYTE ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("5.GIGABYTE");
				System.out.println("TV Name : GIGABYTE ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("6. GO BACK..!");
				
				System.out.println();
				System.out.println("ENTER THE YOUR CHOOSE : ");
				chlap=sclap.nextInt();
				
				
				switch(chlap) {
				
				case 1:
					System.out.println("BOOKING NOW.....!");
					System.out.println("1.GIGABYTE");
					System.out.println("TV Name : GIGABYTE");
					System.out.println("TV IP :");
					System.out.println("price :40000");
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="GIGABYTE";
						devicename="GIGABYTE";
						ip="anil1234";
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
					System.out.println("2.GIGABYTE");
					System.out.println("TV Name : GIGABYTE");
					System.out.println("TV IP :");
					System.out.println("price :60000");
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
				
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					
				    electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
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
					System.out.println("TV Name : GIGABYTE");
					System.out.println("TV IP :");
					System.out.println("price :80000");
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
			         electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="GIGABYTE";
						devicename="GIGABYTE";
						ip="anil1234";
						price=40000;
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
					System.out.println("TV Name : GIGABYTE");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
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
					System.out.println("TV Name :GIGABYTE");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="GIGABYTE";
					devicename="GIGABYTE";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="GIGABYTE";
						devicename="GIGABYTE";
						ip="anil1234";
						price=40000;
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
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN GIGABYTE TV PLS TYPE YES ......!!!");
				
				  conD = scstr.nextLine();
				
			}while(conD.equalsIgnoreCase("yes"));

	}
	
	public static void ACER() {
		// TODO Auto-generated method stub


		System.out.println(" WELL COME TO ACER TV...!");
			
			
			Scanner sclap=new Scanner(System.in);
			Scanner scstr=new Scanner(System.in);
			String ch;
			String conD ;
			int chlap=0;
			do {
				System.out.println("1.ACER");
				System.out.println("TV Name :ACER");
				System.out.println("price :40000");
				
				System.out.println();
				System.out.println("2.ACER");
				System.out.println("TV Name : ACER");
				System.out.println("price :60000");

				System.out.println();
				System.out.println("3.ACER");
				System.out.println("TV Name :ACER");
				System.out.println("price :80000");
				
				System.out.println();
				System.out.println("4.ACER");
				System.out.println("TV Name : ACER ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("5.ACER");
				System.out.println("TV Name : ACER ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("6. GO BACK..!");
				
				System.out.println();
				System.out.println("ENTER THE YOUR CHOOSE : ");
				chlap=sclap.nextInt();
				
				
				switch(chlap) {
				
				case 1:
					System.out.println("BOOKING NOW.....!");
					System.out.println("1.ACER");
					System.out.println("TV Name : ACER");
					System.out.println("TV IP :");
					System.out.println("price :40000");
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					//ElectronDevice electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="ACER";
						devicename="ACER";
						ip="anil1234";
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
					System.out.println("2.ACER");
					System.out.println("TV Name : ACER");
					System.out.println("TV IP :");
					System.out.println("price :60000");
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
				
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					
				 electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
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
					System.out.println("TV Name : ACER");
					System.out.println("TV IP :");
					System.out.println("price :80000");
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
			        electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="ACER";
						devicename="ACER";
						ip="anil1234";
						price=40000;
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
					System.out.println("TV Name : ACER");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
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
					System.out.println("TV Name :ACER");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="ACER";
					devicename="ACER";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="ACER";
						devicename="ACER";
						ip="anil1234";
						price=40000;
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
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN ACER TV PLS TYPE YES ......!!!");
				
				  conD = scstr.nextLine();
				
			}while(conD.equalsIgnoreCase("yes"));

	}
	
	public static void SONY() {
		// TODO Auto-generated method stub


		System.out.println(" WELL COME TO SONY TV...!");
			
			
			Scanner sclap=new Scanner(System.in);
			Scanner scstr=new Scanner(System.in);
			String ch;
			String conD ;
			int chlap=0;
			do {
				System.out.println("1.SONY");
				System.out.println("TV Name :SONY");
				System.out.println("price :40000");
				
				System.out.println();
				System.out.println("2.SONY");
				System.out.println("TV Name : SONY");
				System.out.println("price :60000");

				System.out.println();
				System.out.println("3.SONY");
				System.out.println("TV Name :SONY");
				System.out.println("price :80000");
				
				System.out.println();
				System.out.println("4.SONY");
				System.out.println("TV Name : SONY ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("5.SONY");
				System.out.println("TV Name : SONY ");
				System.out.println("price :100000");
				
				System.out.println();
				System.out.println("6. GO BACK..!");
				
				System.out.println();
				System.out.println("ENTER THE YOUR CHOOSE : ");
				chlap=sclap.nextInt();
				
				
				switch(chlap) {
				
				case 1:
					System.out.println("BOOKING NOW.....!");
					System.out.println("1.SONY");
					System.out.println("TV Name : SONY");
					System.out.println("TV IP :");
					System.out.println("price :40000");
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					 electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="SONY";
						devicename="SONY";
						ip="anil1234";
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
					System.out.println("2.SONY");
					System.out.println("TV Name : SONY");
					System.out.println("TV IP :");
					System.out.println("price :60000");
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
				
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					
					
				    electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
					break;
				case 3:
					System.out.println("BOOKING NOW.....!");
					System.out.println();
					System.out.println("3.SONY");
					System.out.println("TV Name : SONY");
					System.out.println("TV IP :");
					System.out.println("price :80000");
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="SONY";
						devicename="SONY";
						ip="anil1234";
						price=40000;
						electro =new ElectronDevice();
						electro.Electroremove(companyname, devicename, ip, price);
					}
					else if(ch.equalsIgnoreCase("continues")) {
						
					}
					
					break;
				case 4:
					System.out.println("BOOKING NOW.....!");
					System.out.println();
					System.out.println("4.SONY");
					System.out.println("TV Name : SONY");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
				}
				else if(ch.equalsIgnoreCase("cancel")) {
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					electro =new ElectronDevice();
					electro.Electroremove(companyname, devicename, ip, price);
				}
				else if(ch.equalsIgnoreCase("continues")) {
					
				}
					break;
				case 5:
					System.out.println("BOOKING NOW.....!");
					System.out.println();
					System.out.println("5.SONY");
					System.out.println("TV Name :SONY");
					System.out.println("TV IP :");
					System.out.println("price :100000");
					
					companyname="SONY";
					devicename="SONY";
					ip="anil1234";
					price=40000;
					
					System.out.println("BOOKING NOW ENTER YES :");
					System.out.println("BOOKING CANCEL ENTER CANCEL :");
					System.out.println(" ENTER CONTINUES :");
					 ch = scstr.nextLine();
					if(ch.equalsIgnoreCase("YES")) {
						
					
					 electro =new ElectronDevice();
					electro.ElectroAdd(companyname, devicename, ip, price);
					System.out.println(" BOOKING COMPLETED....!");
					}
					else if(ch.equalsIgnoreCase("cancel")) {
						
						companyname="SONY";
						devicename="SONY";
						ip="anil1234";
						price=40000;
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
				System.out.println("\nDO YOU WANT TO CONTINUEEE IN SONY TV PLS TYPE YES ......!!!");
				
				  conD = scstr.nextLine();
				
			}while(conD.equalsIgnoreCase("yes"));

	}
}
