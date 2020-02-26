package unit9;

import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner

{

	public static ArrayList<Integer> initArrayList(int[] ints) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : ints) {
			list.add(i);
		}
		return list;
	}

	public static void main(String args[]) {

		int[] alpha = { -99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5 };
		ArrayList<Integer> alfa = new ArrayList<Integer>();
		alfa = initArrayList(alpha);
		System.out.println(ListSumFirst.returnGreaterValues(alfa));

		int[] beta = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99 };
		ArrayList<Integer> bravo = new ArrayList<Integer>();
		bravo = initArrayList(beta);
		System.out.println(ListSumFirst.returnGreaterValues(bravo));

		int[] gamma = { 10, 20, 30, 40, 50, -11818, 40, 30, 20, 10 };
		ArrayList<Integer> charlie = new ArrayList<Integer>();
		charlie = initArrayList(gamma);
		System.out.println(ListSumFirst.returnGreaterValues(charlie));

		int[] delta = { 32767 };
		ArrayList<Integer> d = new ArrayList<Integer>();
		d = initArrayList(delta);
		System.out.println(ListSumFirst.returnGreaterValues(d));

		int[] epsilon = { 255, 255 };
		ArrayList<Integer> echo = new ArrayList<Integer>();
		echo = initArrayList(epsilon);
		System.out.println(ListSumFirst.returnGreaterValues(echo));

		int[] f = { 9, 10, -88, 100, -555, 2 };
		ArrayList<Integer> foxtrot = new ArrayList<Integer>();
		foxtrot = initArrayList(f);
		System.out.println(ListSumFirst.returnGreaterValues(foxtrot));

		int[] g = { 10, 10, 10, 11, 456 };
		ArrayList<Integer> golf = new ArrayList<Integer>();
		golf = initArrayList(g);
		System.out.println(ListSumFirst.returnGreaterValues(golf));

		int[] h = { -111, 1, 2, 3, 9, 11, 20, 1 };
		ArrayList<Integer> hotel = new ArrayList<Integer>();
		hotel = initArrayList(h);
		System.out.println(ListSumFirst.returnGreaterValues(hotel));

		int[] i = { 9, 8, 7, 6, 5, 4, 3, 2, 0, -2, 6 };
		ArrayList<Integer> india = new ArrayList<Integer>();
		india = initArrayList(i);
		System.out.println(ListSumFirst.returnGreaterValues(india));

		int[] j = { 12, 15, 18, 21, 23, 1000 };
		ArrayList<Integer> juliette = new ArrayList<Integer>();
		juliette = initArrayList(j);
		System.out.println(ListSumFirst.returnGreaterValues(juliette));

		int[] k = { 250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, 0 };
		ArrayList<Integer> kilo = new ArrayList<Integer>();
		kilo = initArrayList(k);
		System.out.println(ListSumFirst.returnGreaterValues(kilo));

		int[] l = { 9, 10, -8, 10000, -5000, -3000 };
		ArrayList<Integer> lima = new ArrayList<Integer>();
		lima = initArrayList(l);
		System.out.println(ListSumFirst.returnGreaterValues(lima));

	}
}