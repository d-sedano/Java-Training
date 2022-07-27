package main.java.exercises.date_7_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparable_Comparable {

	public static void main(String[] args) {
		
		Steak ph = new Steak();
		ph.setCut("Porterhouse");
		ph.setWeight(40);
		
		Steak tb = new Steak();
		tb.setCut("T-Bone");
		tb.setWeight(30);
		
		List<Steak> list = new ArrayList<>();
		
		list.add(ph);
		list.add(tb);
		
		Collections.sort(list, new WeightComp());

	}

}

class Steak implements Comparable<Steak> {
	
	private int weight;
	
	private String cut;
	
	public void setCut(String cut) {
		this.cut = cut;
	}
	
	public String getCut() {
		return this.cut;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	@Override 
	public int compareTo(Steak steak) {
		return this.weight - steak.getWeight();
	}
}

class WeightComp implements Comparator<Steak> {
	
	@Override
	public int compare(Steak s1, Steak s2) {
		return s1.getCut().compareTo(s2.getCut());
	}
}
