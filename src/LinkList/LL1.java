package LinkList;

class Node{
	int val;
	Node next;
	Node(int val){
		this.val=val;
	}
}
public class LL1 {
	/*
	 * How will you find the middle element of a singly linked list without iterating the list more than once?
	 */
	public static Node findTheMiddle(Node head) {
		//null check
		if(head == null || head.next==null) {
			return head;
		}
		
		//create two pointers
		Node slow=head;
		Node fast=head;
		
		//iteration
		while(fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		
		//return slow pointer
		return slow;
	}
	

	public static void main(String[] args) {
		//Create one ll and insert value
		/*
		 * Node head= new Node(1);
		head.next=new Node(3);
		head.next.next = new Node(5);
		head.next.next.next= new Node(10);
		 */
		
		//add nodes using loop
		Node head = new Node(1);
		Node current=head;
		int[] values= {3,4,6,8,9,22,56,77};
		for(int i:values) {
			current.next= new Node(i);
			current=current.next;
		}
		
		Node middle= findTheMiddle(head);
		System.out.print(middle.val);

	}

}
