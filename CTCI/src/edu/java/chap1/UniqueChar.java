package edu.java.chap1;

/*
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structure?
 */
public class UniqueChar {
	
	public static boolean unique(String str){
		for(int i = 0; i<str.length();i++){
			for(int j = i; j<str.length();j++){
				if (str.charAt(i) == str.charAt(j)){
					return true;
				}
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		String str = "asdfghza";
		System.out.println(unique(str));
	}

}
