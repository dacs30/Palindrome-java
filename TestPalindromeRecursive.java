import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindromeRecursive {
    
    @Test
    public void testPalindrome(){
        Palindrome palindrome = new Palindrome("racecar");
        assertTrue(palindrome.isPalindromeRecursive("racecar"));
    }

    @Test
    public void testNotPalindrome(){
        Palindrome palindrome = new Palindrome("hello");
        assertFalse(palindrome.isPalindromeRecursive("hello"));
    }
}
