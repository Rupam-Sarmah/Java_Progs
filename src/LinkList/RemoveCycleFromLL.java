package LinkList;
/*
 * How will you remove a cycle from a linked list?
 */
class ListNode{
	int val;
	ListNode next;
	public ListNode(int val) {
		this.val=val;
		this.next=null;
	}
}
public class RemoveCycleFromLL {
	public void removeCycle(ListNode head) {
		if(head==null || head.next==null) {
			return;
		}
		ListNode slow=head;
		ListNode fast=head;
		while(fast !=null || fast.next!=null) {
			slow=slow.next;
			fast= fast.next.next;
			if(slow==fast) { // it will break if cycle found and coonfirm the cycle
				break;
			}
		}
		if(fast!=slow) {// this code will execute if no cycle and return empty.
			return;
		}
		//search for cycle and assign null on cycle point.
		slow=head;
		while(slow.next!=fast.next) {
			slow=slow.next;
			fast=fast.next;
		}
		fast.next=null;
		
	}

	public static void main(String[] args) {
		RemoveCycleFromLL remove = new RemoveCycleFromLL();
		/*is required to create an instance of the RemoveCycleFromLL class. 
		 * This instance is then used to call the removeCycle method, which removes the cycle from the linked list.
		 * 
		 */
		ListNode ll = new ListNode(1);
		ll.next=new ListNode(4);
		ll.next.next= new ListNode(6);
		ll.next.next.next = new ListNode(10);
		ll.next.next.next.next=ll.next; //cycle
		
		remove.removeCycle(ll);
		
		ListNode current = ll;
		System.out.print("Linked List after removing the cycle: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }

	}

}
