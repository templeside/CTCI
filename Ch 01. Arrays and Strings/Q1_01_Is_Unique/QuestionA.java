// ì¤‘ë³µì�´ ì—†ëŠ”ê°€: ë¬¸ìž�ì—´ì�´ ì£¼ì–´ì¡Œì�„ ë•Œ, ì�´ ë¬¸ìž�ì—´ì—� ê°™ì�€ ë¬¸ìž�ê°€ ì¤‘ë³µë�˜ì–´ ë“±ìž¥í•˜ëŠ”ì§€ í™•ì�¸í•˜ëŠ” ì•Œê³ ë¦¬ì¦˜ì�„ ìž‘ì„±í•˜ë�¼. 
// ìž�ë£Œ êµ¬ì¡°ë¥¼ ì¶”ê°€ë¡œ ì‚¬ìš©í•˜ì§€ ì•Šê³  í’€ ìˆ˜ ìžˆëŠ” ì•Œê³ ë¦¬ì¦˜ ë˜�í•œ ê³ ë¯¼í•˜ë�¼.
// Hint 1: hashtable ì�„ ì�´ìš©í•´ë³´ë�¼
// Hint 2: ë¹„íŠ¸ ë²¡í„°ê°€ ìœ ìš©í•œê°€?
// Hint 3: O(N log N) ì‹œê°„ ì•ˆì—� í’€ ìˆ˜ ìžˆê² ëŠ”ê°€?
package Q1_01_Is_Unique;


class QuestionA{
	public Boolean isUniqueChars(String word) {
		//charì�„ í•´ì‰¬ í…Œì�´ë¸”ë¡œ êµ¬ì„±.
		//ê·¸ë‹¤ì�Œì—� ê·¸ê±¸ ê°€ì§€ê³  ë¦¬í„´ í•¨
		Boolean[] hash_table = new Boolean[26];
		
		for(int i=0;i<word.length;i++) {
			if(Boolean[word.charAt(i)-'a'] != null) return false;
			else {
				Boolean[word.charAt(i)-'a'] = true;
			}
		}
		return true;
	}
	public static void main() {
		String[] words = {"abcde", "hello", "apple", "kite", "padle"};
		for(String a_word: wrods) {
			System.out.println(a_word + " is " + isUniqueChars(words));	
		}
	}
}