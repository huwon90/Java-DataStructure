package stack;

public class StackTest {

	public static void main(String[] args) {
		Stack st = new Stack(10);
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		
		st.printstack();
		
		st.pop();

		st.pop();

		st.push(15);

		st.printstack();

		st.push(30);
		
		st.peek();
	}

}
