package main.java.exercises.date_7_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class DataStructureEx {

	public static void main(String[] args) {
		
		// ArrayList
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.remove(0);
		Iterator<Integer> itr = al.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// LinkedList
		
		List<Integer> l = new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.remove(1);
		Iterator<Integer> itr2 = l.iterator();
		
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
		// Vector
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
		v.remove(1);
		Iterator<Integer> VItr = v.iterator();
		
		while (VItr.hasNext()) {
			System.out.println(VItr.next());
		}
		
		// Stack
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.pop();
		Iterator<Integer> SItr = al.iterator();
		
		while (SItr.hasNext()) {
			System.out.println(SItr.next());
		}
		
		// HashSet
		
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(4);
		hs.remove(1);
		Iterator<Integer> HSItr = hs.iterator();
		
		while (HSItr.hasNext()) {
			System.out.println(HSItr.next());
		}
		
		// LinkedHashSet
		
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(2);
		lhs.add(3);
		lhs.add(4);
		lhs.remove(1);
		Iterator<Integer> LHSItr = lhs.iterator();
		
		while (LHSItr.hasNext()) {
			System.out.println(LHSItr.next());
		}
		
		// TreeSet
		
		Set<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(4);
		ts.remove(1);
		Iterator<Integer> TItr = ts.iterator();
		
		while (TItr.hasNext()) {
			System.out.println(TItr.next());
		}
		
		// HashMap
		
		Map<String, Integer> hm = new HashMap<>();
		hm.put("NYC", 20000000);
		hm.put("LA", 10000000);
		hm.put("CHI", 7000000);
		hm.put("HOU", 5000000);
		hm.remove("HOU");
		Iterator<Map.Entry<String, Integer>> HMItr = hm.entrySet().iterator();
		while (HMItr.hasNext()) {
			System.out.println(HMItr.next());
		}
		
		// LinkedHashMap
		
		Map<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("NYC", 20000000);
		lhm.put("LA", 10000000);
		lhm.put("CHI", 7000000);
		lhm.put("HOU", 5000000);
		lhm.remove("HOU");
		Iterator<Map.Entry<String, Integer>> LHMItr = lhm.entrySet().iterator();
		while (LHMItr.hasNext()) {
			System.out.println(LHMItr.next());
		}
		
		
		// TreeMap
		
		Map<String, Integer> tm = new TreeMap<>();
		tm.put("NYC", 20000000);
		tm.put("LA", 10000000);
		tm.put("CHI", 7000000);
		tm.put("HOU", 5000000);
		tm.remove("HOU");
		Iterator<Map.Entry<String, Integer>> TMItr = tm.entrySet().iterator();
		while (TMItr.hasNext()) {
			System.out.println(TMItr.next());
		}
		

	}

}
