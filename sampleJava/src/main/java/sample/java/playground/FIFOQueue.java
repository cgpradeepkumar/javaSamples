package sample.java.playground;

import java.util.NoSuchElementException;
import java.util.Queue;

public class FIFOQueue /*implements Queue*/ {

	// put your name as the value of the signature.
	String signature = "name";

	Node head = new Node(null);
	Node pointer = head;
	Node first;
	Node last;
	Node prev;
	Node curr;

	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			this.next = null;
		}

	}

	/*@Override
	public void offer(Process p) {

		if (head == null) {
			head = new Node(p);
			first = head;
			last = head;

		}

		else {

			Node oldLast = last;
			Node newNode = new Node(p);

			last = newNode;
			oldLast.next = last;

		}

	}

	@Override
	public Process poll() {

		if (isEmpty())
			throw new NoSuchElementException();

		Node oldPointer = first;

		first = first.next;
		head = first;

		return oldPointer.process;
	}

	@Override
	public boolean isEmpty() {

		return head == null;

	}

	@Override
	public String getSignature() {
		return signature;
	}*/

}