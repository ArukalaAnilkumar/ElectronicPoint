package company;

import java.util.Scanner;

public class switchoperationtext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner obj=new Scanner(System.in);
	
		Scanner strsc = new Scanner(System.in);
		
		String concell;
		do {
			System.out.println(" 1.++++");
			System.out.println(" 2.****");
			System.out.println(" 3.******");
			System.out.println("back");
			int ch=obj.nextInt();
		switch(ch) {
		
		case 1:
			System.out.println("1*************");
			break;
		case 2:
			System.out.println("2******************");
			break;
		case 3:
			System.out.println("3************");
			break;
		default:
			System.out.println("defalut *****");
		}
		System.out.println("\nDO YOU WANT TO CONTINUEEE IN CELL POINT PLS TYPE YES ......!!!");
		
		 
		concell =strsc.nextLine();
		
	}while(concell.equalsIgnoreCase("yes"));
	}

}
