import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDeletionToUniqueCharsTest {

    @Test
    public void allCharacterAreUnique() {
        assertEquals(0, MinimumDeletionToUniqueChars.minDeletes("abcaabbcdaab"));

    }

    @Test
    public void bothCharacterOccurInTheSameNumber() {
        assertEquals(1, MinimumDeletionToUniqueChars.minDeletes("aaaaabbbbb"));

    }

    @Test
    public void differentCharacterOccurrence() {
        assertEquals(6, MinimumDeletionToUniqueChars.minDeletes("aaaabbbbccccdddd"));

    }

}
