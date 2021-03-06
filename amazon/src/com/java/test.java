package com.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class test {
	
	public static List<Integer> calculateWindowSums(List<Integer> list, int windowSize) {
		List<Integer> result = new LinkedList<Integer> ();
		for(int i = 0;i<list.size()-windowSize+1;i++){
			int temp = list.get(i);
			for(int j=1;j<windowSize;j++){
				temp = temp+list.get(i+j);
			}
			result.add(temp);
		}
		return result;
	}


	public static void main(String[] args) {
		List<Integer> list = new LinkedList<Integer>();
		list.add(4);
		list.add(2);
		list.add(73);
		list.add(11);
		list.add(-5);
		
		List<Integer> list2 = calculateWindowSums(list, 4);
		Iterator<Integer> it = list2.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
