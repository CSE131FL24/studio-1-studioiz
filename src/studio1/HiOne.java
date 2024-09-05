package studio1;

import java.util.Scanner;

public class HiOne {

	// Says hello to the supplied argument
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		System.out.print("What is your name? ");
		String name = s.nextLine();
		System.out.print("Hi " + name + "! How are you?");
	}

}