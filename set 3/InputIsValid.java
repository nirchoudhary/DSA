
// Ques 5)Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input
// string is valid.

// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:
// Input: s = "()"
// Output: true

// Example 2:
// Input: s = "()[]{}"
// Output: true

// Example 3:
// Input: s = "(]"
// Output: false

// Example 4:
// Input: s = "([])"
// Output: true

// Constraints:

// 1 <= s.length <= 104
// s consists of parentheses only '()[]{}'.
// Example 1:

// --------------------------------------------------------------------

import java.util.Stack;

public class InputIsValid {
    static boolean validParanthesis(String str) {
        Stack<Character> bracketStack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                bracketStack.push(ch);
            } else {
                if (!bracketStack.isEmpty() && ch == ')' && bracketStack.peek() == '(') {
                    bracketStack.pop();
                } else if (!bracketStack.isEmpty() && ch == '}' && bracketStack.peek() == '{') {
                    bracketStack.pop();
                } else if (!bracketStack.isEmpty() && ch == ']' && bracketStack.peek() == '[') {
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str1 = "({}[])";
        String str2 = "{()[]}}";

        System.out.println(validParanthesis(str1));
        System.out.println(validParanthesis(str2));
    }
}
