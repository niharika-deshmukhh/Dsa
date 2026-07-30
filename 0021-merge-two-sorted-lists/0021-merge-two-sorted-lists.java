/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
     ListNode  head=null;
   ListNode tail=null;
    public void insert(int val){
        ListNode temp=new ListNode(val);
        if(head==null){
            head=tail=temp;
        }
        else{
            tail.next=temp;
            tail=temp;
        }
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        while(list1!=null&&list2!=null){
        if(list1.val>=list2.val){
            insert(list2.val);
            list2=list2.next;}
        else{
            insert(list1.val);
             list1=list1.next;
        }
       
        
        }
        while(list1!=null){
            insert(list1.val);
            list1=list1.next;

        }
        while(list2!=null){
            insert(list2.val);
            list2=list2.next;

        }
        return head;



        
    }
}