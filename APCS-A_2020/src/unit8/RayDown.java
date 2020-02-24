package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayDown
{
	public RayDown(int[] numArray) {
		System.out.println("Is it descending? " + isDescending(numArray));
	}
	
	private boolean isDescending(int[] numArray) {
		/*if(numArray.length<=1) {
			return false;
		}*/
		int low = numArray[0];
		for(int i = 1; i<numArray.length; i++) {
			if(low<=numArray[i]) {
				return false;
			}
			low = numArray[i];
		}
		return true;
	}
	
	public static boolean go(int[] numArray)
	{
		return true;
	}	
}