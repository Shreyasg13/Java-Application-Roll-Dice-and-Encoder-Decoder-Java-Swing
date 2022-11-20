package PartIII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortFrequency {

		public static void sortByFrequency(ArrayList<Integer> ar) {
			Map<Integer, Integer> map = new HashMap<>();
			List<Integer> outputArray = new ArrayList<>();
			for (int current : ar) {
				map.put(current, map.getOrDefault(current, 0) + 1);
			}
			Collections.sort(ar, new Comparator<Integer>() {
				@Override
				public int compare(Integer i1, Integer i2) {
					int freqCompare = map.get(i1).compareTo(map.get(i2));
					int valueCompare = i1.compareTo(i2);
					if (freqCompare == 0)
						return valueCompare;
					else
						return freqCompare;
				}
			});
			System.out.println(map);
			for (Integer i : outputArray) {
				System.out.print(i + " ");
			}
		}
	
	public static void main(String[] args) {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for (int i=0;i<100;i++) {
			ar.add((int)(Math.random()*10));			
		}
		System.out.println(ar.toString());
		sortByFrequency(ar);
		System.out.println(ar.toString());
	}
}
