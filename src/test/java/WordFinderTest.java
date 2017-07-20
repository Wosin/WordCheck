import org.junit.Assert;
import org.junit.Test;


public class WordFinderTest {

    @Test
    public void testIfWordCheckCorrectlyHandlesSameStrings(){
        String word = "doggo";
        String soup = "doggo";

        Assert.assertTrue(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }
    @Test
    public void testIfWordCheckCorrectlyHandlesEmptySoup(){
        String word = "doggo";
        String soup = "";

        Assert.assertFalse(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }
    @Test
    public void testIfWordCheckCorrectlyHandlesSoupShorterThanWord(){
        String word = "probability";
        String soup = "probabilit";

        Assert.assertFalse(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }

    @Test
    public void testIfWordCheckCorrectlyShortWordInVeryLongSoup(){
        String word = "handicapped";
        String soup = "thisisverylongsoupstringpeopleshouldbetestingsuchthingsmanuallyiftheyareverynastyorbad";

        Assert.assertTrue(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }

    @Test
    public void testIfWordCheckCorrectlyReturnsFalseWhenWordCannotBeBuild(){
        String word = "thiswordwillnotwork";
        String soup = "thisisverylongsoupstringpeopleshouldbetestingsuchthingsmanuallyiftheyareverynastyorbad";

        Assert.assertFalse(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }

    @Test
    public void testIfWordCheckCorrectlyBehavesForReversedWord(){
        String word = "barcelona";
        String soup = "anolecrab";

        Assert.assertTrue(WordCheck.checkIfWordFromLetterSoup(word,soup));
    }
}
