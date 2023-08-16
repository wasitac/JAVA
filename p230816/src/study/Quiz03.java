package study;

class Queue {
	int front = -1, rear = -1;
	char[] Q = null;

	Queue(int size) {
		Q = new char[size];
	}

	void enQueue(char c) {
		if (rear == Q.length - 1)
			System.exit(0);
		else {
			Q[++rear] = c;
		}
	}

	void deQueue() {
		if (front == rear)
			System.exit(0);
		else {
			front++;
		}
	}

	char peek() {
		return Q[rear];
	}

	void printQueue() {
		for (int i = front + 1; i <= rear; i++)
			System.out.printf("%3c", Q[i]);

		System.out.println();
	}
}

public class Quiz03 {

	public static void main(String[] args) {
		Queue q = new Queue(5);
		System.out.print("삽입 A >>");
		q.enQueue('A');
		q.printQueue();

		System.out.print("삽입 B >>");
		q.enQueue('B');
		q.printQueue();

		System.out.print("삭제   >>");
		q.deQueue();
		q.printQueue();

		System.out.print("삽입 C >>");
		q.enQueue('C');
		q.printQueue();

		System.out.println("peek item : " + q.peek());

		System.out.print("삭제   >>");
		q.deQueue();
		q.printQueue();

		System.out.print("삭제   >>");
		q.deQueue();
		q.printQueue();
	}

}
