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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode extra = new ListNode(-1);
        ListNode curNode = extra;
        while(list1!=null && list2!= null){
            
            if( list1.val <=list2.val){
                curNode.next = new ListNode(list1.val);
                curNode = curNode.next;
                list1 = list1.next;
                
            }else {
               curNode.next = new ListNode(list2.val);
                curNode = curNode.next;
                list2 = list2.next;
            }
        }
        curNode.next = list1 == null ? list2 : list1;
        return extra.next;
    }
}