package PartI;

public class BalancedParentheses {

	public static boolean isBalanced(String inString) {
        // creating a character stack
        MyStack<Character> stack = new MyStack<>();
        for (int i = 0; i < inString.length(); i++) {
            char currentChar = inString.charAt(i);
            // if char is '(' then push the character to the stack
            if (currentChar == '(') {
                stack.push(currentChar);
            } else {
                // if the stack is empty then not a balanced parentheses, return false
                if (stack.empty()) {
                    return false;
                }
                // else pop from the stack
                stack.pop();
            }
        }
        // if the stack is empty then the parentheses is balanced
        // else not balanced
        return stack.empty();
    }
	
	public static void main(String[] args) {
		boolean result1 = isBalanced("(()()()())");
		boolean result2 = isBalanced("(((())))");
		boolean result3 = isBalanced("((((((())");
		System.out.println("result1 :" + result1 );
		System.out.println("result2 :" + result2 );
		System.out.println("result3 :" + result3 );
	}
}
