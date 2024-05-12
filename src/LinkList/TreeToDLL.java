package LinkList;
/*
 * How will you convert a binary tree into a doubly-linked list?
 * https://www.interviewbit.com/linked-list-interview-questions/
 */
class TreeNode{
	int val;
	TreeNode left, right;
	public TreeNode(int val) {
		this.val=val;
		left=null;
		right=null;
	}
}
class DllNode{
	int val;
	DllNode prev,next;
	public DllNode(int val) {
		this.val=val;
		prev=null;
		next=null;
	}
}
public class TreeToDLL {
	TreeNode root;
	DllNode head, tail;
	
	public TreeToDLL() {
		root=null;
		head=null;
		tail=null;
	}
	
	public void btToDll(TreeNode node) {
		if(node ==null) {
			return ;
		}
		btToDll(node.left);
		
		DllNode newNode= new DllNode(node.val);
		
		if(head ==null) {
			head=newNode;
		}else {
			tail.next=newNode;
			newNode.prev=tail;
		}
		tail = newNode;
		
		btToDll(node.right);
	}
	
	public void display() {
		DllNode current = head;
		System.out.print("Doubly Linked List: ");
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
	}
	

	public static void main(String[] args) {
		TreeToDLL ttd = new TreeToDLL();
		ttd.root = new TreeNode(1);
		ttd.root.left = new TreeNode(3);
		ttd.root.right = new TreeNode(5);
		ttd.root.left.left = new TreeNode(7);
		ttd.root.left.right= new TreeNode(9);
		
		ttd.btToDll(ttd.root);
		ttd.display();
	}

}
