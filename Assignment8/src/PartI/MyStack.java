package PartI;

import java.util.ArrayList;

public class MyStack<E> {
	private final ArrayList<E> container;
	private int size;

	/* Constructor */
	public MyStack() {
		container = new ArrayList<>();
		size = 0;
	}
	
	/* Looks at the object at the top of the stack without removing it from the stack */
	E peek() {
		if (container.isEmpty()){
	
			return null;
		}
		return container.get(0);
	}
	/* Removes the object at the top of the stack and returns that object as the value of this function */
	 E pop() {
	        if (container.isEmpty()) {
	            return null;
	        }
	        size--;
	        return container.remove(0);
	    }

	/* Pushes an item onto the top of this stack */
    E push(E item) {
        
        container.add(0, item);
        size++;
        return item;
    }
    /* Returns the 1-based position where an object is on this stack. If it is not there, then it returns -1 */
	int search(Object o) {
	int searchIndex = container.indexOf(0);
	
	if (searchIndex == -1) {	
		return -1;
		}
		return searchIndex + 1;
	}
	/* tests if the stack is empty */
	boolean empty() {
		return container.isEmpty();
	}
}