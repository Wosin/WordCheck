

import java.util.HashMap;

public class WordCheck {
    public static boolean checkIfWordFromLetterSoup(String word, String letterSoup) {
        if (letterSoup.length() < word.length()) {
            return false;
        }

        HashMap<Character,Integer> lettersInWord = new HashMap<>();
        for(int i =0; i < word.length(); i++){
            Character wordLetter = word.charAt(i);
            int occurrences = lettersInWord.getOrDefault(wordLetter,0);
            lettersInWord.put(wordLetter, ++occurrences);
        }
        int lettersLeftToMatch = word.length();

        for(int i = 0; i < letterSoup.length(); i++) {
            Character character = letterSoup.charAt(i);
            int occurrences = lettersInWord.getOrDefault(character, 0);
            if(occurrences > 0){
                lettersInWord.put(character, --occurrences);
                lettersLeftToMatch--;
            }

            if(lettersLeftToMatch == 0){
                return true;
            }
            int lettersLeftInSoup = letterSoup.length() - (i+1);
            if(lettersLeftToMatch > lettersLeftInSoup) {
                return false;
            }
        }
        return false;
    }
}
