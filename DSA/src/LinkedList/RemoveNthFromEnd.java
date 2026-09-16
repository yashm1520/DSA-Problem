package LinkedList;

public class RemoveNthFromEnd {
	
	 
	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	     ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	
	  public ListNode removeNthFromEnd(ListNode head, int n) {
	        if(head.next==null){
	        return null;
	        }
	        if(head.next==null){
	        return null;
	        }
	        ListNode slow=head;
	        ListNode fast=head; 
	        ListNode prev=null;

	      for(int i=1;i<=n;i++) {
	        fast=fast.next;
	      }
	      while(fast!=null){
	        fast=fast.next;
	        prev=slow;
	        slow=slow.next;
	      }
	      if(prev==null){
	        return head.next;
	      }
	   
	      prev.next=slow.next;

	      return head;

	    }


}
