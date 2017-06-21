package UI;

import java.util.Scanner;

public class PrintMenu {

	
	public static void printMenu()
	{
		System.out.println("[...Temporary Code...]");
		System.out.println("If you want to see a BOXOFFICE press any key...");
		
	}
	public static void jump()
	{
		for(int i=0; i<50 ; i++)
		{
			System.out.println("");
		}
	}
	
	public static void pressKey()
	{
		System.out.println("");
		System.out.println("계속하실려면 [Enter] key누르세요.....");
		new Scanner(System.in).nextLine();
	}
	public static void sleep()
	{
		try {
			System.out.println("");
			System.out.println("2초후 이전 화면으로 돌아갑니다......");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
