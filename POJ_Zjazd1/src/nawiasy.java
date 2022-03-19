import java.util.Stack;

public class nawiasy {
    public static void main(String args[]) {
        String nawias = "{[]}";

        Stack<Character> nawias_stack = new Stack<Character>();

        for (char znak : nawias.toCharArray()) {
            nawias_stack.push(znak);
            if (znak == ')') {
                if (nawias_stack.peek() == '(') {
                    nawias_stack.pop();
                    nawias_stack.pop();
                }
                nawias_stack.pop();
            }

            if (znak == ']') {
                if (nawias_stack.peek() == '[') {
                    nawias_stack.pop();
                    nawias_stack.pop();
                }
                nawias_stack.pop();
            }

            if (znak == '}') {
                if (nawias_stack.peek() == '{') {
                    nawias_stack.pop();
                    nawias_stack.pop();
                }
                nawias_stack.pop();
            }

        }
        System.out.println(nawias_stack);

    }
}
