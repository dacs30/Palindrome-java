// import junit tests
import org.junit.Test;
import static org.junit.Assert.*;

public class TestPalindrome {
    
    @Test
    public void testPalindrome(){
        Palindrome palindrome = new Palindrome("racecar");
        assertTrue(palindrome.isPalindrome());
    }
    
    @Test
    public void testNotPalindrome(){
        Palindrome palindrome = new Palindrome("hello");
        assertFalse(palindrome.isPalindrome());
    }

}
