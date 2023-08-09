class ArrayStack2 {
	// field
	int[] arr;
	int top = -1;

	// constructor
	public ArrayStack2(int length) {
		this.arr = new int[length];
	}

	int peek() {
		return arr[top];
	}

	void push(int item) {
		if (top < arr.length - 1) {
			arr[++top] = item;
			System.out.println("Inserted Item : " + arr[top]);
		} else {
			System.out.println("스택이 꽉 찼습니다! 용량 초과!");
		}
	}

	int pop() {
		if (top == -1) {
			System.out.println("스택이 비었습니다!");
			return top;
		}
		return arr[top--];
	}
}

public class Quiz03_2 {
	public static void main(String[] args) {
		ArrayStack2 stack = new ArrayStack2(4);
		stack.push(20);
		stack.push(20);
		stack.push(10);
		stack.push(4);
		stack.push(33);

		System.out.println(stack.peek());

		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
		System.out.println("pop 실행 : " +stack.pop());
	}
}
