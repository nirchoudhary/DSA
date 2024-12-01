
// Ques 4) Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
// The following rules define a valid string:
// Any left parenthesis '(' must have a corresponding right parenthesis ')'.
// Any right parenthesis ')' must have a corresponding left parenthesis '('.
// Left parenthesis '(' must go before the corresponding right parenthesis ')'.

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "(())"
// Output: true

// Example 3:
// Input: s = ")("
// Output: false

// Example 4:
// Input: s = "()("
// Output: false

// Constraints:
// 1 <= s.length <= 104
// s consists of parentheses only '()'.

// ----------------------------------------------------------------------

import java.util.Stack;

public class ValidString {
    static boolean validParenthesis(String str) {
        Stack<Character> charStack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                charStack.push(ch);
            } else {
                if (!charStack.isEmpty()) {
                    charStack.pop();
                } else {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "(()())";
        String str2 = "(()))";
        System.out.println(validParenthesis(str1));
        System.out.println(validParenthesis(str2));
    }
}