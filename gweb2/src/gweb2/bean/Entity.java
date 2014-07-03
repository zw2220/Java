package gweb2.bean;

import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Hashtable;

public class Entity {

	public int question1(String fileName) throws MalformedURLException {
		URL file = new URL(fileName);
		//File file = new File(fileName, "r");
		BufferedReader reader = null;
		int result = 0;
		try {
			reader = new BufferedReader(new InputStreamReader(file.openStream()));
			String tempString = null;
			int pos = 0;
			while ((tempString = reader.readLine()) != null) {
				String[] s = tempString.split(" ");
				ArrayList<Integer> al = new ArrayList<Integer>();
				for (int i = 0; i < s.length; i++) {
					if (!s[i].equals("")) {
						al.add(Integer.parseInt(s[i]));
					}
				}
				if (pos + 1 < al.size()) {
					if (al.get(pos) > al.get(pos + 1)) {
						result += al.get(pos);
					} else {
						result += al.get(pos + 1);
						pos++;
					}
				} else {
					result += al.get(pos);
				}
				// System.out.println("!!"+result);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return result;
	}

	public int question2(String input) {
		if (input == null || input.length() == 0) {
			return 0;
		}
		String[] s = input.split(",");
		ArrayList<Integer> prices = new ArrayList<Integer>();
		for (int i = 0; i < s.length; i++) {
			s[i] = s[i].trim();
			if (!s[i].equals("")) {
				prices.add(Integer.parseInt(s[i]));
			}
		}
		if (prices == null || prices.size() == 0) {
			return 0;
		}
		int min = prices.get(0);
		int max = 0;
		for (int i = 0; i < prices.size(); i++) {
			min = Math.min(min, prices.get(i));
			max = Math.max(max, prices.get(i)- min);
		}
		return max;

	}

	public String question3(String name1, String name2){
		//algorithm has already been coded as python file.
		String result = "no";
		Hashtable <String, ArrayList<String>> ht = new Hashtable<String, ArrayList<String>> ();
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Ben");
		ht.put("Peter", al1);
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Peter");
		ht.put("Ben", al2);
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("Jack");
		ht.put("Jim", al3);
		ArrayList<String> al4 = new ArrayList<String>();
		al4.add("Jack");
		ht.put("David", al4);
		ArrayList<String> al5 = new ArrayList<String>();
		al5.add("Jim");
		al5.add("John");
		al5.add("David");
		ht.put("Jack", al5);
		ArrayList<String> al6 = new ArrayList<String>();
		al6.add("John");
		ht.put("Tom", al6);
		ArrayList<String> al7 = new ArrayList<String>();
		al7.add("Mark");
		ht.put("Chris", al7);
		ArrayList<String> al8 = new ArrayList<String>();
		al8.add("Tom");
		al8.add("Jack");
		ht.put("John", al8);
		ArrayList<String> al9 = new ArrayList<String>();
		al9.add("Chris");
		ht.put("Mark", al9);
		if(!ht.contains(name1)){
			return result;
		} else {
			if(ht.get(name1).contains(name2)){
				result = "yes";
				return result;
			}
		}
		return result;
	}
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		/*Entity p = new Entity();
		String s = "https://s3.amazonaws.com/kevin1bucket/Pyramid.txt";
		try{
			System.out.println(p.question1(s));
			} catch (IOException e) {
				e.printStackTrace();
				}
		String s2 = "7,1,2,5,3,6,8";
		System.out.println(p.question2(s2));*/
		
		

	}

}