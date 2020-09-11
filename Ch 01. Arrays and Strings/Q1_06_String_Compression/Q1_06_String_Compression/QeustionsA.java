package Q1_06_String_Compression;

//반복되는 문자의 개수를 세는 방식의 기본적인 문자열 압축 메서드를 작성하라.
//예를 들어 문자열 aabccccaaa를 압축하면 a2b1c5a3이 된다.
//만약 '압축된' 문자열의 길이가 기존 문자열의 길이보다 길다면 기존 문자열을 반환해야 한다. 
//문자열은 대소문자 알파벳(a~z)으로만 이루어져 있다 
public class QeustionsA {
	private static String checkLength(String st){
		String ans="";
		char[] charList = st.toCharArray();
		char prev=0;
		int count =0;
		
		for(char c: charList) {
			if(prev == 0) {
				prev = c;
				count++;
			}else {
				if(c==prev) {
					count ++;
				}else {
					ans = ans+ prev+Integer.toString(count);
					count = 0;
					prev = c;
					count ++;
				}
			}
		}
		ans = ans+ prev+Integer.toString(count);
		if(ans.length()>st.length())
			return st;
		else
			return ans;
	}
	
	public static void main(String[] args) {
		String test = "aabccccaaa";
		System.out.println("answer is "+checkLength(test));
	}
}
