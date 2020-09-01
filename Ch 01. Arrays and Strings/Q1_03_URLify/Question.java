//URL화: 문자열에 들어 있는 모든 공백을 '%20'으로 바꿔주는 메서드를 작성하라. 
//최종적으로 모든 문자를 다 담을 수 있을 만큼 충분한 공간이 이미 확보되어 있으며 문자열의 최종 길이가 함께 주어진다고 가정해도 된다
//(자바로 구현한다면 배열 안에서 작업할 수 있도록 문자 배열(character array)을 이용하길 바란다
//입력:"Mr John Smith", 13
//출력:"Mr%20John520Smith"
//힌트1: 문자열의 끝에서 앞으로 수정하는 것이 이상적.
//힌트2: 필요한 공백을 알아야 할 지도 모른다. 셀 수 도 있는가?
public class Question {
	public static String func(String st, int num) {
		String ans = " ";
		char[] cahrArray = st.toCharArray();
		
		for(int i=st.length()-1; i>=0;i--) {
			if (Character.compare(st.charAt(i), ans.charAt(0))==0){
				
			}
		}
		
		
		return ans;
	}
	
	
	public static void main(String[] args) {
		String st = "Mr John Smith";
		int num =  13;
		
		System.out.println(func(st, num));
		

	}

}
