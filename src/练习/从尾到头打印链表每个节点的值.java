package ��ϰ;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class ��β��ͷ��ӡ����ÿ���ڵ��ֵ {

	public static void main(String[] args) {
		
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList list = new ArrayList();
        Stack<Integer> stack = new Stack<>();
        if(listNode != null){
            while(listNode!=null){
            	stack.add(listNode.val);
            	listNode = listNode.next;
            }
        }
        while(!stack.isEmpty()){
        	list.add(stack.pop());
        }
        return list;
    }
}
 class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }