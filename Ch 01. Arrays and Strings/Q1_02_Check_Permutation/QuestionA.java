//문자열 두개가 주어졌을 때 이 둘이 서로 순열(permutation) 관계에 있는지 확인하는 메서드를 작성하라

class QuestionA{
	public Boolean permutation_check(String[] words) {
		if(words.length!=2) return false;
		else {
			if(words[0].length() == words[1].length()) {
				int[] hashtable = new int[26];
				for(int a=0; a<26;a++) {
					hashtable[a] = 0;
				}

				for(int i=0; i< words[0].length();i++) {
					hashtable[words[0].charAt(i)-'a'] ++;
				}
				
				for(int j=0; j< words[1].length();j++) {
					hashtable[words[0].charAt(j)-'a'] --;
					if(hashtable[words[0].charAt(j)-'a'] <0)
						return false;
				}
				return true;
			}
		}
		return false;
	}
	
	public static void main() {
		String[] words = {"hello", "olleh"};
		System.out.println(permutation_check(words));
		}
	}
}
