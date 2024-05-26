package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist1 {
	public static void main(String ar[]) {

		System.out.println(" Birinchi topshiriq");
		List<String> ranglar = new ArrayList<String>();
		ranglar.add("qizil");
		ranglar.add("yashil");
		ranglar.add("sariq");
		ranglar.add("ko'k");
		ranglar.add("qora");
		ranglar.add("jigarang");
		ranglar.add("siyohrang");
		System.out.println(ranglar);
		ranglar.set(0, "pushti");
		System.out.println(ranglar);
		List<String> ranglar2 = new ArrayList<String>(ranglar);
		System.out.println("Elementlar soni: " + ranglar.size());

		System.out.println(" Ikkinchi topshiriq");
		checkqiymat(ranglar, "siyohrang");
		copylist(ranglar);
		aralashtiruvchi(ranglar2);

		System.out.println(" Uchinchi topshiriq");
		reverseqilish(ranglar);
		qirqish(ranglar);

		System.out.println(" To'rtinchi topshiriq");
		taqqoslovchi(ranglar);

		System.out.println(" Beshinchi topshiriq");
		almashtiruvchi(ranglar);
		birlashtiruvchi(ranglar, ranglar2);
		listhajmi();
	}

	public static void checkqiymat(List abd, String ab) {
		if (abd.contains(ab)) {
			System.out.println("Ushbu qiymat ro'yhatda mavjud: " + ab);
		} else {
			System.out.println("Bunday qiymat ro'yhatda mavjud emas: " + ab);
		}
	}

	public static void copylist(List abd) {
		List<String> ranglar2 = new ArrayList<String>(abd);
		System.out.println("ranglar: " + abd);
		System.out.println("ranglar2: " + ranglar2);
	}

	public static void aralashtiruvchi(List<?> abd) {
		Collections.shuffle(abd);
		System.out.println("Aralashma: " + abd);
	}

	public static void reverseqilish(List<String> abd) {
		Collections.reverse(abd);
		System.out.println("Teskari tartib: " + abd);
	}

	public static void qirqish(List<String> abd) {
		System.out.println("Qism: " + abd.subList(1, 4));

	}

	public static void taqqoslovchi(List<String> abd) {
		List<String> list1 = Arrays.asList("bulut", "jigarang", "qora", "avtomobil", "poyezd");
		for (int i = 0; i < Math.min(list1.size(), abd.size()); i++) {
			if (list1.get(i).equals(abd.get(i))) {
				System.out.print("Yes;");
			} else {

				System.out.print("No;");
			}
		}
	}

	public static void almashtiruvchi(List<String> abd) {
		System.out.println("Old: " + abd);
		Collections.swap(abd, 0, 4);
		System.out.println("New: " + abd);
	}

	public static void listhajmi() {
		List<String> newlist = new ArrayList<String>(2);
		newlist.add("osmon");
		newlist.add("yulduz");
		newlist.add("quyosh");
		if (newlist.size() > 2) {
			((ArrayList<String>) newlist).ensureCapacity(5);
		}
		System.out.println(newlist);
	}

	public static void birlashtiruvchi(List<String> ab, List<String> abc) {
		ab.addAll(abc);
		System.out.println(ab);
	}
}
