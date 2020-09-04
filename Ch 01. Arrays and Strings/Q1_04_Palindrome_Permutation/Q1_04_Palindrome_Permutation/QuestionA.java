package Q1_04_Palindrome_Permutation;
//주어진 문자열이 회문의(palindrome) 순열인지 아닌지 확인하는 함수를 작성하라.
//힌트1:106  모든 순열을 전부 생성할 필요 없다. 아주 비효율 적이다.
//힌트2:121	어떤 문자열이 회문의 순열일 때, 그 특성은 무엇인가?
//힌트3:134	해시 테이블을 사용 해 본 적이 있는가? O(N)시간으로 줄일 수 있다
//힌트4:136	비트 벡터를 사용해서 공간을 줄일 수 있겠는가?
public class QuestionA {

	public static Boolean palindrome_checker(String st) {
		return checker(st.toCharArray());
		
	}
	
	public static Boolean checker(char[] ls) {
		for(int j=0;j<ls.length>>1;j++) {
			if(ls[j]!=ls[ls.length-j-1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "HIIH";
		System.out.println("test HIIH should be true "+ palindrome_checker(test));
		String test1 = "what the heack";
		System.out.println("test HIIH should be true "+ palindrome_checker(test1));
	}

}
