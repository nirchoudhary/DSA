// Ques 6) Cyclic Palindrome.

// Description:
// A string is said to be palindrome, if it reads the same from both the ends. Given a string S, you
// are allowed to perform cyclic shifts. More formally, you can pick any one character from any end
// (head or tail) and you can append that character at the other end. For example, if the string is
// "abc", then if we do a shift using the character at head position then the string becomes "bca".
// Similarly, if we do the shift using the character at the tail then the input string becomes "cab".
// Your task is to find out the minimum number of shifts needed to make the given string, a
// palindrome. In case, we can't convert the string to palindrome then print -1

// Input Format:
// First line starts with T i.e. number of test cases, and then T lines will follow each containing a
// string "S".

// Output Format:
// Print the minimum number of cyclic shifts for each string if it can be made a palindrome, else -1.

// Sample Input:
// 4
// abbb
// aaabb
// aabb
// abc

// Sample Output:
// -1
// 1
// 1
// -1

// Explanation:

// For Test Case 2 (aaabb):
// Shift the character at the tail to the head and the result will be "baaab", which is a palindrome.
// This is an operation which requires minimum number of shifts to make the given string a
// palindrome.

// For Test Case 3 (aabb):
// One way to convert the given string to palindrome is, shift the character at the head to the tail,
// and the result will be "abba", which is a palindrome. Another way is to shift the character at the
// tail to the head, and the result will be "baab", which is also a palindrome. Both require only one
// shift.


// ----->

public class CyclicPalindrome
{
    static boolean isPalindrome(String s){
        for(int i = 0; i < s.length()/2; i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                return false;
            }
        }
        
        return true;
    }
    
    static int cyclicPlaindrome(String str){
        if(isPalindrome(str)){
            return 0;
        }
        
        String s = str + str;
        
        for(int i = 1; i < s.length()-str.length(); i++){
            String window = s.substring(i, i+str.length());
            if(isPalindrome(window)){
                return Math.min(i, str.length()-i);
            }
        }
        
        return -1;
    }
    
	public static void main(String[] args) {
		System.out.println(cyclicPlaindrome("baaaa"));
	}
}
