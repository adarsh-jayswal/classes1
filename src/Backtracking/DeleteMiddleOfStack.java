package Backtracking;

import java.util.Stack;

public class DeleteMiddleOfStack {

    public static void deleteMiddle(Stack<Integer> st, int sizeOfStack) {
        int mid = sizeOfStack / 2;  // middle index (0-based)
        solve(st, 0, mid);
    }

    private static void solve(Stack<Integer> st, int curr, int mid) {
        if (curr == mid) {
            st.pop();
            return;
        }
        int top = st.pop();
        solve(st, curr + 1, mid);
        st.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.println("Original Stack: " + st);

        deleteMiddle(st, st.size());

        System.out.println("After Deleting Middle: " + st);
    }
}

