package unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Perfect
{
   private int number;
   private int sum;

	public Perfect() {
		number = 0;
		this.isPerfect();
	}
	
	public Perfect(int passedNum) {
		number = passedNum;
		if(this.isPerfect()) {
			System.out.println(number + " is perfect.");
		} else {
			System.out.println(number + " is not perfect.");
		}
	}


	public boolean isPerfect()
	{
		for(int i = 1; i<number/2;i++) {
			if(number % i == 0) {
				//add I to sum
				sum+=i;
			}
		}
		//System.out.println("\n" + sum);
		if(sum*2==number) {
			return true;
		}
		return false;
	}

	//add a toString	
	
}