

import java.util.HashMap;

public class WordCheck {
    public static boolean checkIfWordFromLetterSoup(String word, String letterSoup) {
        if (letterSoup.length() < word.length()) {
            return false;
        }

        HashMap<Character,Integer> lettersCountInSoup = new HashMap<>();
        for(int i =0 ;i< letterSoup.length(); i++){
            Character character = letterSoup.charAt(i);
            int occurences = lettersCountInSoup.getOrDefault(character,0);
            lettersCountInSoup.put(character, ++occurences);
        }
        for(int i =0; i< word.length(); i++) {
            Character wordLetter = word.charAt(i);
            int occurences = lettersCountInSoup.getOrDefault(wordLetter, 0);
            if(occurences > 0){
                lettersCountInSoup.put(wordLetter, --occurences);
            } else {
                return false;
            }
        }
        return true;
    }
}
