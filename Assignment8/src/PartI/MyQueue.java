package PartI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;

public class MyQueue<E> implements Queue<E> {
	
	private ArrayList<E> ar;
	private int size;
	

	public MyQueue() {
		ar=new ArrayList<>();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return size == 0;
	}

	@Override
	public boolean contains(Object o) {
		// TODO Auto-generated method stub
		return ar.contains(o);
	}

	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return ar.stream().iterator();
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return ar.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		if (isEmpty()){
			throw new NoSuchElementException("Queue is Empty");
		}
		return ar.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		ar.add(e);
		size++;
		return true;
	}

	@Override
	public boolean offer(E e) {
		// TODO Auto-generated method stub
		return add(e);
	}

	@Override
	public E remove() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			throw new NoSuchElementException("Queue is Empty");
		}
		size--;
		
		return ar.remove(0);
	}

	@Override
	public E poll() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			return null;
		}
		size--;
		
		return ar.remove(0);
	}

	@Override
	public E element() {
		// TODO Auto-generated method stub
		if (isEmpty())
		{
			throw new NoSuchElementException("Queue is Empty");
		}
		return ar.get(0);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		if (isEmpty()){
			return null;
		}
		return ar.get(0);
	}
	

}
