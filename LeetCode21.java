package suanfa;

public class LeetCode21 {

    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1==null&&l2==null){
            return null;
        }
        if (l1==null){
            return l2;
        }
        if (l2==null){
            return l1;
        }
        ListNode result=new ListNode(0);
        ListNode pre=result;
        while(l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                pre.next=l1;
                l1=l1.next;
            }
            else {
                pre.next=l2;
                l2=l2.next;
            }
//            if (l2.val<l1.val){
//                pre.next=l2;
//                l2=l2.next;
//
//            } 替换28-31行，报错？？？（java.lang.NullPointerException）
//              if else 二者选一执行，
//              而两个if，都会进行判断，第二个if判断，l1发生了变换

            pre=pre.next;

        }

        if (l1!=null){
            pre.next=l1;
        }
        if (l2!=null){
            pre.next=l2;
        }
        return result.next;

    }
}



