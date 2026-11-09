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
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null){
            return head;
        }
        ListNode a=head;
ListNode b=head.next;
int div=gcd(a.val,b.val);
while(b!=null){
    div=gcd(a.val,b.val);
    ListNode temp=new ListNode(div);
    temp.next=b;
    a.next=temp;
    a=a.next.next;
    b=a.next;

}
return head;
        
    }
}