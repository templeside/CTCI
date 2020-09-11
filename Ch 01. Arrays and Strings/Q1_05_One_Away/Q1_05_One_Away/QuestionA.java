//하나빼기: 문자열을 편집하는 방법에는 세가지 종류가 있다. 
//문자삽입, 문자 삭제, 문자 교체.
//문자열 두 개가 주어졌을 때, 문자열을 같게 만들기 위한 편집 횟수가 1회 이내인지 확인하는 함수를 작성하라.
//pale, ple ->true
//pales, pale -> true
//pale, bale -> true
//pale, bake -> false
//힌트1 23: 
//힌트2 97:
//힌트3 130:
package Q1_05_One_Away;
import java.math.*;

public class QuestionA {
	
	public static Boolean oneAway(String s1, String s2) {
//		insert		//when length ++
//		delete 		//when length --
//		exchange	//when length same
		
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		
		if(Math.abs(s1.length()-s2.length())==1){
			char[] bigger;
			char[] smaller;
//			boolean counter
			
			if(s1.length()>s2.length()) {
				bigger = ch1;
				smaller = ch2;
			}else {
				bigger = ch2;
				smaller = ch1;
			}
			int i=0;int j=0;
			while(i<bigger.length &&j<smaller.length){
				if(bigger[i]==smaller[j]) {
					i++;
					j++;
				}
				else
					i++;
			}
			if(j ==smaller.length)
				return true;
			return false;
			
		}
		else if(s1.length() == s2.length()) {
			Boolean ischanged = false;
			for(int k = 0;k<ch1.length;k++){
				if(ch1[k] != ch2[k]) {
					if(ischanged == false) {
						ischanged = true;
						continue;
					}else
						return false;
					
				}
					
			}
			return true;
		}
		else
			return false;
		
	}
	
	public static void main(String[] args) {
		String string1 = "pale";
		String string2 = "bake";
		System.out.println("pale and pale should be correct = "+oneAway(string1, string2));
	}
}
