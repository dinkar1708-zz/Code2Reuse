import java.util.Stack;

public class ReveseStack {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		st.push(40);
		st.push(30);
		st.push(20);
		st.push(10);
		System.out.println("Before..." + st);
		revrseStack(st);
		System.out.println("After reverse..." + st);
	}

	/**
	 * reverse my stack function, keeps all values in function call and then
	 * call helper function to place item at bottom
	 * 
	 * @param myStack
	 *            stack in which item will be reversed
	 */
	private static void revrseStack(Stack<Integer> myStack) {
		if (myStack.isEmpty()) {
			// base case return from function call
			return;
		}
		Integer item = myStack.pop();
		// call function recursively
		revrseStack(myStack);
		// place the
		placeItemAtBottom(myStack, item);
	}

	/**
	 * helper function to place the item at bottom of stack, hold the item in
	 * function call after putting the item at bottom it takes one by one item
	 * of function call and put them in stack
	 * 
	 * @param myStack
	 * @param itemToPlace
	 */
	private static void placeItemAtBottom(Stack<Integer> myStack, Integer itemToPlace) {
		if (myStack.isEmpty()) {
			// place item at bottom
			myStack.push(itemToPlace);
			return;
		}
		Integer item = myStack.pop();
		// hold each item in function call
		placeItemAtBottom(myStack, itemToPlace);
		// push item one by one
		myStack.push(item);
	}
}
