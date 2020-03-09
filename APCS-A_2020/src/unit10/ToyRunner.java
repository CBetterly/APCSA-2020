package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy toy1 = new Toy();
		Toy toy2 = new Toy("Hotwheels Fiat 500e Luminosa edition");
		System.out.println(toy1);
		System.out.println(toy2);
	}
}