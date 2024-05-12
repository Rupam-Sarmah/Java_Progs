package LinkList;
/*
 * merge two LL with unique value only
 */
import java.util.HashSet;

class SListNode{
	int val;
	SListNode next;
	public SListNode(int val) {
		this.val=val;
		this.next=null;
	}
}

public class MergeTwoLL {
	public SListNode findsimillar(SListNode l1,SListNode l2) {
		HashSet<Integer> set =new HashSet<>();
		SListNode r1=null;
		SListNode r2=null;
		
		SListNode current=l1;
		while(current!=null) {
			set.add(current.val);
			current=current.next;
		}
		current=l2;
		while(current!=null) {
			if(set.contains(current.val)) {
				if(r1==null) {
					r1=new SListNode(current.val);
					r2=r1;
				}else {
					r2.next=new SListNode(current.val);
					r2=r2.next;
				}
			}
			current=current.next;
		}
		return r1;
	}

	public static void main(String[] args) {
		SListNode l1 = new SListNode(1);
        l1.next = new SListNode(2);
        l1.next.next = new SListNode(3);

        SListNode l2 = new SListNode(2);
        l2.next = new SListNode(3);
        l2.next.next = new SListNode(4);

        MergeTwoLL finder = new MergeTwoLL();
        SListNode result = finder.findsimillar(l1, l2);

        // Display the result
        System.out.print("Similar elements: ");
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

	}

}
