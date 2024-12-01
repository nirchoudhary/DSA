// 4)A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
// removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.
// Example 1:
// Input: s = “A man, a plan, a canal: Panama”
// Output: true
// Explanation: “amanaplanacanalpanama” is a palindrome.
// Example 2:
// Input: s = “race a car”;
// Output: false


class Palindrome {
    public static boolean isPalindrome(String s)
    {
        int left = 0;
        int right = s.length() -1;
        
        while(left<right)
 {
     while(left<right && !Character.isLetterOrDigit(s.charAt(left)))
     {
         left++;
     }
     while(left<right && !Character.isLetterOrDigit(s.charAt(right)))
     {
         right--;
     }
  
     if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right)))
     {
         return false;
     }
     
     left++;
     right--;
     
    }
    return true;
 }
    
    public static void main(String[] args) {
         String s1 = "A man, a plan, a canal: Panama";
         System.out.println("Is Palindrome :"+isPalindrome(s1));
         
         String s2 = "race a car";
         System.out.println("Is Palindrome :"+ isPalindrome(s2));
         
    }
}