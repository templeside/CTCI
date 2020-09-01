//ë¬¸ìž�ì—´ ë‘�ê°œê°€ ì£¼ì–´ì¡Œì�„ ë•Œ ì�´ ë‘˜ì�´ ì„œë¡œ ìˆœì—´(permutation) ê´€ê³„ì—� ìžˆëŠ”ì§€ í™•ì�¸í•˜ëŠ” ë©”ì„œë“œë¥¼ ìž‘ì„±í•˜ë�¼

class QuestionA{
	public static Boolean permutation_check(String[] words) {
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

