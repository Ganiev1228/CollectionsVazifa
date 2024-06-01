package map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;


public class MapVazifa {
	
	public static void main (String []ar) {
	  Map<Integer, String> mp = new HashMap<Integer, String>();
	  mp.put(1, "USA");
	  mp.put(3, "Russia");
	  mp.put(2, "China");
	  mp.put(4, "India");
	  mp.put(5, "Australia");
	  mp.put(6, "Europe");
	  System.out.println(mp);
	  System.out.println("Map to'plami hajmi: "+mp.size());
	  System.out.println(" Ikkinchi topshiriq.");
	  Map<Integer, String> mp2 = new HashMap<Integer, String>();
	  mp2.put(7, "France");
	  mp2.put(8, "England");
	  mp2.putAll(mp);
	  for (Map.Entry<Integer, String>  str : mp2.entrySet()) {
		   System.out.print(str.getValue()+", ");
	}
//	  mp2.clear();
	  System.out.println(" \n Uchinchi topshiriq.");
	  Map<Integer, String> klon = new HashMap<Integer, String>(mp2);
	  klontolist(klon);
	  System.out.println(" To'rtinchi topshiriq.");
	  NavigableMap<Integer, String> tr = new TreeMap<Integer, String>();
	  tr.put(2, "chocolate");
	  tr.put(3, "cacao");
	  tr.put(4, "sugar");
	  tr.put(1, "coffee");
	  Map.Entry<Integer, String> st = tr.firstEntry();
	  Map.Entry<Integer, String> st2 = tr.lastEntry();
	  System.out.printf("First entry: %s,Last entry: %s ", st,st2);
	  reversekeys(mp);
	  System.out.println(" Beshinchi topshiriq");
	  smallFrom(mp, 3);
	  treesetKeys(tr);
	  tr.clear();
	  }
	public static void klontolist (Map<Integer, String> map) {
		List<?> ls = new ArrayList<>(map.values());
		System.out.println(ls);
	}
	public static void reversekeys (Map<Integer, String>m) {
		Map<Integer, String> reverser = new TreeMap<Integer, String>(Collections.reverseOrder());
		reverser.putAll(m);
         for (Integer key :reverser.keySet()) {
            System.out.println(key+" ");        	 
		}
	}
	public static void smallFrom (Map<Integer, String> m, int s) {
		for (Integer k: m.keySet()) {
			if(s > k) {
				System.out.println("Key: "+k+ ", Value: "+m.get(k));
			}
		}
	}
	public static void treesetKeys (Map<Integer, String> m) {
		Set<Integer> keys = new TreeSet<Integer>();
		for (Integer inte : m.keySet()) {
			keys.add(inte);
		} 
		System.out.println("Keys on TreeSet "+keys);
	}
	

}
