import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import com.es20.palindrome.Palindrome;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class PalindromeTest {
    private Palindrome sut;

    @Before
    public void setUp() throws Exception {
        sut = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
        sut = null;
    }

    @Test
    public void testWord() {
        assertTrue(sut.isPalindrome("bob"));
        assertTrue(sut.isPalindrome("madam"));
        assertTrue(sut.isPalindrome("1"));
        assertTrue(sut.isPalindrome("Able was I, ere I saw Elba"));
        assertTrue(sut.isPalindrome("Madam I’m Adam"));
        assertTrue(sut.isPalindrome("Step on no pets."));
        assertTrue(sut.isPalindrome("Top spot!"));
        assertTrue(sut.isPalindrome("02/02/2020"));

        assertFalse(sut.isPalindrome("xyz"));
        assertFalse(sut.isPalindrome("elephant"));
        assertFalse(sut.isPalindrome("Country"));
        assertFalse(sut.isPalindrome("Top . post!"));
        assertFalse(sut.isPalindrome("Wonderful-fool"));
        assertFalse(sut.isPalindrome("“Wild imagination!"));
    }
}