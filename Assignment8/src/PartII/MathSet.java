package PartII;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MathSet<E> extends HashSet<E> {

	public Set<E> intersection(Set<E> s2) {
		Object obj;
		Set<E> result = new HashSet<>();
		
		Iterator<E> itr = s2.iterator();
		while(itr.hasNext()) {
			obj = itr.next();
			if(this.contains(obj)) {
				result.add((E) obj);
			}
		}

		return result;
		
	}
	
	public Set<E> union(Set<E> s2) {
		Object obj;
		Set<E> result = new HashSet<>();
		
		Iterator<E> itr1 = this.iterator();
		Iterator<E> itr2 = s2.iterator();
		
		while(itr1.hasNext()) {
			result.add(itr1.next());
		}
		
		while(itr2.hasNext()) {
			result.add(itr2.next());
		}
		
		return result;

	}
	
	public <T> Set<Pair<E,T>> cartesianProduct(Set<T> s2) {
		Set<Pair<E,T>> result = new HashSet<>();
		Pair<E,T> pair;
		Object o1,o2;
		
		Iterator itr1 = this.iterator();
		Iterator itr2;
		
		while(itr1.hasNext()) {
			o1 = itr1.next();
			itr2 = s2.iterator();
			
			while(itr2.hasNext()) {
				o2 = itr2.next();
				pair = new Pair(o1,o2);
				result.add(pair);
			}	
		}
		
		return result;

	}
	
	public static void main(String[] args) {
		// create two MathSet objects of the same type.
		// See if union and intersection works.
		
		MathSet<Integer> ms1 = new MathSet<>();
		MathSet<Integer> ms2 = new MathSet<>();
		
		for(int i=0;i<7;i++)
		{	
			ms1.add(i );
			
		}
		for(int i=1;i<15;i++)
		{	
			ms2.add(i );
			
		}
		
		
		
		System.out.println("Set1: " + ms1);
		System.out.println("Set2: " + ms2);
		System.out.println("Intersection of the two sets is: " + ms1.intersection(ms2));
		System.out.println("Union of the two sets is: " + ms1.union(ms2));
		
		
		// create another MathSet object of a different type
		// calculate the cartesian product of this set with one of the
		// above sets
		
		MathSet<Character> ms3 = new MathSet<>();
		ms3.add('H');
		ms3.add('T');
		
		System.out.println();
		System.out.println("Set3: " + ms3);
		System.out.println("Cartesian Product of Set1 X Set3 is: \n" + ms1.cartesianProduct(ms3));
	}
}
