package ��ϰ;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * ��һ�ö������������һ���㷨�����ղ�δ�ӡ��ö�������
�����������ĸ����root���뷵�ش�ӡ������������ÿһ��һ��������д���
���������˳���ղ����������£���ÿһ���������Ԫ�ذ��մ����������С���֤�����С�ڵ���500
 * @author chenchen30
 *
 */
public class ���ղ��ӡ������ {

	 public int[][] printTree(TreeNode root) {
	        // write code here
		 Queue<TreeNode> queue = new LinkedBlockingQueue<>();
		 queue.offer(root);
		 while(!queue.isEmpty()){
			 root = queue.poll();
			 if(root!=null){
				int val =  root.val;
			 }
		 }
		 return null;
	 }
}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}