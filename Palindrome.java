public class Palindrome{
    String str;

    public Palindrome(String str){
        this.str = str;
    }

    // The way I would do
    public boolean isPalindrome(){
        int left = 0;
        int right = str.length() - 1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Another popular way of doing it
    public boolean isPalindromeRecursive(String s){
        int left = 0;
        int right = s.length() - 1;
        if(left >= right){
            return true;
        }
        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return isPalindromeRecursive(s.substring(left + 1, right));
    }
}