package LinkedList;

public class Addtwonumber {
	
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
	 public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	        int carry=0;
	    
	        int remainder=0;

	        ListNode dummynode=new ListNode(0);
	         ListNode current=dummynode;

	       while(l1!=null||l2!=null){
	         int sum=0;
	        
	        if(l1!=null){
	            sum+=l1.val;
	            l1=l1.next;
	        }
	         if(l2!=null){
	            sum+=l2.val;
	            l2=l2.next;
	        }
	        sum+=carry;
	        remainder=sum%10;
	        carry=sum/10;
	        remainder=sum%10;
	      
	        current.next=new ListNode(remainder);
	      current=  current.next;
	        
	             

	         }
	         if(carry==1){
	             ListNode lastnode=new ListNode(1);
	             current.next=lastnode;
	         }
	        return dummynode.next;
	       
	    }
}
