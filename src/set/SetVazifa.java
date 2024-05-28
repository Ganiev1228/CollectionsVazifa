package set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import arraylist.Arraylist1;

public class SetVazifa {

	public static void main(String ar[]) {

		Set<String> s1 = new HashSet<String>();
		s1.add("bir");
		s1.add("ikki");
		s1.add("uch");
		s1.add("to'rt");
		s1.add("besh");
		s1.add("olti");
		getall(s1);
		reverseSet(s1);
		System.out.println(" Ikkinchi topshiriq");
		sizeSet(s1);
		nullorfull(s1);
//	    clearset(s1);
		System.out.println(" Uchinchi topshiriq");
		Set<String> s2 = new HashSet<String>(s1);
		s2.add("sakkiz");
		s1.add("to'qqiz");

		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);

		List<String> list = new ArrayList<String>(s2);
		list.add("yetti");
		juftindex(list);
		System.out.println(" \nTo'rtinchi topshiriq");
		equality(s1, s2);
		dontcontain(s1, s2);
		System.out.println(" Beshinchi topshiriq");
		NoInSecond(s1, s2);
		NoInFirst(s1, s2);
		Set<Integer> int1 = new HashSet<Integer>(Arrays.asList(1,2,3,5,0,2));
		System.out.println(int1);
		
		Set<Integer> int2 = new HashSet<Integer>(Arrays.asList(87,21,32,58,4,29));
		System.out.println(int1);
		Juftelements(int1, int2);
        		
	}

	public static void getall(Set<String> s1) {
		for (Iterator<String> it = s1.iterator(); it.hasNext();) {
			String st = it.next();
			System.out.println(st);
		}
	}

	public static void reverseSet(Set<String> aa) {
		ArrayList<String> ls = new ArrayList<String>(aa);
		Collections.reverse(ls);
		System.out.println(new LinkedHashSet<String>(ls));
	}

	public static void sizeSet(Set<String> dd) {
		System.out.println("To'plam hajmi: " + dd.size());
	}

	public static void nullorfull(Set<String> aa) {
		if (aa.isEmpty()) {
			System.out.println("To'plam bo'sh");
		} else {
			System.out.println("To'plam bo'sh emas.");
		}
	}

	public static void clearset(Set<String> cl) {
		cl.clear();
		System.out.println(cl);
	}

	public static void juftindex(List<String> aa) {
		List<String> list = new ArrayList<String>();
		
		for (int i = 1; i < aa.size(); i++) {
			if (i % 2 == 0) {
				list.add(aa.get(i));
			}
		}
		System.out.printf("Juft index: "+list);
	}

	public static void equality(Set<String> s1, Set<String> s2) {
			List<String> l1 = new ArrayList<String>();
			Iterator<String> it1 = s1.iterator();
			Iterator<String> it2 = s2.iterator();
			while (it2.hasNext()) {
				String st2 = it2.next();
				if (s1.contains(st2)) {
					l1.add(st2);
				}
			}
		System.out.println("O'xshash qiymatlar: "+l1);
	}

	public static void dontcontain(Set<String> s1, Set<String> s2) {
		List<String> l1 = new ArrayList<String>();
		Iterator<String> it1 = s1.iterator();
		Iterator<String> it2 = s2.iterator();
		while (it2.hasNext()) {
			String st2 = it2.next();
			if (!s1.contains(st2)) {
				l1.add(st2);
			}
		}
		while (it1.hasNext()) {
			String st1 = it1.next();
			if (!s2.contains(st1)) {
				l1.add(st1);
			}
		}
		System.out.println("Ikki toplamda ozaro mavjud bolmagan elements: " + l1);
//		for (String st1 : s1) {
//			if (!s2.contains(st1)) {
//				l1.add(st1);
//			}
//		}
//		for (String st2 : s2) {
//			if (!s1.contains(st2)) {
//				l1.add(st2);
//			}
//		}
//		System.out.println("Ikki toplamda ozaro mavjud bolmagan elements: " + l1);
	}

	public static void NoInSecond(Set<String> s1, Set<String> s2) {
		List<String> list = new ArrayList<String>();
		for (String st1 : s1) {
			if (!s2.contains(st1)) {
				list.add(st1);
			}
		}
		System.out.println("Ikkinchi toplamda mavjud bo'lmagan birinchi to'plam elementlari: " + list);
	}

	public static void NoInFirst(Set<String> s1, Set<String> s2) {
		List<String> list = new ArrayList<String>();
		for (String st2 : s2) {
			if (!s1.contains(st2)) {
				list.add(st2);
			}
		}
		System.out.println("Birinchi toplamda mavjud bo'lmagan ikkinchi to'plam elementlari: " + list);
	}
	public static void Juftelements (Set<Integer>s1, Set<Integer>s2) {
		List<Integer> list = new ArrayList<Integer>();
		for (Integer int1 : s1) {
			if(int1>0 && int1 % 2 ==0) {
				list.add(int1);
			}
		}
		for (Integer int2 : s2) {
			if(int2 > 0 && int2 % 2 ==0) {
				list.add(int2);
			}
		} System.out.println("Juft elementlar: "+list);
	}
}