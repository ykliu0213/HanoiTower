package edu.nccu.misds.hanoi;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private List<T> inner = new ArrayList<T>();
	public void push(T e) {	//add a new one to the top (last position)
		inner.add(e);
	}

	public T pop() {	//delete the last one (top one)
		return inner.remove(inner.size() - 1);
	}

	public T top() {	//show the last one (top one)
		return inner.get(inner.size() - 1);
	}

	/**
	 * @TODO: Print a line of elements in this stack from bottom to top. Elements
	 *        should be separated by a space. 
	 *        Given the following input:
	 *        MyStack<Integer> stack = new new MyStack<Integer>();
	 *        stack.push(5); 
	 *        stack.push(4); 
	 *        stack.push(3);
	 *        
	 *        When calling stack.printStack(), print "|- 5 4 3".
	 */
	public void printStack() {		//show all the element in the stack from bottom to top
		System.out.print("|-");
		for(int i = 0 ; i < inner.size() ; i++) {
			System.out.print(" " + inner.get(i));
		}
		System.out.println();
	}
	

	public int size() {		//check the size
		return inner.size();
	}
	
	
	
	
	
	
	
	
}
