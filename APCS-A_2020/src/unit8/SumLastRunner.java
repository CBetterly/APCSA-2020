package unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumLastRunner
{
	public static void main( String args[] )
	{
		int[] uno = {-99,1,2,3,4,5,6,7,8,9,10,5};
		RaySumLast one = new RaySumLast(uno);
		
		int[] dos = {10,9,8,7,6,5,4,3,2,1,-99};
		RaySumLast two = new RaySumLast(dos);
		
		int[] tres = {10,20,30,40,50,-11818,40,30,20,10};
		RaySumLast three = new RaySumLast(tres);
		
		int[] cuatro = {32767};
		RaySumLast four = new RaySumLast(cuatro);
		
		int[] cinco = {255,255};
		RaySumLast five = new RaySumLast(cinco);
		
		int[] seis = {9,10,-88,100,-555,2};
		RaySumLast six = new RaySumLast(seis);
		
		int[] siete = {10,10,10,11,456};
		RaySumLast seven = new RaySumLast(siete);
		
		int[] ocho = {-111,1,2,3,9,11,20,1};
		RaySumLast eight = new RaySumLast(ocho);
		
		int[] nueve = {9,8,7,6,5,4,3,2,0,-2,6};
		RaySumLast nine = new RaySumLast(nueve);
		
		int[] dies = {12,15,18,21,23,1000};
		RaySumLast ten = new RaySumLast(dies);
		
		int[] once = {250,19,17,15,13,11,10,9,6,3,2,1,0};
		RaySumLast eleven = new RaySumLast(once);
		
		int[] doce = {9,10,-8,10000,-5000,-3000};
		RaySumLast twelve = new RaySumLast(doce);
	}
}