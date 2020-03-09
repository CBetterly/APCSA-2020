package unit10;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore13
{
	private ArrayList<Toy> toyList;

	public ToyStore13()
	{
		toyList = new ArrayList<Toy>();
	}

	public void loadToys( String toys )
	{
		String[] bruh = toys.split(" ");
		for(String boi: bruh) {
			toyList.add(new Toy(boi));
		}
		
		/*for(int i = 0; i < toys.length(); i++) {
			toyList.add(new Toy(toys.substring(i,toys.indexOf(" ", i+1))));
			System.out.println(toyList);
		}*/
	}
  
  	public Toy getThatToy( String nm )
  	{
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		return "";
  	}  
  
  	public void sortToysByCount()
  	{
  	} 
  	
  	public void myName(){//made void return type because it was indicated that it was wanted printed in the method
  		System.out.println("Connor Betterly");
  	}
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}