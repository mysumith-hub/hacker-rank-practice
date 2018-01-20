package algorithms.implementation;

public class DetectACycle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head = new Node(2);
		Node next = new Node(3);
		head.next=next;
		Node next2 = new Node(4);
		head.next.next = next2;
		Node next3 = new Node(5);
		head.next.next.next = next3;
		System.out.println(hasCycle(head));
	}

	static boolean hasCycle(Node head) {
		int nodes[] = new int[100];
		if (head == null) {
			return false;
		}
//		nodes[head.data] = 1;
		Node current = head;
		while (current != null) {
			if(nodes[current.data] == 1){
				return true;
			}
			nodes[current.data] = 1;
			current = current.next;
		}
		return false;
	}

}

class Node {
	int data;
	Node next;
	public Node(int data){
		this.data = data;
	}
}
