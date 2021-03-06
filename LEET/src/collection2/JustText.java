package collection2;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Given an array of words and a length L, format the text such that each line has exactly L characters and is fully (left and right) justified.

 You should pack your words in a greedy approach; that is, pack as many words as you can in each line. Pad extra spaces ' ' when necessary so that each line has exactly L characters.

 Extra spaces between words should be distributed as evenly as possible. If the number of spaces on a line do not divide evenly between words, the empty slots on the left will be assigned more spaces than the slots on the right.

 For the last line of text, it should be left justified and no extra space is inserted between words.

 For example,
 words: ["This", "is", "an", "example", "of", "text", "justification."]
 L: 16.

 Return the formatted lines as:
 [
 "This    is    an",
 "example  of text",
 "justification.  "
 ]
 Note: Each word is guaranteed not to exceed L in length.
 */

public class JustText {

	public static ArrayList<String> fullJustify(String[] words, int L) {
		ArrayList<String> list = new ArrayList<String>();
		String[] t = {""};
		if(words.equals(t)||L ==0){
			list.add("");
			return list;
		}
		int i = 0;
		int j = 0;
		while(j<words.length){
			int len = 0;
			i=j;
			len = words[j].length();
			j++;
			while(len<L&&(L-len)/(j-i)>=1&&j<words.length){
				//System.out.println("!"+(L-len)/(j-i+1));
				len += words[j].length();
				if((L-len)/(j-i)>=1){
					j++;
				} else {
					len-=words[j].length();
					break;
				}
			}
			//System.out.println(i+ " "+j+" "+len);
			String[] temp = Arrays.copyOfRange(words, i, j);
			if(j==words.length){
				list.add(justify1(temp,L,len));		
			} else {
				list.add(justify2(temp,L,len));				
			}

			
		}
		return list;
	}

	public static String justify1(String[] arr, int L, int wordL) {
		int rest = L - wordL;
		//int AvgSpace = rest/arr.length; 
		//int first = AvgSpace+(rest-AvgSpace*(arr.length-1));
		String avg = " ";
		//for(int i =1;i<AvgSpace;i++){
		//	avg = avg.concat(" ");
		//}
		//String fir = " ";
		//for(int i =1;i<first;i++){
		//	fir = fir.concat(" ");
		//}
		//System.out.println("!"+avg+"!"+AvgSpace+"!"+fir+"!"+first);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length-1;i++){
//			if(i==0){
//				sb.append(arr[i]);
//				sb.append(fir);
//			} else {
				sb.append(arr[i]);
				sb.append(avg);
		//	}
		}
		sb.append(arr[arr.length-1]);
		String result = sb.toString();
		if(result.length()<L){
			for(int i =0;i<L-result.length();i++){
				sb.append(" ");
			}
		}
		
		return  sb.toString();
	}
	
	public static String justify2(String[] arr, int L, int wordL) {
		int rest = L - wordL;
		
		int AvgSpace = 0;
		if(arr.length>1) AvgSpace= rest/(arr.length-1); 
		int first = AvgSpace+(rest-AvgSpace*(arr.length-1));
		String avg = " ";
		for(int i =1;i<AvgSpace;i++){
			avg = avg.concat(" ");
		}
		String fir = " ";
		for(int i =1;i<first;i++){
			fir = fir.concat(" ");
		}
		System.out.println("!"+avg+"!"+AvgSpace+"!"+arr.length+"?"+fir+"!"+first);
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length-1;i++){
			if(i==0){
				sb.append(arr[i]);
				sb.append(fir);
			} else {
				sb.append(arr[i]);
				sb.append(avg);
			}
		}
		sb.append(arr[arr.length-1]);
		String result = sb.toString();
		if(result.length()<L){
			for(int i =0;i<L-result.length();i++){
				sb.append(" ");
			}
		}
		
		return  sb.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr2 = {"Listen","to","many,","speak","to","a","few."};
		String[] arr = {"What","must","be","shall","be."};
		String[] arr3 = {""};
	//	System.out.println(Arrays.copyOfRange(arr, 0,1).length);
		System.out.println(fullJustify(arr,12).get(0).length());
		System.out.println(fullJustify(arr,12).get(1).length());
		//System.out.println(fullJustify(arr,2).get(0));
		System.out.println(fullJustify(arr2,6).get(4).length());

	}

}
