package linkedlist1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class LinkedlistVazifa {

	public static void main(String argo[]) {
		LinkedList<String> linked = new LinkedList<String>();
		linked.add("Salom");
		linked.add("Hello");
		linked.add("Bonjour");
		linked.add("Hola");
		linked.add("Privet");
		getlinked(linked);
		reversetartib(linked);
//        clearlinked(linked);
	System.out.println(" Ikkinchi topshiriq;");
		addfirst(linked);
		addlast(linked);
		firstAndLast(linked);
	System.out.println(" Uchinchi topshiriq");
		removefirst(linked);
		removeLast(linked);
	System.out.println(" To'rtinchi topshiriq");
		LinkedList<String> linked2 = new LinkedList<String>(Arrays.asList("Ni hao", "Ola"));
		birlashtiruvchi(linked, linked2);
		copylinked(linked);
		allwithoutfirst(linked);
	System.out.println(" Beshinchi topshiriq");
		aralashtiruvchi(linked);
		ToArraylist(linked);
		LinkedList<Integer> numbers = new LinkedList<Integer>(Arrays.asList(5, 33, 2, 11));
		sorting(linked);
		checkqiymat(linked, "Ola");
	}

	public static void getlinked(LinkedList<String> ab) {
		for (Iterator<String> iterator = ab.iterator(); iterator.hasNext();) {
			String string1 = (String) iterator.next();
			System.out.println(string1);
		}
	}

	public static void clearlinked(LinkedList<String> ab) {
		ab.clear();
		System.out.println(ab);

	}

	public static void reversetartib(LinkedList<String> ab) {
		Collections.reverse(ab);
		System.out.println(ab);
	}

	public static void addfirst(LinkedList<String> ab) {
		ab.addFirst("AnnyongHaseyo");
		System.out.println(ab);
	}

	public static void addlast(LinkedList<String> ab) {
		ab.addLast("Ciao");
		System.out.println(ab);
	}

	public static void firstAndLast(LinkedList<String> abbb) {
		System.out.printf("%s, %S\n", abbb.getFirst(), abbb.getLast());
	}

	public static void deletebyIndex(LinkedList<String> a, int b) {
		;
		System.out.println(a.remove(b));
	}

	public static void removefirst(LinkedList<String> k) {
		System.out.println(k.removeFirst());
		System.out.println(k);
	}

	public static void removeLast(LinkedList<String> d) {
		System.out.println(d.removeLast());
	}

	public static void birlashtiruvchi(LinkedList<String> ab, LinkedList<String> ad) {
		ab.addAll(ad);
		System.out.println(ab);
	}

	public static void copylinked(LinkedList<String> ab) {
		LinkedList<String> list = new LinkedList<String>(ab);
		System.out.println(list);
	}

	public static void allwithoutfirst(LinkedList<String> ab) {
		ab.remove(0);
		System.out.println(ab);
	}

	public static void aralashtiruvchi(LinkedList<String> aa) {
		Collections.shuffle(aa);
		System.out.println(aa);
	}

	public static void ToArraylist(LinkedList<String> aa) {
		ArrayList<String> arraylist = new ArrayList<String>(aa);
		System.out.println(arraylist);
	}

	public static void sorting(LinkedList<String> aa) {
		System.out.println(aa.stream().sorted(Comparator.comparingInt(String::length).reversed())
				.collect(Collectors.toCollection(LinkedList::new)));
	}

	public static void checkqiymat(LinkedList<String> abd, String ab) {
		if (abd.contains(ab)) {
			System.out.println("Ushbu qiymat ro'yhatda mavjud: " + ab);
		} else {
			System.out.println("Bunday qiymat ro'yhatda mavjud emas: " + ab);
		}
	}
}
