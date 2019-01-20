package edu.nccu.misds.hanoi;

import java.util.ArrayList;
import java.util.List;

public class MyStack<T> {
	private List<T> inner = new ArrayList<T>();

	//add a new one to the top (last position)
	public void push(T e) {
		inner.add(e);
	}

	//delete the last one (top one)
	public T pop() {
		return inner.remove(inner.size() - 1);
	}

	//show the last one (top one)
	public T top() {
		return inner.get(inner.size() - 1);
	}

	//show all the element in the stack from bottom to top
	public void printStack() {
		System.out.print("|-");
		for(int i = 0 ; i < inner.size() ; i++) {
			System.out.print(" " + inner.get(i));
		}
		System.out.println();
	}
	
	//check the size
	public int size() {
		return inner.size();
	}
}
