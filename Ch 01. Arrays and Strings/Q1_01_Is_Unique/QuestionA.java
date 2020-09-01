// 중복이 없는가: 문자열이 주어졌을 때, 이 문자열에 같은 문자가 중복되어 등장하는지 확인하는 알고리즘을 작성하라. 
// 자료 구조를 추가로 사용하지 않고 풀 수 있는 알고리즘 또한 고민하라.
// Hint 1: hashtable 을 이용해보라
// Hint 2: 비트 벡터가 유용한가?
// Hint 3: O(N log N) 시간 안에 풀 수 있겠는가?
package Q1_01_Is_Unique;

public Boolean isUniqueChars(String word) {
	//char을 해쉬 테이블로 구성.
	//그다음에 그걸 가지고 리턴 함
	Boolean[] hash_table = new Boolean[26];
	
	for(int i=0;i<word.length;i++) {
		if(Boolean[word.charAt(i)-'a'] != null) return false;
		else {
			Boolean[word.charAt(i)-'a'] = true;
		}
	}
	return true;
}

public class QuestionA{
	String[] words = {"abcde", "hello", "apple", "kite", "padle"};
	for(String a_word: wrods) {
		System.out.println(a_word + " is " + isUniqueChars(words));	
	}
}