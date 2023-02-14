package company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <Properties> propertices=new ArrayList<Properties>();
		Scanner strsc=new Scanner(System.in);
		Scanner sclap=new Scanner(System.in);
		int ch=0;
		String conEND;
		System.out.println("\n================>  WELCOME TO ELECTRONICS POINT <=============\n\n");
		do {
			
			System.out.println("=====> CHOOSE UR OPTION FROM BELOW ELECTRONICS POINT ....!!<======\n");

//			System.out.println("1.LAPTOP");
//			System.out.println("2.CELL");
//			System.out.println("3.TAB");
//			System.out.println("4.TV");
			Oparation.DevicePoint();
			System.out.println("ENTER THE YOUR CHOOSE : ");
			ch=sclap.nextInt();
			
			switch(ch) {
			
			case 1:
				System.out.println("=======> WELL COME TO LAPTOP POINT :- ");
				int chlap=0;
				String con;
				do {					
					Oparation.laptopPoint();

					System.out.println("ENTER THE YOUR CHOOSE : ");
					chlap=sclap.nextInt();
					
					switch(chlap) {
					
					case 1:
						System.out.println("1.DELL");
						Laptop.dELL();
						System.out.println("*** THANK YOU ***");
						break;
					case 2:
						System.out.println("2.INTEL");
						Laptop.iNTEL();
						System.out.println("*** THANK YOU ***");
						break;
					case 3:
						System.out.println("3.GIGABYTE");
						Laptop.gIGABYTE();
						System.out.println("*** THANK YOU ***");
						break;
					case 4:
						System.out.println("4.ACER");
						Laptop.aCER();
						System.out.println("*** THANK YOU ***");
						break;
					case 5:
						System.out.println("5.IBM");
						Laptop.iBM();
						System.out.println("*** THANK YOU ***");
						break;
					default:
						System.out.println("===============================================================================");
						
						//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
					}
					
					System.out.println("\nDO YOU WANT TO CONTINUEEE IN LAPTOP POINT PLS TYPE YES ......!!!");
					
					 con =strsc.nextLine();
					
				}while(con.equalsIgnoreCase("yes"));
			
				break;
				
				
			case 2:
				System.out.println("=========>WELL COME TO CELL POINT :-");
			
				String concell;
				int chCELL;
				do {
//					
					Oparation.CellPoint();
					System.out.println("ENTER THE YOUR CHOOSE : ");
					chCELL=sclap.nextInt();
					
					switch(chCELL) {
					
					case 1:
						System.out.println("1.MI");
						Cell.MI();
						System.out.println("*** THANK YOU ***");
						break;
					case 2:
						System.out.println("2.NOKIA");
						Cell.nOKIA();
						System.out.println("*** THANK YOU ***");
						break;
					case 3:
						System.out.println("3.APPLE");
						Cell.apple();
						System.out.println("*** THANK YOU ***");
						break;
					case 4:
						System.out.println("4.OPPO");
						Cell.oPPO();
						System.out.println("*** THANK YOU ***");
						break;
					case 5:
						System.out.println("5.LENOVO");
						Cell.lenovo();
						System.out.println("*** THANK YOU ***");
						break;
					default:
						//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
						System.out.println("===============================================================================");
					}
					//Oparation.CellPoint();
					System.out.println("\nDO YOU WANT TO CONTINUEEE IN CELL POINT PLS TYPE YES ......!!!");
					
					 concell =strsc.nextLine();
					
				}while(concell.equalsIgnoreCase("yes"));
			

				
				break;
			case 3:
				System.out.println("=========>WELL COME TO TAB :-");
				 String contap ;
				int chTAB=0;
				do {
//					System.out.println("1.REALME");
//					System.out.println("2.SUMSUNG");
//					System.out.println("3.*****");
//					System.out.println("4.*****");
//					System.out.println("5.****");
					Oparation.tapPoint();
					System.out.println("ENTER THE YOUR CHOOSE : ");
					chTAB=sclap.nextInt();
					
					switch(chTAB) {
					
					case 1:
						System.out.println("1.REALME");
						Tab.rEALME();
						System.out.println("*** THANK YOU ***");
						break;
					case 2:
						System.out.println("2.SUMSUNG");
						Tab.sUMSUNG();
						System.out.println("*** THANK YOU ***");
						break;
					case 3:
						System.out.println("3.APPLE");
						Tab.Appile();;
						break;
					case 4:
						System.out.println("4.LENOVO");
						Tab.lenovo();;
						break;
					case 5:
						System.out.println("5.INTEL");
						Tab.iNTEL();;
						break;
					default:
						//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
						System.out.println("===============================================================================");
					}
					//Oparation.tapPoint();
					System.out.println("\nDO YOU WANT TO CONTINUEEE IN TAB POINT PLS TYPE YES ......!!!");
					
					  contap = strsc.nextLine();
					
				}while(contap.equalsIgnoreCase("yes"));
			
				break;
				
				
			case 4:
				System.out.println("=======>WELL COME TO TV :-");
				String contv;
				int chTV=0;
				do {
//					System.out.println("1.LG");
//					System.out.println("2.1+");
//					System.out.println("3.****");
//					System.out.println("4.----");
//					System.out.println("5.++++");
					Oparation.tvPoint();
					System.out.println("ENTER THE YOUR CHOOSE : ");
					chTV=sclap.nextInt();
					
					switch(chTV) {
					
					case 1:
						System.out.println("1.LG");
						Tv.Lg();
						System.out.println("*** THANK YOU ***");
						break;
					case 2:
						System.out.println("2.onePLUS");
				         Tv.oNEPLUS();;
						System.out.println("*** THANK YOU ***");
						break;
					case 3:
						System.out.println("3.GIGABYTE");
						Tv.GIGABYTE();;
						break;
					case 4:
						System.out.println("4.ACER");
						Tv.ACER();;
						break;
					case 5:
						System.out.println("5.SONY");
						Tv.SONY();;
						break;
					default:
						System.out.println("===============================================================================");
						//System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
					}
					//Oparation.tvPoint();
					System.out.println("\nDO YOU WANT TO CONTINUEEE IN TV POINT PLS TYPE YES ......!!!");
					
					   contv = strsc.nextLine();
					
					
				}while(contv.equalsIgnoreCase("yes"));
				
				
				//electronic point 
			
			default:
				System.out.println("===============================================================================");
				// System.out.println("CHEERS OF THE DAY .... U HAVE CHOOSEN SOMETHING DIFFERENT  !!");
				break;
			}
			
			Oparation.DevicePoint();
			System.out.println("\nDO YOU WANT TO CONTINUEEE IN ELECTRONIC POINT TYPE YES ......!!!");
			System.out.println("=======================================================================================");
			
			   conEND = strsc.nextLine();
			
		}while(conEND.equalsIgnoreCase("yes"));
		
		System.out.println("===========================> SUCCESSFULLY COMPLETED...!<===================================");
			System.out.println();
	}

}
