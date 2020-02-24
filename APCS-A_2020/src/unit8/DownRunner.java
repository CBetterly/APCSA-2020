package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{
		int[] array1 = {-99,1,2,3,4,5,6,7,8,9,10,12345};
		RayDown ray1 = new RayDown(array1);
		
		int[] array2 = {10,9,8,7,6,5,4,3,2,1,-99};
		RayDown ray2 = new RayDown(array2);
		
		int[] array3 = {10,20,30,40,50,-11818,40,30,20,10};
		RayDown ray3 = new RayDown(array3);
		
		int[] array4 = {32767};
		RayDown ray4 = new RayDown(array4);
		
		int[] array5 = {255,255};
		RayDown ray5 = new RayDown(array5);
		
		int[] array6 = {9,10,-88,100,-555,1000};
		RayDown ray6 = new RayDown(array6);
		
		int[] array7 = {10,10,10,11,456};
		RayDown ray7 = new RayDown(array7);
		
		int[] array8 = {-111,1,2,3,9,11,20,30};
		RayDown ray8 = new RayDown(array8);
		
		int[] array9 = {9,8,7,6,5,4,3,2,0,-2,-989};
		RayDown ray9 = new RayDown(array9);
		
		int[] array10 = {12,15,18,21,23,1000};
		RayDown ray10 = new RayDown(array10);
		
		int[] array11 = {250,19,17,15,13,11,10,9,6,3,2,1,-455};
		RayDown ray11 = new RayDown(array11);
		
		int[] array12 = {9,10,-8,10000,-5000,1000};
		RayDown ray12 = new RayDown(array12);
	}
}